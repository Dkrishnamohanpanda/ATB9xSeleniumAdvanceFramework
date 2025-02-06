# Selenium Automation Framework(with Java)

- Author - D.krishna Mohan Panda

- Java, Selenium, TestNG
- Maven, AssertJ, POM
- Thread Local Support → Thread Safety
- Allure Report
- Excel Sheet for Test Data → Data Provider, Apache POI
- Read the username and password from Properties-
- TestNG, @Test, Before and After Method.
- Cloud Grids - BrowserStack, LambdaTest
- SonarLint, Java > 22
- Run Local and on Selenoid Integration.

<img width="1024" alt="Screenshot 2023-10-31 at 12 27 14 PM" src="https://github.com/PramodDutta/AdvanceSeleniumFrameworkTTA/assets/1409610/02b0ef3b-1165-46cf-8c9d-89e41b17032f">


`mvn test -Dsurefire.suiteXmlFiles=testng.xml`


<img width="1215" alt="Screenshot 2023-10-31 at 12 27 28 PM" src="https://github.com/PramodDutta/AdvanceSeleniumFrameworkTTA/assets/1409610/b0905741-d88d-4559-93c2-65433e668170">

How to add log4j ?

Add this to the pom.xml
<groupId>org.apache.logging.log4j</groupId>
<artifactId>log4j-core</artifactId>
<version>3.0.0-beta2</version>
</dependency>

    <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-api</artifactId>
      <version>3.0.0-beta2</version>
    </dependency> 
Add log4j2.xml in the main folder -> resource
https://gist.github.com/Dkrishnamohanpanda/57956d63f36d7b098ddb4caedfc71f41
To your Code
-     private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF_DM.class);

file
logger.info("Starting Test");
