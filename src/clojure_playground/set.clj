(ns clojure-playground.set)

#{1, 2, 3 ,4 ,5}
(set [1 2 3 4 5 5])

(println (set `(1 2 3 4)))
(println (set (quote (1 2 3 4))))

(println (get (set `(1 2 3 4)) 1))
(println (conj (set `(1 2 3 4)) 10))
(println (disj (set `(1 2 3 4)) 4))