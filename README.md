# 💰 Sistema de Folha de Pagamento em Java

Projeto desenvolvido para a UC de Algoritmos e Programação.

## Objetivo

Desenvolver um sistema de console em Java para cadastro de colaboradores e geração automática da folha de pagamento, aplicando conceitos de Programação Orientada a Objetos (POO).

## Funcionalidades

* Cadastro de Funcionário Padrão
* Cadastro de Funcionário Comissionado
* Cadastro de Funcionário Produção
* Geração da folha de pagamento
* Cálculo automático dos salários
* Validação de dados
* Armazenamento dos colaboradores utilizando ArrayList

## Tecnologias Utilizadas

* Java 21
* VS Code
* Git
* GitHub

## Conceitos Aplicados

* Classes e Objetos
* Métodos
* Construtores
* Encapsulamento
* Constantes
* ArrayList
* Estruturas Condicionais
* Estruturas de Repetição
* Validação de Dados

## Estrutura do Projeto

```text
FolhaPagamento
│
├── src
│   ├── Main.java
│   └── Funcionario.java
│
├── README.md
└── .gitignore
```

## Como Executar

1. Abra o terminal na pasta do projeto.

2. Acesse a pasta src:

```bash
cd src
```

3. Compile os arquivos:

```bash
javac *.java
```

4. Execute o programa:

```bash
java Main
```

## Como Funciona

O sistema apresenta um menu onde o usuário pode:

1. Cadastrar um Funcionário Padrão
2. Cadastrar um Funcionário Comissionado
3. Cadastrar um Funcionário de Produção
4. Gerar a Folha de Pagamento

Todos os funcionários são armazenados em uma lista (ArrayList) durante a execução do programa.

Ao gerar a folha de pagamento, o sistema calcula automaticamente o salário final de cada colaborador de acordo com seu tipo.

## Autor

Arthur Araujo Soares