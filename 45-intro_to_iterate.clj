;; Intro to Iterate
;;
;; The iterate function can be used to produce an infinite lazy sequence.  (= __ (take 5 (iterate #(+ 3 %) 1)))
;;
;; test cases:
;;   (= __ (take 5 (iterate #(+ 3 %) 1)))

