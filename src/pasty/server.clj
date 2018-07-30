(ns pasty.server
  (:require [com.stuartsierr.component :as component]
            [bidi.ring :refer [make-handler]]
            [aleph.http :as http]
            [ring.util.response :as res]
            [ring.util.request :as req]
            [ring.middleware.params :refer [wrap-params]]
            [pasty.view :as view]
            [pasty.store :as store]))

(defn handle-post [store request]
  (let [content (get (:form-params request) "content")
        uuid (store/add-new-paste store content)]
    (res/redirect (str "/" uuid) :see-other)))

(defn handle-index [])

(defn index-handler [])

(defn paste-handler [])

(defn handler [])

(defn app [])

(defrecord HttpServer [server])

(defn make-server [])
