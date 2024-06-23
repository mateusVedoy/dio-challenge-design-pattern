# Projeto Simples em Java com Design Patterns

## Descrição
Este projeto em Java implementa um sistema de cálculo de juros simples e compostos utilizando os design patterns Factory, Strategy e Template Method.

## Funcionalidades

O projeto consiste em uma calculadora digital de juros que permite ao usuário escolher entre dois tipos de cálculo:
- **Juros Simples**: Calcula os juros com base no valor inicial, taxa de juros e tempo.
- **Juros Compostos**: Calcula os juros compostos com base no valor inicial, taxa de juros e tempo.

## Classes e Design Patterns Utilizados

### Factory Method
O padrão Factory Method é utilizado na classe `CalculoJurosFactory`. Ele encapsula a criação de objetos de cálculo de juros simples e compostos, dependendo da opção escolhida pelo usuário.

### Strategy
O padrão Strategy é implementado pelas classes `CalculaJurosSimples` e `CalculaJurosCompostos`, ambas implementando a interface `ICalculaJuros`. Cada uma dessas classes representa uma estratégia diferente de cálculo de juros.

### Template Method
O padrão Template Method é utilizado na classe `Template`. Essa classe define o esqueleto do algoritmo para exibir o valor final e delega a implementação específica do cálculo de juros para as classes concretas (`CalculaJurosSimples` e `CalculaJurosCompostos`).

### Funcionamento
1. O usuário escolhe o tipo de cálculo desejado (simples ou composto).
2. São solicitados os valores de capital, taxa de juros (em %) e tempo em anos.
3. O sistema utiliza o padrão Factory Method para criar a instância correta da classe de cálculo de juros (simples ou composto).
4. O Template Method é usado para realizar o cálculo de juros com base nos valores fornecidos.
5. O resultado final é exibido na tela, mostrando o montante final e informações adicionais sobre a aplicação dos juros.

Este projeto exemplifica como os design patterns Factory, Strategy e Template Method podem ser aplicados para oferecer flexibilidade, manutenção e reutilização de código em um sistema de cálculo financeiro simples.
