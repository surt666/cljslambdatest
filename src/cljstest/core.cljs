(ns cljstest.core
  (:require [cljs-lambda.util :as lambda]
            [cljs-lambda.context :as ctx]
            [cljs-lambda.macros :refer-macros [deflambda]]
            [cljs.reader :refer [read-string]]
            [cljs.nodejs :as nodejs]
            [cljs.core.async :as async])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(deflambda magic [input ctx]
  input)
