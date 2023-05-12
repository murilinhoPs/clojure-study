(ns estudos.aula4
  (:require [estudos.aula3 :as aula3]))

(def values [30 50 400 1000]);; IMUTABLE

(defn get-element-direct-array
  "Retorna o elemento do array usando como fn, se o index não existir throw exception"
  [index]
  (values index))

(defn get-element-from-array
  "Retorna o elemento do array com a função get, se o index não existir retorna nil"
  [index]
  (get values index))

(defn get-element-from-array-with-default
  "Retorna o elemento do array com a função get, se o index não existir retorna 0 por default"
  [index]
  (get values index 0))

(defn add-new-element
  "Adiciona um novo elemento e retorna uma nova lista com ele nela"
  [value]
  (conj values value))

(defn update-element
  "Atualiza o valor de um elemento e retorna uma nova lista com o novo valor dele"
  [new-value]
  (update values 0 new-value))

(defn apply-discount-to-values 
  "Aplica o desconto para todos os valores da lista"
  [] ;; % pega o valor iterado do values(value)
  (map #(aula3/new-discount aula3/apply-discount-when? %) values))

(defn apply-discount-to-selected-values
  [] 
  (->> (filter aula3/price-greater-than-90? values)
       (map #(aula3/new-discount aula3/apply-discount-when? %))))
; insere a lista filtrada como ultimo elemento do map, que seria o values na função anterior (thread last)

(defn sum-discount-applied-to-selected-values
  "Soma o valor total dos preços após o desconto aplicado com o reduce"
  []
  (->> (filter aula3/price-greater-than-90? values)
       (map #(aula3/new-discount aula3/apply-discount-when? %))
       (reduce +)))

; insere a lista filtrada com os descontos aplicados no ultimo elemento do reduce, que seriam o values na função anterior
