(ns clojure-playground.struct)


(defn struct-map-ex []
  (let [cust1 {:Name "indra" :Phone "08211111111"}
        cust2 {:Name "adi" :Phone "12345"}]
    (println cust1)
    (println cust2)))

(struct-map-ex)

(defrecord Customer [Name Phone])

(defn record-ex []
  ;; Create record instances (like calling a constructor)
  (let [cust1 (->Customer "indra" "08211111111")
        cust2 (map->Customer {:Name "adi" :Phone "12345"})]
    
    (println (:Name cust1))
    (println (:Phone cust2))

    (println cust1)
    (println cust2)

    (println (assoc cust1 :Phone "99999"))))

(record-ex)
