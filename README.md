# Web_Portal_Test-Automation_Selenium_Junit-Gradle

I test Green University student web portal functional test in JUnit Selenium
Please Watch Screen rec. for better Understanding my project.

https://drive.google.com/file/d/1tOizMd2quJx4b7ffopZ5ewCi6YQLnQbv/view?usp=sharing

## Technology:
- Tool: selenium
- IDE: IntelIJ
- Build tool: Gradle
- Language: Java
- Test_Runner: Junit

## Requirement:
1. Navigate to portal site
2. Need a unique student ID account with  passwordd

## Prerequisite:
1. Need to install jdk 1.8
2. Need good internet connectivity

## Run the automation script:
1. Open cmd to the project folder
2. Type this command:

```sh
gradle clean test
```
3. Selenium will open the browser and start automation.
4. To view report, type this command:
```sh
allure generate allure-results --clean -o allure-report
allure serve allure-results
```
## Report View & Screen Rec. 
## https://drive.google.com/file/d/19qNEPCCq74EF70hbRqWR7BEhqv7iwK8k/view?usp=sharing

![image](https://user-images.githubusercontent.com/87892957/134741387-693c7fb6-bc88-492d-a23f-080049215dc6.png)

