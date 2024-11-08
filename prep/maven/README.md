# Set up

I started by creating the folder `maven`
- Then right-clicked that folder in VS Code > `maven` > `New Project`
- select `maven-archetype-quickstart` > top version `1.4`
- Then accept `com.example` > `demo`.
- VS Code termainl will pop up and you'll have to press "enter" to accept default settings for the maven project. 
- 

Then you can use the terminal or VS Code's termainal...
- `cd prep/maven/demo`
- `mvn package`
- If no error > `

First time error handling...
- on the `mvn package` step...
- I got an error that source option 7 is no longer available, so open `pom.xml`
- And change to version 1.8, so it should look like this. 
```java
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
```
- Then run `mvn package` again

TO RUN
- `java -cp target/demo-1.0-SNAPSHOT.jar com.example.demo.App`