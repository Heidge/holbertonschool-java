# Java – Exceptions and Error Handling

## 📖 Learning Objectives
At the end of this course, you will be able to explain:

### 1. Exception Basics
* **What exceptions are and when to use them:** Exceptions are events that occur during the execution of a program that disrupt the normal flow of instructions; they are used to signal and handle errors gracefully instead of letting the program crash.
* **The purpose of catching exceptions:** Catching exceptions allows the program to intercept an error, process it (e.g., log it or show a message), and continue running or shut down safely.
* **How to handle exceptions:** Exceptions are handled using a `try-catch` block, where the risky code is placed in the `try` section and the recovery logic in the `catch` section.

### 2. Keywords and Implementation
* **How to use try, catch, finally, throws:** * `try`: Defines a block of code to be tested for errors.
    * `catch`: Defines a block of code to be executed if an error occurs in the try block.
    * `finally`: Defines a block of code that runs regardless of the result (success or error).
    * `throws`: Declared in a method signature to indicate that the method might throw specific exceptions.
* **How to throw built-in exceptions:** You use the `throw` keyword followed by a new instance of an exception (e.g., `throw new ArithmeticException("Cannot divide by zero");`).
* **When to implement cleanup actions:** Cleanup actions should be implemented in the `finally` block to ensure resources (like file streams or database connections) are closed even if an exception occurs.

### 3. Checked vs. Unchecked
* **What a checked exception is:** These are exceptions that are checked at compile-time (e.g., `IOException`). The programmer is *forced* to either handle them with `try-catch` or declare them with `throws`.
* **What an unchecked exception is:** Also known as Runtime Exceptions (e.g., `NullPointerException`), these are not checked at compile-time; they usually result from programming logic errors and don't require mandatory handling.

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
From a security standpoint, **never leave a catch block empty** (known as "swallowing" an exception). This can hide critical security failures or attacks. Additionally, ensure that exception messages do not leak sensitive system information (like file paths or stack traces) to the end-user, as this provides valuable data for attackers.
