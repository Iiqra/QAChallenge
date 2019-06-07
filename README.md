# QAChallenge - Automated test example in Java using Selenium WebDriver with Page Object Design Pattern and TestNG 

This project is an example of UI automated functional test for Mercedes order placement workflow using Selenium WebDriver with TestNG.

## Installation

You need to have Java 8 JDK installed along with maven.

To install all dependencies, run

```sh
$ mvn clean install
```

## Running Tests

```sh
$ mvn test
```

By default, tests will run on Chrome. To change that, change browser name in config.properties located in ./src/main/resources

## Project Structure Overview

##### Test Case

  - Test Cases are described in the package located here./src/test/java/com/qa/challenge/testcases

##### Pages

  - Pages are defined with respect to Page Object Design Pattern and are located in the package ./src/main/java/com/qa/challenge/pages

##### Util

  - Test utils are located in the package ./src/main/java/com/qa/challenge/util

##### Base Class

  - Base class which is the Parent of all Page classes is located in the package ./src/main/java/com/qa/challenge/base

##### Properties File

  - Properties file is located in the resources folder under ./src/main/resources/

