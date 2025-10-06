(ns clojure-playground.list)

(println (list 1 2 "dog"))

;; Remove first element
(println (rest (list 1 2 3 4 5)))

;; Get Element
(println (nth (list 1 2 3 4) 1))

;; Adding value
(println (list* 1 2 [3 4]))

(println (conj (list 1 2 3 4) 6))

(println (cons 6 (list 1 2 3 4)))