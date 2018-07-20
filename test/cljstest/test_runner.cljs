(ns cljstest.test-runner
 (:require [doo.runner :refer-macros [doo-tests]]
           [cljstest.core-test]
           [cljs.nodejs :as nodejs]))

(try
  (.install (nodejs/require "source-map-support"))
  (catch :default _))

(doo-tests
 'cljstest.core-test)
