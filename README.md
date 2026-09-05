# 🏦 Projeto Conta Bancária

Sistema bancário desenvolvido em **Java** com o objetivo de praticar conceitos de **Programação Orientada a Objetos (POO)**.

O projeto simula diferentes tipos de contas bancárias e permite realizar operações como depósitos, saques, consulta de saldo, utilização de limite e aplicação de rendimento.

## 📋 Sobre o Projeto

O sistema possui três tipos de contas:

* **Conta Bancária:** operações básicas de depósito, saque e consulta de dados.
* **Conta Corrente:** possui limite disponível para utilização e regras específicas para saque e depósito.
* **Conta Poupança:** possui uma funcionalidade para aplicação de rendimento sobre o saldo.

A interação com o sistema é realizada através de menus utilizando `JOptionPane`.

## 🚀 Funcionalidades

### Conta Bancária

* Consultar saldo
* Realizar depósito
* Realizar saque
* Exibir dados da conta

### Conta Corrente

* Consultar saldo
* Realizar depósito
* Realizar saque utilizando o limite disponível
* Consultar limite

### Conta Poupança

* Consultar saldo
* Realizar depósito
* Realizar saque
* Aplicar rendimento de 5%

## 🧠 Conceitos de POO Aplicados

O projeto foi desenvolvido utilizando diferentes conceitos da Programação Orientada a Objetos:

### Encapsulamento

Os atributos das contas são privados e acessados através de métodos `get` e `set`.

### Herança

As classes `ContaCorrente` e `ContaPoupanca` herdam características e comportamentos da classe `ContaBancaria`.

```java
public class ContaCorrente extends ContaBancaria
```

```java
public class ContaPoupanca extends ContaBancaria
```

### Polimorfismo / Sobrescrita

Os métodos `Sacar()` e `Depositar()` são sobrescritos nas subclasses para implementar comportamentos específicos.

```java
@Override
public void Sacar(double sacar) {
    // Regra específica da conta corrente
}
```


## 📁 Estrutura do Projeto

```text
ProjetoContaBancaria/
│
├── pom.xml
│
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── mycompany/
    │               └── projetocontabancaria/
    │                   ├── ContaBancaria.java
    │                   ├── ContaCorrente.java
    │                   ├── ContaPoupanca.java
    │                   └── ProjetoContaBancaria.java
    │
    └── test/
```


## 📚 Objetivo

Este projeto foi desenvolvido como prática de **Linguagem de Programação e Programação Orientada a Objetos**, buscando aplicar na prática conceitos como:

* Classes e objetos
* Atributos e métodos
* Encapsulamento
* Herança
* Polimorfismo
* Sobrescrita de métodos
* Construtores
* Estruturas condicionais
* Estruturas de repetição
* Interação com o usuário através do `JOptionPane`



Projeto desenvolvido para fins acadêmicos e de aprendizado em desenvolvimento de software.

