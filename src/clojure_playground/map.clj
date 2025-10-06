(ns clojure-playground.map)

;; Map
;; Dynamic key
{"a" 1, "b" 2}
{"a" [1, 2], 1 2, { 1 2} 5}

(println (sorted-map 1 42 2 "indra" 3 "hi"))
(println (get (hash-map "a" "b" "c" "d") "a"))
(println (find (hash-map "a" "b" "c" "d") "a"))
(println (contains? (hash-map "a" "b" "c" "d") "a"))
(println (keys (hash-map "a" "b" "c" "d")))
(println (vals (hash-map "a" "b" "c" "d")))

(println (merge-with + (hash-map "a" "b") (hash-map "c" "d")))

