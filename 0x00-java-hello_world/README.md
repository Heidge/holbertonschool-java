# Java – Creating Your First Program

## 📖 Learning Objectives
Ce projet couvre les bases fondamentales de Java, essentielles pour comprendre l'environnement avant de réaliser des audits de sécurité.

### 1. General Concepts
* **What are the Java development platforms?** The main platforms are **Java SE** (Standard Edition) for core applications, **Jakarta EE** (Enterprise Edition) for large-scale web apps, and **Java ME** (Micro Edition) for mobile and embedded devices.
* **What is the difference between the JRE and JDK?** The **JRE** (Java Runtime Environment) provides the libraries to *run* Java code, while the **JDK** (Java Development Kit) includes the JRE plus tools like the compiler to *develop* it.
* **What is bytecode?** Bytecode is the platform-independent instruction set (stored in `.class` files) produced by the compiler that allows Java to run on any device with a JVM.
* **What is the role of the Java Virtual Machine (JVM)?** The **JVM** acts as an interpreter that executes bytecode by translating it into specific machine code for the host operating system.

### 2. Compilation & Execution
* **How to compile a Java source code using javac** You compile source code by running the command `javac FileName.java` in your terminal, which generates a `.class` file.
* **How to run a compiled Java code** You execute the program using the command `java FileName`, which triggers the JVM to run the compiled bytecode.

### 3. Syntax & Data Handling
* **How to create variables and constants** Variables are declared with a type and name (e.g., `int age = 20;`), while constants are defined using the **`final`** keyword (e.g., `final double PI = 3.14;`).
* **What are the primitive types in Java** Java features 8 built-in types: `byte`, `short`, `int`, `long` (integers), `float`, `double` (decimals), `char` (characters), and `boolean` (true/false).
* **How to read data using input commands** User input is typically handled using the **`Scanner`** class (from `java.util`), using methods like `nextLine()` for strings or `nextInt()` for integers.
* **How to print text and variables** - `System.out.print()`: Outputs text on the same line.
  - `System.out.println()`: Outputs text and moves to a new line.
  - `System.out.printf()`: Outputs formatted strings using placeholders like `%s` or `%d`.

### 4. Advanced Basics
* **How Strings work and their methods** Strings are **immutable** objects with built-in methods like `.length()`, `.equals()`, and `.substring()` for text manipulation.
* **How to work with arrays** Arrays are fixed-size containers that store multiple elements of the same type, accessed via a zero-based index (e.g., `myArray[0]`).
* **How to split strings in Java** You can break a string into an array of substrings using the `.split("delimiter")` method, which uses a regular expression as a separator.

---

## 🛠️ Requirements

### Java Tasks
* **Allowed editors:** Visual Studio Code, Eclipse, IntelliJ IDEA, NetBeans.
* **Package Rule:** Programs **must not** contain the `package` declaration.
* **Submissions:** Only the source code file with a `.java` extension should be uploaded.
* **Compilation:** All files must be compiled on **Ubuntu 20.04 LTS** using `javac`.
* **Documentation:** A `README.md` file in the root of the project folder is mandatory.

---

## 🔒 Cybersecurity Note
From an audit perspective, always validate user inputs (via `Scanner`) and be careful with `split()` logic to prevent **Injection attacks** or **Denial of Service (DoS)** scenarios through malformed data.
