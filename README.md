# hellospringboot
This is a hello world project to demonstrate how to use SpringBoot.

SpringBoot is a spring utility which is shipped as a dependency to your Spring project to help include neccessary libraries for various tasks such as web api (SpringMVC), object relational mapping (ORM).

This example shows how to start a SpringMVC based app in a so easy way. 

Here is step to include SpringBoot into a project.

Step 1:
Create a empty Maven project using IntelliJ IDEA.
IntelliJ is start enough to generate a structure which includes the following directory:
src
  main
    java
    resources
  test
    java
    resources
pom.xml

You can create this directory manually or you can use command: mvn archetype:generate. After that, use IntelliJ IDEA to import your project.

Step 2: 
To use SpringBoot we need to add 2 things into the pom.xml file

First, we need to add spring-boot-starter-parent as the parent of our own project. 

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.5.7.RELEASE</version>
    </parent>
    
Second, we have to add spring-boot-starter-web to dependency list so that SpringBoot can inject required stuffs to run a web application for us such as web.xml with different servlet and servlet mapping. 

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>
    
 Step 3: 
 You can run your SpringMVC project now by either clicking Run button on IntelliJ IDEA or run mvn command line: mvn spring-boot:run
 
 Congratulation
"# Third-springboot" 
