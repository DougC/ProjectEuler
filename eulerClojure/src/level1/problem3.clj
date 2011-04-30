(ns level1.problem3
  (:use clojure.contrib.math))

(defn prime? [n]
  (empty? (for [f (range 2 (long (/ n 2))) :when (= (mod n f) 0)] f)))

; For every factor that is greater than sqrt(n) there must be a factor that is less than sqrt(n)
; So find all of the factors less than sqrt(n) and pair it up with the corresponding factor > sqrt(n)
; Then flatten the resulting sequence to build a simple list, and sort it
(defn factors [n]
  (sort (flatten (for [f (range 2 (long (sqrt n))) :when (= (mod n f) 0)] [f (/ n f)]))))

(last (filter prime? (factors 600851475143)))


  

