(ns clojure-playground.core
  (:gen-class))

(defn -main
  [& args]
  (println "Hello, World!")     ;; prints with newline
  (print "hello world!\n")      ;; instead of print, ensures newline
  (printf "%s\n" "hello world!")) ;; proper format string with newline
