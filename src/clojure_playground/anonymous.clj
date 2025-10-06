(ns clojure-playground.anonymous)

(map #(* % 3) (range 1 10))

(defn custom-multipler
  [mul]
  #(* % mul))

(def mul-by-3 
  (custom-multipler 3))

(mul-by-3 10)