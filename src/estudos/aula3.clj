(ns estudos.aula3)

(defn apply-discount-if?
  [price]
  (if (> price 90)
    true
    false))

(defn apply-discount-when?
  [price]
  (when (> price 90)
    true))

(defn price-greater-than-90?
  [price]
  (> price 90))

(def price-greater-than-90-anon? (fn [price] (> price 90)))

(def price-greater-than-90-lambda? #(> % 90))

(defn new-discount
  "Retorna o valor do produto com desconto de 10% se o valor for maior que 100"
  [apply-discount? value]
  (if (apply-discount? value)
    (let [discount-percentage (/ 10.0 100.0)
          discount-value (* value discount-percentage)]
      (- value  discount-value))
    value))
