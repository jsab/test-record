# test-record

Minimal test case for bug related to clojure test and defrecord.

It shows a strange situation where an assertion related to a record only passes
if it is the last assertion.

## Usage

1. `M-x cider-jack-in`
2. `M-x cider-eval-buffer` in core_test.clj
3. `M-x cider-test-run-test` -> PASS
4. `M-x cider-eval-buffer` in core.clj
5. `M-x cider-test-run-test` -> FAIL
6. Comment last assertion
7. `M-x cider-eval-buffer` in core_test.clj
8. `M-x cider-test-run-test` -> PASS
9. Uncomment last assertion
10. `M-x cider-eval-buffer` in core_test.clj
11. `M-x cider-test-run-test` -> FAIL
12. Goto 6.

## License

Copyright © 2017 Jean-Sebastien A. Beaudry

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
