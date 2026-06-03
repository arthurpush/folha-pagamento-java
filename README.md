# 💰 Sistema de Folha de Pagamento em Java

Projeto desenvolvido para a disciplina de Algoritmos e Programação.

## 📌 Objetivo

Desenvolver um sistema de console em Java para cadastro de colaboradores e geração automática da folha de pagamento, aplicando conceitos fundamentais de programação e Programação Orientada a Objetos (POO).

## 🚀 Funcionalidades

* Cadastro de Funcionário Padrão
* Cadastro de Funcionário Comissionado
* Cadastro de Funcionário de Produção
* Geração da folha de pagamento
* Cálculo automático de salários e adicionais
* Validação de dados de entrada
* Controle de matrícula duplicada
* Armazenamento dos colaboradores utilizando ArrayList

## 👥 Tipos de Colaboradores

### Funcionário Padrão

Salário Final = Salário Base

### Funcionário Comissionado

Salário Final = Salário Base + Comissão

Comissão:

```text
Vendas × Percentual ÷ 100
```

### Funcionário de Produção

Salário Final = Salário Base + Bônus

Bônus:

```text
Quantidade Produzida × Valor por Peça
```

## 💰 Salário Base

```text
R$ 2.000,00
```

## 🛠 Tecnologias Utilizadas

* Java 21
* VS Code
* Git
* GitHub

## 🧠 Conceitos Aplicados

* Variáveis e Constantes
* Classes e Objetos
* Métodos
* Construtores
* Encapsulamento
* ArrayList
* Estruturas Condicionais (if, else if e switch)
* Estruturas de Repetição (for e do-while)
* Validação de Dados
* Operações Matemáticas

## 📂 Estrutura do Projeto

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

## ▶️ Como Executar

1. Abra o terminal na pasta do projeto.

2. Entre na pasta src:

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

## 📋 Como Funciona

O sistema apresenta um menu interativo com as opções:

1. Cadastrar Funcionário Padrão
2. Cadastrar Funcionário Comissionado
3. Cadastrar Funcionário de Produção
4. Gerar Folha de Pagamento
5. Sair

Todos os funcionários são armazenados em um ArrayList durante a execução do programa.

Ao gerar a folha de pagamento, o sistema exibe:

* Total de funcionários cadastrados
* Nome
* Matrícula
* Tipo de funcionário
* Salário Base
* Valor de extras
* Salário Final

## 👨‍💻 Autor

Arthur Araujo Soares

Projeto acadêmico desenvolvido para fins educacionais.