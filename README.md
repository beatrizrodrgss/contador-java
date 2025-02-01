# Sistema Contador

Este projeto implementa um sistema simples de contador, onde o valor do contador pode ser incrementado ou decrementado até atingir um valor limite determinado pelo usuário.

## Funcionalidades Implementadas

- **Contagem Crescente**: O contador começa do valor 0 e é incrementado até atingir o valor limite especificado pelo usuário.
- **Exceções**: Implementação de tratamento de exceções para garantir que o limite informado pelo usuário seja válido (não negativo).
- **Incremento e Decremento**: Função para incrementar ou decrementar o valor do contador.
- **Exibição de Valores**: A cada incremento, o valor do contador é impresso no console.

## Melhorias Feitas

- **Fluxo Condicional**: Utilização da estrutura `if-else` para garantir que o contador não seja incrementado indefinidamente ou em valores negativos.
- **Tratamento de Exceções**: O sistema agora trata exceções como valores negativos fornecidos pelo usuário para o limite da contagem, mostrando uma mensagem de erro caso o usuário insira um valor inválido.
- **Interatividade**: Foi adicionado um prompt para o usuário digitar o limite da contagem, tornando o sistema interativo e flexível.
- **Modularização**: O código foi organizado em métodos distintos, como `incrementar()`, `decrementar()`, e `exibirValor()`, para tornar a manutenção e expansão do código mais fácil.

## Como Usar

1. Clone este repositório para sua máquina local.
2. Execute o arquivo `Contador.java` na sua IDE preferida.
3. O sistema pedirá para inserir um limite de contagem.
4. O contador começará a contar de 0 até o limite inserido.


## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para implementar o sistema.
- **Exceções**: Tratamento de exceções para garantir a entrada de dados válidos.
