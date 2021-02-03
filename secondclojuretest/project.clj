(defproject secondclojuretest "0.1.0-SNAPSHOT"
  :description "First explorations with Clojure"
  :url "http://www.sincerelycontent.com"
  :license {:name "(c) Hubert Schipkowski"
            :url "https://www.sincerelycontent.com"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot secondclojuretest.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})


"Hello Clojure"
"Hello World"
"This is fantastic!"
"I love it!"

42 ; that's the number
1/3
42/2
2r1100 ; different number systems are very easy to write
7r4352
\h 
#" [0 | 1]" ; RegExs! Great! Thank's to java.util.regex.Pattern

(+ 23123 34234) ; prefix notation, I love it!

; 4 collection data structure types:

'(1 3 4) ; list
[2 1 4] ; vector
#{2 3 5} ; set
{:a 1, :b 4} ; map

'x
'(1 2 3)
(+ 3 4)
(+ *1 7)

(+ *1 7)

(require '[clojure.repl :refer :all])
(doc +)

(doc doc)

(apropos "+")

(dir clojure.core)

(dir clojure.repl)

(source dir)

(source +)

(doc +)

(def x 48)

(+ x x)

(def y 345)
(+ x y)

(println "y plus x is: " (+ y x))


(+ 7654 1234)
(/ (* (+ 7 3) (+ 4 5)) 10) ; a wonderful expression tree...





