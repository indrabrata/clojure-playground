(ns clojure-playground.static)

;; Static Method
;; We can access java functionality
(Integer/parseInt "123")
(String. "string")
(def i (Integer. 1))

;; Call instance value of the i
(.intValue i)