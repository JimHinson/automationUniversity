# Basic System requirements:

Following are basic system requirements in order to run this code.

```
1. Java 1.8
2. Maven
3. Any IDE for code editing
```

#### To Install JAVA and set path follow the below links:
Windows: `https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html#CHDEBCCJ`
OS X:
`https://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html#CHDBADCG`

#### To install Maven and set path follow the below links:
`https://www.tutorialspoint.com/maven/maven_environment_setup.htm`

#### Download and Install Eclipse IDE (Required for code edit and to run using TestNg):
`https://www.eclipse.org/downloads/packages/installer`
TestNg plugin for eclipse `https://marketplace.eclipse.org/content/testng-eclipse` 

#### Import project in Eclipse IDE:
- Launch eclipse IDE.
- Click on `File` and select `Import`
- Click on Maven folder and select `Existing Maven Project` and click next
- Select `Root Directory` as your project folder (It will display pom.xml as auto selected).
- Click next and finish.



# Exection reports (use any browser to access the following pages):

#### Maven surefire reports:
- Navigate to `target/surefire-reports/index.html`

#### TestNG Reports:
- Navigate to `target/test-output/emailable-report.html`




# Run automated tests:

## In order to run the automated test please follow the below steps:

#### Run code using Maven:
- Open Command-prompt/Terminal and navigate to project folder.
- Once in the project folder type in following command:

```
mvn clean test
```

#### Run code using TestNg:
- Right click on Project from project explorer.
- Select `Run As` and click on `TestNG Test`.



# Important information:

- User ID, Password and test url is located at `src/test/resources/UserData.properties`.
- Default browser for test is located at `src/test/resources/DefaultSettings.properties`. 

