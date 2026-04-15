# Java – Control Flow and Methods

## 📖 Learning Objectives
At the end of this course, you will be able to explain:

### 1. Operators & Precedence
* **How to use arithmetic, relational, logical operators, and the order of precedence:** Arithmetic operators (`+`, `-`, `*`, `/`, `%`) perform calculations; Relational operators (`==`, `!=`, `<`, `>`, `<=`, `>=`) compare values; Logical operators (`&&`, `||`, `!`) combine boolean conditions. Precedence follows the order: Parentheses > Multiplicative > Additive > Relational > Logical.

### 2. Decision Statements
* **How to use decision statements if, else if, else and switch case:** `if/else` blocks execute code based on whether a condition is true or false. `switch case` is used to select one of many code blocks to be executed based on a specific value (int, char, String), often providing a cleaner alternative to multiple `else if` statements.

### 3. Repetition Structures
* **How to use repetition structures while, do while and for:** `while` loops as long as a condition is true (checked before); `do while` guarantees at least one execution (checked after); `for` is used when the number of iterations is known, grouping initialization, condition, and increment.

### 4. Control Flow
* **How to use control flow statements break and continue:** `break` is used to exit a loop or a switch block immediately. `continue` skips the current iteration of a loop and moves directly to the next evaluation of the loop's condition.

### 5. Methods & Classes
* **How to declare methods inside a class:** A method is declared with an access modifier (like `public`), a return type (`void`, `int`, etc.), a name, and parentheses for parameters, followed by a code block `{ ... }`.
* **How to call public methods from another class:** To call a public method, you must first create an instance (object) of the class containing the method, then use the dot operator: `objectName.methodName()`.

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
Logical errors in **Control Flow** (like infinite loops or incorrect `else` logic) are common vectors for **Denial of Service (DoS)** or **Authentication Bypass**. Always ensure loops have a clear exit condition and `switch` statements include a `default` case to handle unexpected input.
