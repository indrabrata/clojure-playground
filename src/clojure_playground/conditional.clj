(ns clojure-playground.conditional)

(defn can-vote
  [age]
  (if (>= age 18)
    (println "Yes, you can vote")
    (println "No, you can't vote")))

(can-vote 10)

(defn can-do-more
  [age]
  (if (>= age 18)
    (do (println "You can drive")
        (println "You can vote")) 
    (println "You can't vote")))

(can-do-more 19)

(defn check-grade
  [n]
  (cond
    (and (< n 6) (> n 0)) (println "Nice work")
    (> n 7) (println "Good Job")
    :else (println "Unknown")))

(check-grade -1)

(defn when-ex
  [tof]
  (when tof 
    (println "its true")
    (println "its false")))

(when-ex true)