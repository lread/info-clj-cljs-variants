(ns demo-clj-variants.cljs)

(defmacro m1 [] #?(:clj `(identity "JVM cljs")
                   :cljs `(identity "self-hosted cljs")))
