(ns pasty.store
  (:require [com.stuartsierr.component :as component]))

(defn add-new-paste [store content]
  (let [uuid (.toString (java.util.UUID/randomUUID))]
    (swap! (:data store) assoc (keyword uuid) {:content content})
    uuid))

(defn get-paste-by-uuid [store uuid]
  ((keyword uuid) @(:data store)))
