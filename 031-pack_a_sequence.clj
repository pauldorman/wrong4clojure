;; Pack a Sequence
;;
;; Write a function which packs consecutive duplicates into sub-lists.  (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))  (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))  (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
;;
;; test cases:
;;   (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
;;   (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
;;   (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))

#(partition-by identity %1)