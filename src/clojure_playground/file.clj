(ns clojure-playground.file
  (:require [clojure.java.io :as io]))

(defn write-to-file
  [file text]
  (with-open [wrtr (io/writer file)]
    (.write wrtr text)))

(write-to-file "test.txt" "indra\n")

(defn read-from-file [file]
  (try
    (println (slurp file))
    (catch Exception e
      (println "Error:" (.getMessage e)))))


(read-from-file "test.txt")

(defn append-to-file
  [file text]
  (with-open [wrtr (io/writer file :append true)]
    (.write wrtr text)))

(append-to-file "test.txt" "brata\n")

(defn read-line-from-file
  [file]
  (with-open [rdr (io/reader file)]
    (doseq [line (line-seq rdr)]
      (println line))))

(read-line-from-file "test.txt")