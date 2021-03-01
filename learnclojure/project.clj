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

(* 3 4)

; nice expression trees:
(* (+ 2 5) (- (+ 2 2) 1)) 




(defn greet [name] (str "Hello, " name))

(greet "Timothy")

(defn doubler [zahl1 zahl2] (* (+ zahl1 zahl2) 2))
(defn singleDoubler [zahl] (* zahl 2))
(doubler 2 3)
(singleDoubler (doubler 2 3))
(- 560 3)

(doubler (- (singleDoubler(doubler 4 6)) 30) 45)


; it's all about nested functions and building (mutual) recursive function trees:

(defn suitcase [primaryvalue] ; framelevelone
  (fn [secondaryvalue] ; frameleveltwo
    (println primaryvalue secondaryvalue))) 

(def closure (suitcase "localvalue")) ; "closures" store localvalues for usage beyond their local scope:

(closure "still available")

[2,3,1] ; a nice vector

(def guitarDimensions ["nn","fz","sz","fb","ts","bz"])

(get guitarDimensions 0)
(get guitarDimensions 1)
(str (guitarDimensions 2))
(str (guitarDimensions 5))

(str (guitarDimensions 4))

["nn", (str (guitarDimensions 0))] ; great, a hard-coded String and a function, 
; that returns a String from a previouly defined other vector, side by side as vector components
; with, so to speak, no syntax cluttering around what is meant. Beautiful.
["fz", (str (guitarDimensions 1))]