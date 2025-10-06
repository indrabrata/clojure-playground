(ns clojure-playground.data-types
  (:require [clojure.string :as str]))

(def age 21)
(def name "indra")
(println name)

(println age)
(format "My Name %s and my age is %d" name age)
(format "Age is %04d" age)
;; def is definition (global)
(def number 10)


;; built in function to check
(nil? number)
(number? number)
(odd? number)
(even? number)
(pos? number)
(neg? number)

(def str1 "Adi")
(str/blank? str1)
(str/includes? str1 "di")


(def x "Indra")
(str/blank? x)
(str/includes? x "hi")
(str/index-of x "In")
(str/split x #"n")

(str/join " " ["Beruang", "Madu"])
(str/replace "I am 21" #"21" "22")
(str/upper-case "I am 21")
(str/lower-case "I am 21")
(str/trim "   1000    ")

