(ns test-record.core-test
  (:require [clojure.test :refer :all]
            [test-record.core :refer :all]))

(deftest a-test
  (is (= 1 1))
  (is (= 2 2))
  (is (string? "Here the assertion is not the last and it fails."))
  (is (= test_record.core.MyRecord (type (map->MyRecord {}))))
  (is (string? "Comment/Uncomment this assertion to have previous assertion pass/fail.")))

(deftest b-test
  (is (= 1 1))
  (is (= 2 2))
  (is (string? "Here the assertion is the last and it passes."))
  (is (= test_record.core.MyRecord (type (map->MyRecord {})))))
