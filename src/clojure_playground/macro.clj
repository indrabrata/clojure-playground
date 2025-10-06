(ns clojure-playground.macro)

(defmacro discount
  ([cond s1 s2]
   (list `if cond s1 s2)))

(discount (> 25 67) (println "Yeay") (println "Nah"))

(defmacro reg-math
  [calc]
  (list (second calc) (first calc) (last calc))
  )

(reg-math (2 + 7))

(defmacro do-more
  [cond  & body]
  (list `if cond (cons `do body)))

(do-more (< 1 2) (println "Indra") (println "Brata"))

(defmacro do-more-2
  [cond & body]
  `(if ~cond (do ~@body) ))

(do-more-2 (< 1 2) (println "Indra") (println "Brata"))

