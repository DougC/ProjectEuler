(ns level1.problem4)

;(defn palindrome? [n]
;  (= (str n) (.toString (.reverse (StringBuilder. (str n))))))

(defn palindrome? [x]
  (= (seq (str x)) (reverse (str x))))
  
 
(reduce max (for [n (range 100 1000) m (range 100 1000) :when (palindrome? (* n m))] (* n m)))
