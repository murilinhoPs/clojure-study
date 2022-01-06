(ns estudos.estudos1)

(defn discount
  "Retorna o valor do produto com desconto de 10% se o valor for maior que 100"
  [value]
  (if (> value 90)
    (let [discount-percentage (/ 10.0 100.0)
          discount-value (* value discount-percentage)]
      (println "Calculando o desconto de -" discount-value)
      (- value  discount-value)) value))

(discount 100)

(def drinks ["Water", "Fanta"])
drinks

(defn can-drink [age]
  (if (>= age 18)
    (conj drinks "Beer")
    (conj drinks "Coke")))

;; (def drinks (conj drinks "Juice"))

(can-drink 18)