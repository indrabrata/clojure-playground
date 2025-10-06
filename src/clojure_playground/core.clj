(ns clojure-playground.core
  (:require
   [clojure-playground.common.utils :as utils]))

(defn -main
  [& args]
  (println "Hello, World!"   (utils/add 5 4))     ;; prints with newline
  (print "hello world!\n")      ;; instead of print, ensures newline
  (printf "%s\n" "hello world!") ;; proper format string with newline
  
  (if (= 1 2 ) (println "hey") (println "jude"))
  (- (+ 7 5)  (* 3 8 5))
  ) 

