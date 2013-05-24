;; Compress a Sequence
;;
;; Write a function which removes consecutive duplicates from a sequence.  (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")  (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))  (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
;;
;; test cases:
;;   (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;;   (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;;   (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

#(map first (partition-by identity %1))