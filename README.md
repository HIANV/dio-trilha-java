# Conta Terminal

Este é um programa simples em Java que simula a criação de uma conta bancária a partir de dados inseridos pelo usuário via terminal. O usuário informa o seu nome, o número da agência, o número da conta, e o saldo inicial. Ao final, o programa exibe uma mensagem de confirmação com os detalhes da conta criada.

## Funcionalidades

- Recebe o nome do usuário.
- Recebe o número da agência.
- Recebe o número da conta.
- Recebe o saldo inicial da conta.
- Exibe uma mensagem de confirmação com as informações da conta.

## Como executar o programa

### Pré-requisitos

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado na máquina (versão 8 ou superior).
- Uma IDE de desenvolvimento Java, como o [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) ou [Eclipse](https://www.eclipse.org/downloads/), ou você pode usar o terminal/linha de comando.

### Passos para execução

1. Clone este repositório ou copie o código para sua máquina local.
2. Abra o código em uma IDE de sua escolha ou compile usando o terminal.
3. Execute o arquivo `ContaTerminal.java` utilizando os comandos:

#### No terminal:

1. Compile o código:
    ```bash
    javac ContaTerminal.java
    ```

2. Execute o programa:
    ```bash
    java ContaTerminal
    ```

4. Insira as informações solicitadas no terminal, como nome, agência, número da conta e saldo.
5. O programa exibirá uma mensagem de confirmação com os dados inseridos.

## Exemplo de uso

```plaintext
Qual o seu nome?
João
Qual o numero da agencia?
1234
Qual o numero da conta?
56789
Qual o saldo da conta?
1500.00
Olá João, obrigado por criar uma conta em nossa agência 1234. Sua conta 56789 está com o saldo de R$1500.00.
