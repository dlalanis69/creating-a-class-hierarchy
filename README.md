# Creating a Class Hierarchy

A simple Java project that demonstrates **inheritance**, **abstraction**, and **composition** through a basic school system model.

## 📌 Description

This project includes multiple Java classes representing people in an educational context. It explores the use of abstract classes and class relationships (has-a and is-a).

## 📂 Structure

| Class       | Type        | Inherits From | Key Fields                                       | Key Methods                              |
|-------------|-------------|----------------|--------------------------------------------------|-------------------------------------------|
| `Person`    | Abstract     | –              | `name: String`, `dob: Date`                      | `getDetails()` *(abstract)*              |
| `Employee`  | Abstract     | `Person`       | `dateOfAppointment: Date`, `salary: int`         | `setSalary()`, `getSalary()` *(abstract)* |
| `Teacher`   | Concrete     | `Employee`     | `qualification: String`, `subject: String`       | Overrides: `getDetails()`, `setSalary()`, `getSalary()` |
| `Student`   | Concrete     | `Person`       | `subject: String`, `teacher: Teacher`            | Overrides: `getDetails()`                |
| `Date`      | Utility      | –              | `dd: int`, `mm: int`, `yy: int`                  | `getDate()`                              |
| `Main`      | Entry Point  | –              | –                                                | `main(String[] args)`                    |

## ▶️ How to Run

### Using IntelliJ IDEA
1. Open the project in IntelliJ.
2. Make sure JDK 17+ is selected.
3. Run the `Main` class.

### Using Terminal
```bash
javac *.java
java Main
```

## 🧪 Sample Output
```
Name of Teacher: Madhavan
Date of Birth: 10-10-1995
Date of Appointment: 1-4-2024
Qualification: MTech
Subject: Electronics
Salary: 50000
Name of Student: Belinda
Date of Birth: 1-1-2005
Subject: Electronics
Teacher: Madhavan
```

> Output may vary depending on values in `Main.java`.

## ✅ Requirements

- Java 17 or higher (tested with OpenJDK 24)
- IntelliJ IDEA or any Java IDE

## 💡 Key Concepts Practiced

- Abstract classes and method overriding
- Composition and object relationships
- Organizing a small-scale OOP Java project
