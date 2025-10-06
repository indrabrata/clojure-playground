(ns clojure-playground.function)

(def my-var 1)
(println my-var)

(defn say-hello
  [name]
  (println "Hy " name))

(say-hello "indra")

;; There is no return in clojure, it alwas the latest argument will be return
(def my-fn (fn []
             (println (+ 1 2))
             "calculated"))
(println my-fn)

(def add (fn [x y] (+ x y)))
(println (add 1 2))

;; Function scope
(let [a 1]
  (println a)
  (let [a 10]
    (println a)))

(let [x 1 y 2 result (add x y)]
  (println result))

(defn sum-more
  ([x y] (+ x y))
  ([x y z] (+ x y z)))


(sum-more 1 2)
(sum-more 1 2 3)

(defn hello-you
  [name]
  (str "Hello " name))

(defn hello-all
  [& names]
  (map hello-you names))

(hello-all ["indra" "adi" "brata"])