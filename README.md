# Problema Produtor-Consumidor com Threads e Multithreading em Java

Este projeto é uma implementação clássica do problema **Produtor-Consumidor**, utilizando **Java**, **multithreading** e o conceito de **programação concorrente**. Trata-se de uma solução distribuída onde múltiplas threads produtoras geram itens e os armazenam em um buffer compartilhado, enquanto múltiplas threads consumidoras retiram esses itens do buffer.

---

## 🧠 Conceito

O problema do **Produtor-Consumidor** envolve dois tipos de entidades:

- **Produtores**: geram dados e os colocam em um buffer.
- **Consumidores**: retiram dados do buffer e os processam.

Neste projeto, usamos um `BlockingQueue` como buffer compartilhado, o que simplifica o controle de concorrência, pois ele já lida internamente com sincronização.

---

## 🗂️ Estrutura do Projeto

```
DistribuidoMultithread/
├── src/
│   └── co/
│       └── mesquitalabs/
│           └── bbp/
│               ├── Main.java
│               ├── shared/
│               │   └── SharedBuffer.java
│               ├── consumer/
│               │   └── Consumer.java
│               └── producer/
│                   └── Producer.java
```

---

## 🚀 Como executar

1. Compile os arquivos:
   ```bash
   javac src/com/seuusuario/distribuidos/**/*.java
   ```

2. Execute a aplicação:
   ```bash
   java -cp src com.seuusuario.distribuidos.Main
   ```

---

## 🔍 O que observar na execução

- A saída mostrará interleaving entre `Produzido:` e `Consumido:`, refletindo a execução paralela das threads.
- Cada produtor gera 10 números. Os IDs dos itens produzidos indicam de qual produtor vieram:
  - `0–9` → Produtor 0
  - `100–109` → Produtor 1
  - `200–209` → Produtor 2
- A ordem dos logs pode variar a cada execução, pois as threads são agendadas de forma não determinística.

---

## 🧵 Tecnologias utilizadas

- Java 8+ (recomenda-se Java 11 ou superior)
- `BlockingQueue` da biblioteca `java.util.concurrent`
- `Executors` para gerenciamento de thread pool

---

## 📚 Aprendizados

Este projeto exemplifica:

- Uso de `Runnable` e `ExecutorService` para criar e controlar múltiplas threads.
- Comunicação entre threads por meio de um recurso compartilhado seguro (`BlockingQueue`).
- Conceitos clássicos de Sistemas Distribuídos e Concorrência.

---

- Projeto acadêmico para disciplina de Sistemas Distribuídos / Sistemas Operacionais
