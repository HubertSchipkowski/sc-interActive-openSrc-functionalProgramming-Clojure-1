(defproject secondclojuretest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
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

