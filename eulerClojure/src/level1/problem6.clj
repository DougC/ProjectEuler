(ns level1.problem6)


(defn square [n] (* n n))

(defn problem6 [n]
  (- (square (reduce + (range 1 (+ 1 n)))) (reduce + (map square (range 1 (+ 1 n))))))
 
 