(ns estudos.1.aula5)

(def estoque {"Mochila"  10
              "Camiseta" 5})

(def ok-estoque {:mochila 10
                 :camiseta 5});; :valor define uma keyword

(defn estoque-lenght
  [mapa]
  (count mapa))

(defn get-estoque-keys
  [mapa]
  (keys mapa))

(defn get-estoque-values
  [mapa]
  (vals mapa))

(defn associate-new-key-value
  [mapa
   key
   value]
  (assoc mapa key value))
(associate-new-key-value ok-estoque :cadeira 3)
(associate-new-key-value ok-estoque :mochila 3) ;; substitui o valor de mochila com um novo valor

;update-map-with-key-value
(update ok-estoque :mochila #(- % 3))
(update ok-estoque :mochila inc)

(def order {:mochila  {:count 1
                       :price 60}
            :camiseta {:count 3
                       :price 100}})

(def new-order (assoc order :cadeira {:count 2
                                      :price 120})) ;; add cadeira do order

;get values from order
(order :camiseta) ;; can return nullPointerException
(get order :camiseta {})
(:camiseta order) ; if don't exsists returns nil

;update a value inside a map
(update-in order [:mochila :count] inc)

; Thread first, coloca o elemento como primeiro argumento da proxima função
(-> order :camiseta :count) ;;get the count from camiseta


