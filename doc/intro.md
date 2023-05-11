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