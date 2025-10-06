(ns clojure-playground.loop)

(defn one-to-x
  [x]
  (def i (atom 1))
  (while (<= @i x)
    (do
      (println "Curr i : " @i)
      (swap! i inc))))

(one-to-x 10)

(defn double-to-x
  [x] 
  (dotimes [i x]
    (println (* i 2))))

(double-to-x 10)

(defn triple-to-x
  [x y]
  (loop [i x]
    (when (< i y)
      (println (* i 3))
      (recur (+ i 1)))))

(triple-to-x 1 5)

(defn print-list
  [& nums]
  (doseq [x nums]
    (println x)))

(print-list 1 2 3)