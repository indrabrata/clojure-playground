(ns clojure-playground.core
  (:require
   [clojure-playground.common.utils :as utils]))

(defn -main
  [& args]
  (println "Hello, World!"   (utils/add 5 4))     ;; prints with newline
  (print "hello world!\n")      ;; instead of print, ensures newline
  (printf "%s\n" "hello world!") ;; proper format string with newline
  
  (if (= 1 2 ) (println "hey") (println "jude"))
  (- (+ 7 5)  (* 3 8 5))
  ) 

(def my-var 1)
(println my-var)

;; There is no return in clojure, it alwas the latest argument will be return
(def my-fn ( fn []
  (println (+ 1 2))
  "calculated")
  )
(println my-fn)

(def add (fn [x y] (+ x y)))
(println (add 1 2))

;; Function scope
(let [a 1]
  (println a)
  (let [a 10]   (println a))
  )

(let [x 1 y 2 result (add x y)]
  (println result)
  )

;; Vector
(def my-vector [1, 2, 3, 4, 5])
(get my-vector 0)

;; Map
;; Dynamic key
{"a" 1, "b" 2}
{"a" [1, 2], 1 2, { 1 2} 5}

;; Set
#{1, 2, 3 ,4 ,5}
(set [1 2 3 4 5 5])

(def v [1 2 3 4 5 6 7])

;; map function
;; inc in increment
;; Do the calculatiton in synchronous
(map (fn [e1 e2] 
       (+ e1 e2)
       ) v v)
;; Do the calculation in pararel
(pmap (fn [e1 e2] 
       (+ e1 e2)
       ) v v)


;; Filter
(filter (fn [element] 
          (even? element)) v )

;; Remove
(remove (fn[e]
          (even? e)) v)

;; Reduce
;; The 0 is start of the accumulator
;; Have control of the reduce logic
(reduce (fn [acc e] (+ e acc)) 0 v)
(reduce (fn [acc e] (conj acc (+ e e)))[] v)
(reduce (fn [acc e] (let [result (conj acc (+ e e))] (println result) result)) [] v)
;; Implement some kind of logic to all vector
(apply + v)

;; Group By
(group-by (fn [e]
            (
             even? e
            )) v)

;; Count
(count v)

;; Frequency
(frequencies v)

;; Static Method
;; We can access java functionality
(Integer/parseInt "123")
(String. "string")
(def i (Integer. 1))

;; Call instance value of the i
(.intValue i)

;; Future just create process in another thread
(do (future 
      (Thread/sleep 1000)
      (println "Hi from thread")) 
    (println "end"))

;; Atoms -> avoid race condition
(def a (atom 0))
(do (future (swap! a inc)) (future (swap! a inc)))
(deref a)