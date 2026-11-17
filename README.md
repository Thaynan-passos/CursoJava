# ☕ Curso de Java Completo

[![Java](https://img.shields.io/badge/Java-21-orange.svg?style=flat-square&logo=openjdk)](https://openjdk.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)](LICENSE)
[![GitHub Actions CI](https://img.shields.io/badge/CI-GitHub%20Actions-brightgreen?style=flat-square&logo=githubactions)](.github/workflows/ci.yml)

Repositório estruturado contendo exercícios práticos, projetos e demonstrações desenvolvidos ao longo do curso de **Java**, abrangendo desde os fundamentos da linguagem até conceitos avançados de **Programação Orientada a Objetos (POO)**.

---

## 📌 Sumário

- [Visão Geral](#-visão-geral)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Módulos e Conteúdos](#-módulos-e-conteúdos)
- [Pré-requisitos](#-pré-requisitos)
- [Como Compilar e Executar](#-como-compilar-e-executar)
  - [Via Linha de Comando (Terminal)](#via-linha-de-comando-terminal)
  - [Via IDE (Eclipse / VS Code / IntelliJ)](#via-ide-eclipse--vs-code--intellij)
- [Boas Práticas e Padrões Adotados](#-boas-práticas-e-padrões-adotados)
- [Licença](#-licença)

---

## 📖 Visão Geral

Este projeto consolida a jornada de aprendizado em Java moderna (Java SE 21), cobrindo:
1. **Lógica e Estruturas Fundamentais:** Estrutura sequencial, condicional, laços de repetição e funções.
2. **Memória e Estruturas de Dados:** Vetores, matrizes, boxing/unboxing e listas.
3. **Programação Orientada a Objetos (POO):** Classes, métodos, atributos, construtores, sobrecarga e encapsulamento.
4. **Conceitos Avançados:** Composição de objetos, enumerações, herança, polimorfismo, classes abstratas e boas práticas.

---

## 📂 Estrutura do Projeto

```text
CursoJava/
├── .github/
│   └── workflows/
│       └── ci.yml             # Pipeline de Integração Contínua (CI)
├── src/
│   ├── unidade01/             # Estrutura Sequencial
│   ├── unidade02/             # Estrutura Condicional (if/else, switch)
│   ├── unidade03/             # Estruturas Repetitivas (while, for)
│   ├── unidade04/             # Funções e Sintaxe Complementar
│   ├── unidade05/             # Vetores, Matrizes e Listas
│   ├── Exercise01/            # Introdução a Classes e Métodos
│   ├── Exercicio/             # Construtores, Sobrecarga e Encapsulamento
│   ├── entities/              # Modelagem de Domínio e Entidades
│   │   └── enums/             # Enumerações (ex.: OrderStatus)
│   ├── application/           # Programas Executáveis (Classes com main)
│   └── module-info.java       # Declaração do Módulo Java
├── .gitignore                 # Arquivo de exclusão para Git/GitHub
├── LICENSE                    # Licença MIT
└── README.md                  # Documentação do projeto
```

---

## 📚 Módulos e Conteúdos

| Módulo | Foco Principal | Exemplos / Descrição |
| :--- | :--- | :--- |
| **`unidade01`** | Estrutura Sequencial | Entrada e saída de dados (`Scanner`), operações aritméticas. |
| **`unidade02`** | Estrutura Condicional | Tomada de decisão com `if-else` e expressões lógicas. |
| **`unidade03`** | Estruturas de Repetição | Laços iterativos `while` e `for`. |
| **`unidade04`** | Funções & Escopo | Modularização de código e reaproveitamento de rotinas. |
| **`unidade05`** | Vetores (Arrays) | Manipulação de vetores em memória, estatísticas e listagens. |
| **`Exercise01`** | Fundamentos de POO | Cálculo de área de triângulos, cálculo de salário de funcionários e notas. |
| **`Exercicio`** | Encapsulamento & Regras | Sistema bancário com regras de depósito, saque e taxas. |
| **`entities`** | Modelagem de Dados | Entidades como `Account`, `Employee`, `Product`, `Order`, `Post`. |
| **`application`** | Execução e POO Avançada | Demonstrações de herança, polimorfismo, enumerações e manipulação de datas. |

---

## ⚙️ Pré-requisitos

Para compilar e executar o projeto, você precisará de:
* **[Java Development Kit (JDK) 21+](https://adoptium.net/)**
* Git instalado na máquina
* (Opcional) Uma IDE de sua preferência: **VS Code**, **Eclipse** ou **IntelliJ IDEA**.

---

## 🚀 Como Compilar e Executar

### Via Linha de Comando (Terminal)

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/thaynanpassos/CursoJava.git
   cd CursoJava
   ```

2. **Compile todas as classes Java para a pasta `bin`:**
   * No **Linux / macOS / Git Bash**:
     ```bash
     mkdir -p bin
     find src -name "*.java" > sources.txt
     javac -d bin @sources.txt
     ```
   * No **Windows (PowerShell)**:
     ```powershell
     if (!(Test-Path bin)) { New-Item -ItemType Directory -Path bin }
     $files = Get-ChildItem -Path src -Filter *.java -Recurse | ForEach-Object { $_.FullName }
     javac -d bin $files
     ```

3. **Execute um programa específico:**
   Exemplo executando o programa da Unidade 1:
   ```bash
   java -cp bin unidade01.quest01
   ```
   Exemplo executando um programa da pasta `application`:
   ```bash
   java -cp bin application.Program01
   ```

### Via IDE (Eclipse / VS Code / IntelliJ)

* **Eclipse:** `File` > `Open Projects from File System...` > Selecione a pasta do repositório. O Eclipse reconhecerá as configurações de `.project` e `.classpath`.
* **VS Code:** Abra a pasta no VS Code com a extensão *Extension Pack for Java* instalada. O projeto será reconhecido automaticamente.
* **IntelliJ IDEA:** `File` > `Open` > Selecione a pasta do repositório e configure o SDK para Java 21.

---

## 🛡️ Boas Práticas e Padrões Adotados

- **Versionamento Limpo:** Arquivos de build (`bin/`, `*.class`) e metadados de IDE (`.metadata/`) são ignorados pelo Git via [.gitignore](.gitignore), mantendo o repositório leve.
- **Integração Contínua (CI):** Validação automática de integridade e compilação a cada *push* utilizando GitHub Actions.
- **Licenciamento:** Código aberto sob a [Licença MIT](LICENSE).

---

## 📄 Licença

Distribuído sob a licença **MIT**. Consulte o arquivo [LICENSE](LICENSE) para obter mais informações.
