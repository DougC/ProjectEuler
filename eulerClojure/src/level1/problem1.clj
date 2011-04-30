
(apply + 
  (for [num (range 1 1000) :when (or 
                                   (= 0 (mod num 5))
                                   (= 0 (mod num 3)))] 
    num))

