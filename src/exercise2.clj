(ns exercise2)

(defn only-greater-than-five
  [list]
  (filter (fn [otherList] (if (> otherList 5) otherList)) list)
)

