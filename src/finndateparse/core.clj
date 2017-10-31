(ns finndateparse.core
  (:require #?(:clj  [instaparse.core :as insta :refer [defparser]]
               :cljs [instaparse.core :as insta :refer-macros [defparser]])))


(defparser finnish-date
   "<S> = (After Relativeday) | (Specifier? <Whitespace?> (Date | Relativeday))


    Whitespace = #'\\s+'
    After = 'yli'
    <Specifier> = Coming | Past
    Coming = 'tänä' | 'nyt' | 'tulevana' | 'ensi' | 'ens' | 'seuraavana'
    Past =  <'viime' | 'menneenä'>
    Yesterday = <'eilen'>
    Today = <'tänään'>
    Tomorrow = <'huomenna'>
    DayBeforeYesterday = <'toissapäivänä'>

    Mon = <'ma' | 'maanantai'>
    Tue = <'ti' | 'tiistai'>
    Wed = <'ke' | 'keskiviikko' | 'pikkulauantai'>
    Thu = <'to' | 'torstai'>
    Fri = <'pe' | 'perjantai'>
    Sat = <'la' | 'lauantai'>
    Sun = <'su' | 'sunnuntai'>

    <Weekday> = Mon | Tue | Wed | Thu | Fri | Sat | Sun
    Relativeday = Yesterday | Tomorrow | Today | DayBeforeYesterday
    Date = Weekday <Modulation?>
    Modulation = 'na' | 'nä'
    ")


(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
