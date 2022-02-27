![](images/logo_main.png)

# Проект по мобильной автоматизации на базе [browserstack.com](https://www.browserstack.com/)

## Технологический стек::

| Java | Selenide | Gradle | Junit5 | Selenoid | Jenkins | IntelliJ IDEA | Allure Report | Allure Testops | Telegram |
|:------:|:----:|:------:|:------:|:--------:|:--------:|:-------------:|:---------:|:---------:|:--------:|
| ![Java](images/icons/Java.png) | ![Selenide](images/icons/Selenide.png) | ![Gradle](images/icons/Gradle.png) | ![JUnit5](images/icons/JUnit5.png) | ![Selenoid](images/icons/Selenoid.png) | ![Jenkins](images/icons/Jenkins.png) | ![Intelij_IDEA](images/icons/Intelij_IDEA.png) | ![Allure Report](images/icons/Allure_Report.png) | ![AllureTestOps](images/icons/AllureTestOps.png) | ![Telegram](images/icons/Telegram.png) |


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

![](images/screenshots/allure1.png)

Подробный отчет по тестам в Allure Report

![](images/screenshots/allure2.png)

## Хранение тестовой документации организовано в Allure TestOps

![](images/screenshots/allure_testops.png)

## Настроена интерграция с Jira

![](images/screenshots/Jira001.png)

## Удаленный запуск тестов возможен через - Jenkins job

![](images/screenshots/jenkins.png)


