(ns java.time.format
  (:require [cljsjs.js-joda]))

(def DateTimeFormatter (.. js/JSJoda -DateTimeFormatter))
(def ResolverStyle (.. js/JSJoda -ResolverStyle))
