# Anotações

- Cria uma lista de números e filtra qual deles são par (divisão por 2 = 0)
  
`(= (mod number 2) 0)` -> o resto da divisão do number por 2 é 0 (modulus)
`(fn....)` -> função anônima no clojure

(função anônima)
```
lista -> [1 2 3 4 5 6 7 8 9 10]
(filter (fn [number] (= (mod number 2) 0)) lista)
```
outra forma de escrever isso (lambda): 
```
lista -> [1 2 3 4 5 6 7 8 9 10]
(filter  #(= (mod % 2) 0) lista)
```

- `#` -> quer dizer que é uma função anônima
- `%` ->  no lugar de number, que é o único elemento da função, `%` ou `%1` quer dizer pra pegar o primeiro elemento dessa função (que é o number). Se fosse `%2` pega o segundo elemento e assim por diante...

### increment and decrease

`(+ 5 1)` -> `(inc 5)` = 6

- As duas operações retornam a mesma coisa. `inc` incrementa +1 o valor passado

`(- 6 1)` -> `(dec 6)` = 5

- Mesmo retorno. `dec` diminui em 1 o valor passado

### Threading 
- thread last adiciona o elemento como **ultimo** argumento da proxima função
- thread first adiciona o elemento como **primeiro** argumento da proxima função