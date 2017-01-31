# test-record

Minimal test case for bug related to clojure test and defrecord.

It shows a strange situation where an assertion related to a record only passes
if it is the last assertion.

## Usage

1. `cider-jack-in`
2. `, e b` in core_test.clj
3. `, t t` -> PASS
4. `, e b` in core.clj
5. `, t t` -> FAIL
6. Comment third assertion
7. `, t t` -> PASS
8. Uncomment third assertion
9. `, t t` -> FAIL

## License

Copyright © 2017 Jean-Sebastien A. Beaudry

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
