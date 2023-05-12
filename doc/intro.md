# Anotações

### List
- Cria uma lista de números e filtra qual deles são par (divisão por 2 = 0)
  
`(= (mod number 2) 0)` -> o resto da divisão do number por 2 é 0 (modulus)
`(fn....)` -> função anônima no clojure

(função anônima)
```clojure
(def lista [1 2 3 4 5 6 7 8 9 10])
(filter (fn [number] (= (mod number 2) 0)) lista)
```
outra forma de escrever isso (lambda): 
```clojure
(def lista [1 2 3 4 5 6 7 8 9 10])
(filter  #(= (mod % 2) 0) lista)
```

- `#` -> quer dizer que é uma função anônima
- `%` ->  no lugar de number, que é o único elemento da função, `%` ou `%1` quer dizer pra pegar o primeiro elemento dessa função (que é o number). Se fosse `%2` pega dois elemento da função e assim por diante...
- `(second %)` pega o segundo valor do retorno da outra função dps da **%**. Num destruct `Order -> [[key value]]`, vai pegar o value nesse caso

### Increment and Decrease

`(+ 5 1)` -> `(inc 5)` = 6

- As duas operações retornam a mesma coisa. `inc` incrementa +1 o valor passado

`(- 6 1)` -> `(dec 6)` = 5

- Mesmo retorno. `dec` diminui em 1 o valor passado

### Threading 
- thread last `(->> )` adiciona o elemento como **ultimo** argumento da proxima função
- thread first `(-> )` adiciona o elemento como **primeiro** argumento da proxima função

### Destruct Map

- Numa função, recebe os parâmetros de um map em um array: Map -> [[key value]]

```clojure
(def order {:mochila {:count 2
                      :price 30}
            :camiseta {:count 4
                       :price 40}})
(defn print-order-key-value [[key value]]
  (println key " e " value)
  [key value])
```

### Functions Composition (Comp)

- Comp é uma função que combina duas ou mais funções em sequência 
- Pode definir um simbolo `(def)` para referenciar a comp da função, não precisa criar uma função `(defn)` para chamar outra função de comp 

```clojure
(defn not-free? 
  [item]
  (not (product-free? item)))
;Comp
(def not-free-comp? (comp not product-free?))
```