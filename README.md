# AT – Domain-Driven Design (DDD) e Arquitetura de Softwares Escaláveis com Java

## 📚 Contexto Acadêmico

Este repositório contém o **AT (Atividade de Trabalho)** da disciplina **Domain-Driven Design (DDD) e Arquitetura de Softwares Escaláveis com Java**.

O objetivo principal deste trabalho é aplicar conceitos teóricos de **DDD**, **microsserviços**, **event-driven architecture** e **boas práticas de arquitetura de software**, transformando um cenário originalmente monolítico em uma solução baseada em microsserviços bem definidos e desacoplados.

---

## 🎯 Objetivos do Trabalho

* Aplicar os princípios de **Domain-Driven Design (DDD)**
* Realizar a **decomposição de um monólito em microsserviços**
* Identificar e implementar **Aggregates, Entities e Value Objects**
* Projetar comunicação **assíncrona baseada em Domain Events**
* Compreender conceitos de **observabilidade**, rastreamento distribuído e logs
* Estruturar microsserviços de forma independente e escalável

---

## 🧩 Domínio do Sistema – PetFriends

O domínio do sistema utilizado como base para o trabalho é o **PetFriends**, uma plataforma fictícia voltada para a gestão de pedidos relacionados a produtos e serviços para pets.

A solução foi dividida nos seguintes **microsserviços**:

* **PetFriends_Pedidos**
* **PetFriends_Almoxarifado**
* **PetFriends_Transporte**

Cada microsserviço representa um **Bounded Context** específico do domínio.

---

## 🏗️ Estrutura do Repositório

```text
AT
├── petfriends-pedidos
├── petfriends-almoxarifado
├── petfriends-transporte
└── README.md
```

Cada pasta representa um microsserviço independente, criado com **Spring Boot** via **Spring Initializr**.

---

## 🧠 Modelagem com DDD

### ✔️ Aggregates e Entities

* Cada microsserviço possui um **Aggregate Root** que representa o elemento central do domínio:

  * Almoxarifado → controle de estoque
  * Transporte → controle de entregas
  * Pedidos → orquestração do fluxo do pedido

### ✔️ Value Objects

Foram utilizados **Value Objects** para representar conceitos do domínio que não possuem identidade própria, garantindo:

* Imutabilidade
* Validações encapsuladas
* Maior expressividade do modelo

---

## 🔔 Domain Events

O trabalho explora o uso de **eventos de domínio** para promover comunicação assíncrona entre os microsserviços.

Exemplos de eventos:

* PedidoCriadoEvent
* PedidoConfirmadoEvent
* PedidoProntoParaEnvioEvent

Esses eventos permitem que **Almoxarifado** e **Transporte** reajam às mudanças de estado do **Pedido** sem acoplamento direto.

---

## 🔄 Comunicação entre Microsserviços

* **Síncrona**: Utilizada pelo módulo **PetFriends_Web (ReactJS)** via REST API
* **Assíncrona**: Baseada em **eventos de domínio**, simulando uma arquitetura orientada a eventos

A implementação da mensageria é conceitual, com foco no **design arquitetural**, e não na infraestrutura real (RabbitMQ/Kafka).

---

## 🔍 Observabilidade e Monitoramento

O trabalho aborda conceitualmente os seguintes tópicos:

* **Gateway de Serviço**
* **ID de Correlação**
* **Spring Cloud Sleuth**
* **Zipkin**
* **Agregadores de Logs (ELK Stack)**

Esses elementos são fundamentais para garantir rastreabilidade, diagnóstico e monitoramento em ambientes distribuídos.

---

## ⚙️ Tecnologias Utilizadas

* Java 17+
* Spring Boot
* Spring Data
* Maven
* H2 Database (em memória)
* Arquitetura de Microsserviços
* Domain-Driven Design (DDD)

---

📌 *Trabalho desenvolvido para fins educacionais.*
