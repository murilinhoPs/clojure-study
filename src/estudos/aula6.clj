(ns estudos.aula6)

(def order {:mochila {:count 2
                      :price 30}
            :camiseta {:count 4
                       :price 40}})

(def order-2 {:mochila {:count 2
                        :price 30}
              :camiseta {:count 4
                         :price 40}
              :chaveiro {:count 1}})

(defn print-order
  [value]
  (println "order: " (class value) value)
  value)


(defn print-order-key-value [[key value]]
  (println key " e " value)
  [key value])

;; (println (map print-order-key-value order))

(defn products-price
  [[_ value]] ;destruct
  (* (-> value :count) (-> value :price)))

(defn order-price
  [products]
  (->> products
       (map products-price)
       (reduce +)))

;; (println (order-price order))

(defn product-price
  [product]
  (* (-> product :count) (-> product :price)))

(defn total-order-price
  [products]
  (->> products
       vals
       (map product-price)
       (reduce +)))

(println (total-order-price order))

(defn product-free? 
  [item]
  (<= (get item :price 0) 0))

(defn return-free-products
  [products]
  (filter product-free? (vals products)))

(defn product-free-destruct?
  [[_ item]]
  (<= (get item :price 0) 0))

(defn return-free-products-destruct
  [products]
  (filter product-free-destruct? products))

(defn return-free-products-anon-fn
  [products]
  (filter (fn [[_ item]] (product-free? item)) products))

(defn return-free-products-lambda
  [products]
  (filter #(product-free? (second %)) products))
; second pega o segundo elemento de products, os values

(defn return-free-products-lambda-ds
  [products]
  (filter #(product-free-destruct? %) products))
; o unico elemento que usa é o segundo valor de products, já tem destruct

(defn not-free? 
  [item]
  (not (product-free? item)))

(def not-free-comp? (comp not product-free?))

(defn return-paid-products
  [products]
  (filter #(not-free-comp? (second %)) products))
