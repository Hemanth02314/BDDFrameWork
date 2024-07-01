Swag Labs Retail Automation Framework

Overview:

Swag Labs Retail Automation Framework is a structured, layered framework designed for behavior-driven development (BDD). BDD encourages collaboration and discussion to determine the desired behavior of a user story. This framework leverages Cucumber for BDD, integrating it with tools to generate comprehensive, human-readable test reports.
Framework Structure
1. Packages:

    browserControl: Manages browser initialization, configuration, and control.
    features: Contains feature files written in Gherkin syntax.
    pageObjects: Encapsulates web pages and their elements as Java classes.
    stepDefinitions: Implements step definitions that map Gherkin steps to Java code.
    utilities: Includes utility classes and reusable methods.
    TestRunner: Contains classes to execute Cucumber tests and generate reports.

2. Detailed Explanation of Each Component:

Feature Files
Feature files are written in Gherkin syntax and describe the application's features and scenarios in a human-readable format. Each file corresponds to a specific feature and includes multiple scenarios.
Step Definitions

Step definitions link the steps in your feature files to Java methods. This is where the actual implementation of the steps occurs. Each Gherkin step is mapped to a corresponding method in the step definition class.
Page Objects

Page objects represent the web pages of your application. They contain methods to interact with web elements on the page, encapsulating the page's structure and behavior, which promotes reusability and maintainability.
Runner Classes
Runner classes are used to execute the Cucumber tests. They specify the location of feature files and step definitions using the @CucumberOptions annotation, and also configure report generation.

Hooks
Hooks are used for setup and teardown activities before and after each scenario. They ensure that the environment is properly initialized and cleaned up for each test run.
Utility Classes (src/test/java/com/example/utils)

Utility classes contain reusable methods and configurations, such as browser driver setup and configuration methods that are used across multiple classes.
Setting Up Cucumber

1. Add Cucumber Dependencies
Ensure Cucumber is properly set up in your project. For Maven, add the necessary dependencies in your pom.xml:

Po.xml

<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>6.10.4</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>6.10.4</version>
    <scope>test</scope>
</dependency>

2. Create Feature Files

Create feature files containing your BDD scenarios, e.g., example.feature.
3. Implement Step Definitions

Implement the step definitions in a Java class, e.g., StepDefinitions.java.
4. Configure Cucumber Runner

Create a JUnit test runner for Cucumber, e.g., RunCucumberTest.java, and configure it with the @CucumberOptions annotation:

java

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.example.steps",
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class RunCucumberTest {
}

5. Run Tests and Generate Reports

Run the RunCucumberTest class as a JUnit test. This will execute your Cucumber scenarios and generate reports.
6. View the HTML Report

After running the tests, an HTML report will be generated in the specified directory (target/cucumber-reports.html).
Advanced Reporting Options

Cucumber provides various plugins for advanced reporting, such as JSON and XML reports, which can be used for further analysis and integration with CI/CD pipelines.
Viewing Test Reports in IntelliJ IDEA

Test Reports:
Run Your Tests: Use the Run or Debug buttons in the toolbar, or right-click on your test class/method and select Run.
Test Results Tool Window: After running the tests, the Test Results window will open automatically, showing the results of your tests.
Navigate to Test Report: To view detailed information about a specific test, click on the test in the Test Results window.

Code Coverage and Inspection Reports

IntelliJ IDEA provides tools for viewing code coverage and inspection results, helping you ensure that your code meets quality standards.
