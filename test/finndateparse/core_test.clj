(ns finndateparse.core-test
  (:require [clojure.test :refer :all]
            [finndateparse.core :refer :all]))


(deftest coming-weekdays
  (testing "Mon"
    (is (= (finnish-date "ensi maanantai") {:tense :coming :date :Mon}))
    (is (= (finnish-date "ensi maanantaina") {:tense :coming :date :Mon}))
    (is (= (finnish-date "ensi ma") {:tense :coming :date :Mon}))
    (is (= (finnish-date "tuleva maanantai") {:tense :coming :date :Mon}))
    (is (= (finnish-date "seuraava maanantai") {:tense :coming :date :Mon})))
  (testing "Tue"
    (is (= (finnish-date "ensi tiistai") {:tense :coming :date :Tue}))
    (is (= (finnish-date "ensi tiistaina") {:tense :coming :date :Tue}))
    (is (= (finnish-date "ensi ti") {:tense :coming :date :Tue}))
    (is (= (finnish-date "tuleva tiistai") {:tense :coming :date :Tue}))
    (is (= (finnish-date "seuraava tiistai") {:tense :coming :date :Tue})))
  (testing "Wed"
    (is (= (finnish-date "ensi keskiviikko") {:tense :coming :date :Wed}))
    (is (= (finnish-date "ensi keskiviikkona") {:tense :coming :date :Wed}))
    (is (= (finnish-date "ensi ke") {:tense :coming :date :Wed}))
    (is (= (finnish-date "ensi pikkulauantai") {:tense :coming :date :Wed}))
    (is (= (finnish-date "ensi pikkulauantaina") {:tense :coming :date :Wed}))
    (is (= (finnish-date "tuleva keskiviikko") {:tense :coming :date :Wed}))
    (is (= (finnish-date "seuraava keskiviikko") {:tense :coming :date :Wed})))
  (testing "Thu"
    (is (= (finnish-date "ensi torstai") {:tense :coming :date :Thu}))
    (is (= (finnish-date "ensi torstaina") {:tense :coming :date :Thu}))
    (is (= (finnish-date "ensi to") {:tense :coming :date :Thu}))
    (is (= (finnish-date "tuleva torstai") {:tense :coming :date :Thu}))
    (is (= (finnish-date "seuraava torstai") {:tense :coming :date :Thu})))
  (testing "Fri"
    (is (= (finnish-date "ensi perjantai") {:tense :coming :date :Fri}))
    (is (= (finnish-date "ensi perjantaina") {:tense :coming :date :Fri}))
    (is (= (finnish-date "ensi pe") {:tense :coming :date :Fri}))
    (is (= (finnish-date "tuleva perjantai") {:tense :coming :date :Fri}))
    (is (= (finnish-date "seuraava perjantai") {:tense :coming :date :Fri})))
  (testing "Sat"
    (is (= (finnish-date "ensi lauantai") {:tense :coming :date :Sat}))
    (is (= (finnish-date "ensi lauantaina") {:tense :coming :date :Sat}))
    (is (= (finnish-date "ensi la") {:tense :coming :date :Sat}))
    (is (= (finnish-date "tuleva lauantai") {:tense :coming :date :Sat}))
    (is (= (finnish-date "seuraava lauantai") {:tense :coming :date :Sat})))
  (testing "Sun"
    (is (= (finnish-date "ensi sunnuntai") {:tense :coming :date :Sun}))
    (is (= (finnish-date "ensi sunnuntaina") {:tense :coming :date :Sun}))
    (is (= (finnish-date "ensi su") {:tense :coming :date :Sun}))
    (is (= (finnish-date "tuleva sunnuntai") {:tense :coming :date :Sun}))
    (is (= (finnish-date "seuraava sunnuntai") {:tense :coming :date :Sun}))))
