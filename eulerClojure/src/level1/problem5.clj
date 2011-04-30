(ns level1.problem5
  (:use clojure.contrib.math))

(defn factors [n]
  (sort (flatten (for [f (range 2 (+ (long (sqrt n)) 1)) :when (= (mod n f) 0)] [f (/ n f)]))))

(defn prime? [n]
  (empty? (for [f (factors n) :when (= (mod n f) 0)] f)))

(defn primes-up-to [n]
  (filter prime? (range 2 (+ 1 n))))

(defn pow [n p]
  (if
    (= p 1) n
    (* n (pow n (- p 1)))))
  
; Find the highest power of n that is less than m. E.g. if n is 2 and m is 20 then
; the result is 16. I'm ranging from 1 to m, which is excessive. I only need to go up to
; log(m) but I can't find a log function! However, the for evaluation will stop when the
; the right value is reached so in practice we're never going to overdo it.
(defn highest-power-below [n m]
  (last (for [p (range 1 m) :while (< (pow n p) m)] (pow n p))))

(reduce * (sort (for [p (primes-up-to 20)] (highest-power-below p 20))))
