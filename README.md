# Tiso Studio OA


## Overview
This project is a Selenium-based test automation framework using **Java** and **TestNG**. It includes automated test scripts for placing orders on a web application. The configuration settings are managed via an external properties file.

## Project Structure
```
├── src/main/java/
│   ├── utils/
│   │   ├── ConfigReader.java
│
├── src/test/java/
│   ├── BaseTest.java
│   ├── PlaceOrderTest.java
│
├── src/test/resources/
│   ├── application.properties
│
├── pom.xml (if using Maven)
└── README.md
```

## Prerequisites
- **Java 8+**
- **Maven**
- **Selenium WebDriver**
- **TestNG**
- **Browser drivers** (ChromeDriver, FirefoxDriver, EdgeDriver)

## Running the Tests
To execute the tests, use one of the following methods:
### Using Maven
```sh
mvn test
```
