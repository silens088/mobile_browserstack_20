![](src/images/logo_main.png)

# Проект по мобильной автоматизации на базе  [browserstack.com](https://www.browserstack.com/)

## Technology Stack:

| Java | Selenide | Gradle | Junit5 | Selenoid | Jenkins | IntelliJ IDEA | Allure Report | Allure Testops | Telegram |
|:------:|:----:|:------:|:------:|:--------:|:--------:|:-------------:|:---------:|:---------:|:--------:|
| ![Java](src/images/icons/Java.png) | ![Selenide](src/images/icons/Selenide.png) | ![Gradle](src/images/icons/Gradle.png) | ![JUnit5](src/images/icons/JUnit5.png) | ![Selenoid](src/images/icons/Selenoid.png) | ![Jenkins](src/images/icons/Jenkins.png) | ![Intelij_IDEA](src/images/icons/Intelij_IDEA.png) | ![Allure Report](src/images/icons/Allure_Report.png) | ![AllureTestOps](src/images/icons/AllureTestOps.png) | ![Telegram](src/images/icons/Telegram.png) |


## Allure TestOps

Смотри отчёт о прохождении автотестов в Allure Report

![](src/images/screenshots/allure1.png)

Подробный отчет по тестам в Allure Report

![](src/images/screenshots/allure2.png)

## Хранение тестовой документации в Allure TestOps

![](src/images/screenshots/allure test ops.png)

## Интерграция с Jira

![](src/images/screenshots/Jira001.png)

## Запускай тесты удаленно через - Jenkins job!

![](src/images/screenshots/jenkins.png)


## Параметры запуска

Run tests locally:
```bash
gradle clean test
```

Serve report:
```bash
allure serve build/allure-results
```