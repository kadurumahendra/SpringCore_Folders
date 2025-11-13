# 🌱 Spring Core Practice (Bean, Annotation & Java Configuration)
## 📖 Overview
This repository contains my learning and practice examples from **Spring Core Framework** using **Maven**.  
It focuses on key concepts like **Bean Configuration**, **Annotation-based Configuration**, and **Java-based Configuration**, exploring how Spring implements **IoC (Inversion of Control)** and **Dependency Injection**.

---

## ⚙️ Topics Covered
- 🧩 XML-based Bean Configuration  
- 🧠 Annotation-based Configuration (`@Component`, `@Autowired`, `@Value`, `@Scope`)  
- 🧾 Java-based Configuration (`@Configuration`, `@Bean`, `@ComponentScan`)  
- 🔁 Bean Scopes (`singleton`, `prototype`)  
- 🧰 Dependency Injection (Constructor & Setter Injection)  
- 🔄 Lookup Method Injection (`@Lookup`)  
- 🚀 Bean Lifecycle Methods (`@PostConstruct`, `@PreDestroy`, `init-method`, `destroy-method`)

---

## 🏗️ Project Structure
SpringCore_Folders/
│
├── src/main/java/
│ ├── springXML/ # XML-based configuration examples
│ ├── springAnnotations/ # Annotation-based examples
│ ├── springJavaConfig/ # Java-based configuration examples
│
├── src/main/resources/
│ └── applicationContext.xml
│
├── pom.xml # Maven configuration
└── README.md # Project documentation

yaml
Copy code

---

## 🧩 Example Modules
| Module Name | Description |
|--------------|-------------|
| **Task1** | Bean configuration using XML |
| **Task2** | Using annotations like `@Component`, `@Autowired` |
| **Task3** | Java-based configuration using `@Configuration`, `@Bean` |
| **Task4** | Lookup method and prototype bean demonstration |
| **Task5** | Bean lifecycle demo (`init` / `destroy` methods) |

---

## 🛠️ Tools & Technologies
- ☕ **Java 17+**
- 🌸 **Spring Framework (Core)**
- 🧱 **Maven**
- 🖋️ **Eclipse / IntelliJ IDEA**
- 📁 **applicationContext.xml** (for XML configuration)

---

## ▶️ How to Run
1. **Clone the Repository**
   ```bash
   git clone https://github.com/kadurumahendra/SpringCore_Folders.git
   cd SpringCore_Folders
Build the Project using Maven

bash
Copy code
mvn clean install
Run the Application

From IDE → Right-click Test.java → Run as → Java Application

OR via terminal:

bash
Copy code
mvn exec:java -Dexec.mainClass="com.example.MainClass"
📘 Learning Goals
Understand Spring Bean lifecycle and IoC container.

Explore Dependency Injection (DI) with XML, Annotations, and Java Config.

Practice Singleton and Prototype scopes.

Implement Lookup Method Injection.

Strengthen Spring Core fundamentals for future Spring Boot development.

🧑‍💻 Author
Kaduru Mahendra
-🎓 Graduated B.E. Computer Science
-💻 Passionate about Front End and Backend Development with Spring
-📍 Tirupati, India

💬 "Learning Spring Core is the foundation to mastering modern Java development."
---


clean and neat way
