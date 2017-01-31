(ns test-record.core-test
  (:require [clojure.test :refer :all]
            [test-record.core :refer :all]))

(deftest a-test
  (is (= 1 1))
  (is (= 2 2))
  (is (= 3 3))
  (is (= test_record.core.MyRecord (type (map->MyRecord {:id 1}))))
  (is (string? "Comment/Uncomment this assertion to have previous assertion pass/fail.")))
