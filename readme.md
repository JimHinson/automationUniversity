- Install git:   
- install Maven:  
git clone ssh://git@stash.office.webassign.net:7999/~jhinson/contentqa.git


# Basic System requirements:
You'll need these to edit and run the code:
```
1. Java 1.8
2. Maven
3. IntelliJ Idea (other IDEs will be fine, but the instructions are for IntelliJ)
```

#### To Install JAVA and set path follow the below links:
Windows: `https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html#CHDEBCCJ`

OS X: `https://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html#CHDBADCG`

#### To install Maven and set path follow the below links:
`https://www.tutorialspoint.com/maven/maven_environment_setup.htm`

#### Using IntelliJ Idea ####
1. In IntelliJ, choose: File -> New -> Project from Version Control
1. Enter the URL: ssh://git@stash.office.webassign.net:7999/~jhinson/contentqa.git
1. Select 'Yes' to create a project from this code
1. Select View -> Tool Windows -> Terminal
1. In the command prompt, type: mvn test
1. This will install the remaining project requirements and launch the test
* To see your test results:
   - Navigate to `target/surefire-reports/index.html`
* The TestNG framework will also generate reports:
   - Navigate to `target/test-output/emailable-report.html`

#### Class Notes
* Request that they complete the above beforehand
* Execute the tests individually in IntelliJ
* Discuss setup and teardown
* Discuss Object Hierarchy

# Important information:
- User ID, Password and test url is located at `src/test/resources/UserData.properties`.
- Default browser for test is located at `src/test/resources/DefaultSettings.properties`. 

