(ns demo-clj-variants.entry
  #?(:clj (:require [demo-clj-variants.clj :refer [m1]])
     :cljs (:require-macros [demo-clj-variants.cljs :refer [m1]])))

(defn testing123 []
  (m1))
