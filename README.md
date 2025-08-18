## 🛒 eBay BDD Java Selenium Framework

> ⚙️ A BDD test automation framework built with Java, Selenium WebDriver, and Cucumber to automate end-to-end shopping flows on the eBay website.

---

### 📌 Overview

This project automates key user actions on eBay (like searching for products, viewing results, and adding to cart) using **Behavior Driven Development (BDD)** practices. It uses **Page Object Model (POM)** to promote clean code, reusability, and scalability.

---

### 🚀 Features

* ✅ Java + Selenium WebDriver + Cucumber (BDD)
* ✅ Page Object Model (POM) design
* ✅ End-to-end eBay shopping flow automation
* ✅ hooks for setup/teardown
* ✅ Easy-to-write feature files with Gherkin syntax
* ✅ Maven build tool
* ✅ Configurable via properties file
* ✅ Cross-browser support ready (with WebDriverManager)
* ✅ Extensible for future test cases

---

### 🧪 Tech Stack

| Tech             | Version |
| ---------------- | ------- |
| Java             | 17+     |
| Selenium         | 4.19+   |
| Cucumber         | 7.17+   |
| JUnit            | 4.13+   |
| Maven            | 3.8+    |
| WebDriverManager | Latest  |

---

### 📂 Project Structure

```
src/
├── main/java/
│   └── com/ebay/automation/
│       ├── base/
│       ├── config/
│       ├── drivers/
│       ├── pages/
│       └── utils/
├── test/java/
│   └── com/ebay/automation/
│       ├── stepdefinitions/
│       ├── runners/
│       └── hooks/
└── test/resources/
    ├── features/
    └── config/
```

---

### 🧾 Sample Feature (Gherkin)

```gherkin
Feature: Product Search

  Scenario: Search for a product
    Given User is on eBay home page
    When User searches for "laptop"
    Then Search results for "laptop" should be displayed
```

---

### ⚙️ How to Run Tests

1. **Clone the Repo:**

   ```bash
   git clone https://github.com/your-username/ebay-bdd-java-selenium-framework.git
   ```

2. **Navigate to the Project Directory:**

   ```bash
   cd ebay-bdd-java-selenium-framework
   ```

3. **Run Tests via Maven:**

   ```bash
   mvn clean test
   ```

### 📈 Reports

* Cucumber HTML reports are generated under `/target/cucumber-reports`
* (Optional: Add Allure or ExtentReports integration for advanced reporting)

### 🙌 Contribution

Feel free to fork this repo, make improvements, and open pull requests!
Found a bug or have a feature request? Open an issue.

---
