(defproject pasty "0.1.0-SNAPSHOT"
  :description "A pastebin clone"
  :url "https://www.github.com/colonelrascals/pasty"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.stuartsierra/component "0.3.2"]
                 [aleph "0.4.6"]
                 [hiccup "1.0.5"]
                 [bidi "2.1.3"]]
  :main pasty.main
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
