(ns clojure-playground.atom)

;; Future just create process in another thread
(do (future
      (Thread/sleep 1000)
      (println "Hi from thread"))
    (println "end"))

;; Atoms -> avoid race condition
(def a (atom 0))
(do (future (swap! a inc)) (future (swap! a inc)))
(deref a)

(defn atom-ex
  [x]
  (def atomEx (atom x))
  (add-watch atomEx :watcher
             (fn [key atom old-state new-state]
               (println "atomEx change from " old-state " to " new-state)))
  (println "1st x " @atomEx)
  (reset! atomEx 10)
  (println "2nd x " @atomEx)
  (swap! atomEx inc)
  (println "Increment X " @atomEx))

(atom-ex 5)

(defn agent-ex
  []
  (def ticket-sold (agent 0))
  (send ticket-sold + 15)
  (println)
  (println "Tickets " @ticket-sold)
  (send ticket-sold + 10)
  (await-for 100 ticket-sold)
  (println "Tickets " @ticket-sold)
  
  (shutdown-agents)
  )


(agent-ex)

