(ns clojure-playground.math)

(+ 1 2 3 4)
(- 1 2 3 4)
(* 10 1)
(mod 10 2)

(println (inc 3))
(println (dec 3))

(println (Math/abs -1))
(println (Math/cbrt -1))
(println (Math/sqrt 16))
(println (Math/max 16 10))
(println (Math/min 16 10))

(println (Math/pow 9 3))
(println (Math/hypot 3 4))

(println (rand-int 10))
(println (reduce + [1 2 3]))


