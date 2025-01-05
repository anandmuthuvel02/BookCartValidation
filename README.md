# Selenium Java Cucumber Framework

📜 **Project Description**  
This project automates the testing of key features of a web application using **Selenium WebDriver**, **Java**, and **Cucumber** for Behavior-Driven Development (BDD). 
The framework is designed to ensure smooth test execution and easy collaboration between technical and non-technical teams.

🚀 **Key Highlights**

### Automated Functionalities:
- **Login** and **Add to Cart** functionalities have been automated to verify correct behavior of the application’s critical flows.

### Framework Design:
- **Page Object Model (POM)**: Ensures modular and reusable test scripts.
- **Maven**: Handles build and dependency management.

### Testing Approach:
- **Scenario Outline for Data-Driven Testing**: Uses **Scenario Outline** in Cucumber to provide dynamic test data, improving flexibility and coverage by running the same scenario with multiple sets of data.
- In this framework, **tags** are used to structure the tests in a way that supports multiple environments and facilitates running tests based on specific conditions. 
- **Global Variables (Future Implementation)**: Will be managed using **Properties Files** for configuration and setup.

### Reporting and Logging:
- **Extent Reports** for visually appealing test execution reports.
- **Exception Handling**: Built-in mechanisms to handle failures and provide detailed logs.

### BDD with Cucumber:
- **Cucumber** for writing clear and readable feature files that allow for easy collaboration with non-technical stakeholders.
  
## Hooks in Cucumber

### Usage
- Hooks allow code to be executed before or after each scenario, facilitating setup (e.g., initializing WebDriver) and cleanup (e.g., closing the browser).
-  These can be global or feature-specific.

## Step Definitions in Cucumber

### Usage
- Step Definitions are the methods in Java that bind the steps written in Cucumber feature files to the automation logic. These methods define the actions to be performed for each step in the feature file.
- Step definitions are where the actual test automation code is implemented.
  
## Test Runners in Cucumber

### Usage
- Test Runners are responsible for running the Cucumber tests.
- They link the feature files with the step definition files and execute the tests.
- The Test Runner is typically used with a testing framework like JUnit or TestNG to run the Cucumber feature files.


🛠️ **Tools and Technologies**

- **Programming Language**: Java
- **Automation Tool**: Selenium WebDriver
- **Test Framework**: Cucumber, TestNG
- **Build Management**: Maven
- **Reporting**: Extent Reports
- **Behavior-Driven Development (BDD)**: Cucumber
- **Source Control**: GitHub

📝 **Key Features of the Framework**

### Modularity and Maintainability:
- **Page Object Model (POM)** promotes organized code with reusable components for easier maintenance.

### Data-Driven Testing:
- **Scenario Outline** in Cucumber for data-driven testing, running the same scenario with different sets of data.

### Comprehensive Reporting:
- **Extent Reports** generate detailed execution reports with logs and screenshots of failed tests for easy debugging.

### BDD Collaboration:
- **Feature files** in Cucumber enable clear communication between testers, developers, and stakeholders, with scenarios that anyone can understand.

### Configurable and Flexible:
- **Properties files (Future Implementation)** for managing global variables and environment-specific configurations.

### Testing Approach: Tags and Scenario Outlines in Cucumber
- In this framework, **tags** and **scenario outlines** are used to structure the tests in a way that supports multiple environments and facilitates running tests based on specific conditions. 

