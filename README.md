This is a initial version of the basic cucumber BDD Approach based framework for selenium

<img width="1640" height="835" alt="image" src="https://github.com/user-attachments/assets/cd911416-9254-4699-aea3-c54fb949ca90" />

1. The Acceptance criteria in Gherkin makes it easy for any tester to breakdown the feature into scenarios and hence tests and thus also ensure that all the important assertions specified in the Then clause are covered thus reducing the time and effort required to derive the test cases.
   
2. The feature file houses within itself all the scenarios or sub-flows which as a whole reflect the user journey/execution flow.
   
3. How does execution take place? , this happens as the feature files written using Gherkin are glued with the java code by an intermediate steps.java file, the automation code w.r.t each web page on the application web page is stored separately which is nothing but the Page Object Model, the Steps file calls the relevant method in the .java page code base performing the respective action described in the feature file, the assertions rest within the steps files while the automation actions are housed inside the page object files.

4. Helper/utility classes are created which house code relevant to performing certain actions, reducing boilerplate or repetitive code in general terms.

5. Config file stores static assets such as the application url.

6. The ApplicationHooks class controls the prerequisites and post actions w.r.t complete project applicable to all features, Its capability would be enhanced with Cucumber Annotations as below"
   a.) @Before: This annotation takes care of initialization such as that of the Config Reader and WebDriver.
   b.) @After: This annotation takes care of the post steps such as quitting the Webdriver and taking screenshots in special cases such as if any scenario has failed.

7. Then we have the project POM.xml which is the basis of the maven build , the dependencies defined here instruct maven to download the relevant jars, while the plugins enable execution of the maven lifecycle such as maven build,test, deploy.

8. The TestRunner class takes care of the execution , wherein the a tag can be passed which is basically housed on top of the features required for execution and those particular scenario(s) are executed by the TestRunner for which tag is passed.
