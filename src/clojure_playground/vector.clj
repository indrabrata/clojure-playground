(ns clojure-playground.vector)

(def my-vector [1, 2, 3, 4, 5])
(get my-vector 0)

(println (vector 1 2 3 4))

(def v [1 2 3 4 5 6 7])

(get v 1)

(subvec v 1 5)

;; map function
;; inc is increment
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

(take-while neg? [-1 0 1])
(drop-while neg? [-1 0 1])
