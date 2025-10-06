(ns clojure-playground.destruct)

(defn destruct
  []
  (def vecVals [1 2 3 4 5])
  (let [[one two & the-rest] vecVals]
    (println one two the-rest test)))

(destruct)
