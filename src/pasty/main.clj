(ns pasty.main
  (:require [pasty.system :refer [init-system start!]]))


(defn -main [&args]
  (init-system)
  (start!))
