(defproject friendui-sql-example "0.0.2"
  :description "Example of using friendui-sql in a compojure app"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.3"]
                 [ring/ring-defaults "0.1.4"]
                 [enlive "1.1.5"] ; html templating
                 [vlacs/dossier "0.1.4"] ; enlive utils
                 [mysql/mysql-connector-java "5.1.35"]
                 [sventechie/friendui-sql "0.0.2-SNAPSHOT"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler friendui-sql-example.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
