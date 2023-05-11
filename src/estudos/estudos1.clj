(ns estudos.estudos1)

(defn discount
  "Retorna o valor do produto com desconto de 10% se o valor for maior que 100"
  [value]
  (if (> value 90) ;; this can be a function
    (let [discount-percentage (/ 10.0 100.0)
          discount-value (* value discount-percentage)]
      (println "Calculando o desconto de -" discount-value "%")
      (- value  discount-value)) 
    value))


(def drinks ["Water", "Fanta"]) ;; Imutable
drinks

(defn can-drink 
  "Retorna uma nova lista de drinks baseado na idade >= 18 baseada na lista anterior"
  [age] 
  (if (>= age 18)
    (conj drinks "Beer")
    (conj drinks "Coke")))
