(defproject learnclojure "0.1.0-SNAPSHOT"
  :description "Exploring Clojure"
  :url "https://sincerelycontent.com"
  :license {:name "(c) Hubert Schipkowski)"
            :url "https://www.sincerelycontent.com"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot learnclojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})

42;
(+ 42 8)


(- 32 192)



(defn greet [name] (str "Hello, " name))

(greet "Hubert")

(defn doubler [zahl1 zahl2] (* (+ zahl1 zahl2) 2))
(defn singleDoubler [zahl] (* zahl 2))
(doubler 2 3)
(singleDoubler (doubler 2 3))
(- 560 3)

(doubler (- (singleDoubler(doubler 4 6)) 30) 45)

#(+ 6 %)
#([6])


