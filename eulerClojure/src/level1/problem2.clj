(ns level1.problem2)

(defn fibo [] (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(reduce + 
  (for [num (filter even? (fibo)) :while (< num 4000000)] 
    num))