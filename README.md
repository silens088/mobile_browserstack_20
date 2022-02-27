![](src/images/logo_main.png)

# Проект по мобильной автоматизации на базе [browserstack.com](https://www.browserstack.com/)

## Технологический стек::

| Java | Selenide | Gradle | Junit5 | Selenoid | Jenkins | IntelliJ IDEA | Allure Report | Allure Testops | Telegram |
|:------:|:----:|:------:|:------:|:--------:|:--------:|:-------------:|:---------:|:---------:|:--------:|
| ![Java](src/images/icons/Java.png) | ![Selenide](src/images/icons/Selenide.png) | ![Gradle](src/images/icons/Gradle.png) | ![JUnit5](src/images/icons/JUnit5.png) | ![Selenoid](src/images/icons/Selenoid.png) | ![Jenkins](src/images/icons/Jenkins.png) | ![Intelij_IDEA](src/images/icons/Intelij_IDEA.png) | ![Allure Report](src/images/icons/Allure_Report.png) | ![AllureTestOps](src/images/icons/AllureTestOps.png) | ![Telegram](src/images/icons/Telegram.png) |


## Параметры запуска

Run tests locally:
```bash
gradle clean test
```

Serve report:
```bash
allure serve build/allure-results
```


## Отчеты о прохождении тестов можно смотреть в Allure Report

![](src/images/screenshots/allure1.png)

Подробный отчет по тестам в Allure Report

![](src/images/screenshots/allure2.png)

## Хранение тестовой документации организовано в Allure TestOps

![](src/images/screenshots/allure_testops.png)

## Настроена интерграция с Jira

![](src/images/screenshots/Jira001.png)

## Удаленный запуск тестов возможен через - Jenkins job

![](src/images/screenshots/jenkins.png)


