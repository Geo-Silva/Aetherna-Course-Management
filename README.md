# Aetherna Course Manager 

This is a simple program, used as part of my studies in Angular-Spring. It's a very simple CRUD application in which you can add, edit, delete and view courses. This project serves as proof of my knowledge in both Frontend and Backend technologies. Feel free to download it and see for yourself! Thanks!

<br>

![Markdown](https://img.shields.io/badge/-Markdown-black?style=flat&logo=markdown)&nbsp;
![MySql](https://img.shields.io/badge/-MySql-black?style=flat&logo=mysql)&nbsp;
![Eclipse](https://img.shields.io/badge/-Eclipse-black?style=flat&logo=eclipse-ide&logoColor=orange)
![Spring Tool Suite](https://img.shields.io/badge/-Spring%20Tool%20Suite-black?style=flat&logo=Spring&logoColor=green)&nbsp;
![Visual Studio Code](https://img.shields.io/badge/-Visual%20Studio%20Code-black?style=flat&logo=visual-studio-code&logoColor=007ACC)&nbsp;

<br>

## Front end

### Technologies :  ![HTML](https://img.shields.io/badge/-HTML-black?style=flat&logo=HTML5)&nbsp; ![CSS](https://img.shields.io/badge/-CSS-black?style=flat&logo=CSS3&logoColor=1572B6)&nbsp; ![Bootstrap](https://img.shields.io/badge/-Bootstrap-black?style=flat&logo=bootstrap)&nbsp; ![Typescript](https://img.shields.io/badge/-Typescript-black?style=flat&logo=typescript)&nbsp; ![Angular](https://img.shields.io/badge/-Angular-black?style=flat&logo=angular&logoColor=red)&nbsp;


Basing my concepts on the best practices of the front end developing, I'm using Angular, a typescript framework, developed by Google. Angular is a framework based on the component concept. Each part of the code can be a component, with their own logic and peculiarities.

## Back end

### Technologies :  ![Java](https://img.shields.io/badge/-Java-black?style=flat&logo=Java)&nbsp;  ![Node.js](https://img.shields.io/badge/-Node.js-black?style=flat&logo=node.js)&nbsp;  ![Npm](https://img.shields.io/badge/-Npm-black?style=flat&logo=npm)&nbsp;  ![Postman](https://img.shields.io/badge/-Postman-black?style=flat&logo=postman)&nbsp;  ![Maven](https://img.shields.io/badge/-Maven-black?style=flat&logo=maven)&nbsp;  ![Spring](https://img.shields.io/badge/-Spring-black?style=flat&logo=spring)&nbsp;  ![Mockito](https://img.shields.io/badge/-Mockito-black?style=flat&logo=mockito)&nbsp;


To develop the back-end, I used Spring Boot (a Java framework) and Apache Maven to compile the application.

The packages were structured following the MVC (Model, View and Controller) Standard. I created and deployed a REST (Representational State Transfer) API using SpringBoot and MySQL, applying JPA (Java Persistence API) and Hibernate (an object/relational mapping tool for Java environments).

I applied data validation and exception handling and properly use the HTTP protocol. 
The client application represents the front end, that is directly connected with the back end, which recieves request from the front end in the REST controller layer ( the resource layer). 

The REST layer -  where I implemented the logic - and the service layer, has the power to access the data layer and the repositories. The services and repositories are the ones that communicate with the application's domain class 

I also implemented a test class using Mockito. There I fully tested all outcomes and options of my service class. All of which were simple tests, due to the simple nature of the rest of the application. Also proof of my knowledge in test making and TDD
<br>
<br>

## Project installation requirements

## **Angular**
 >  Git must be installed, otherwise you can't clone the repository. You can download [here](https://git-scm.com/downloads)

1. Copy the project to your machine with the following command:

     `git clone https://github.com/Geo-Silva/Aetherna-Course-Management.git`
     
2. Import the project into your IDE (I recommend VSCode).

3. Node must be installed.
        - If you don't have node installed, download it  [here](https://nodejs.org/en/).
4.  Angular CLI must be installed.
        - If the Angular CLI is not installed, run the following command in your terminal:
    
    `npm install -g @angular/cli@latest`
    
    - The project need some dependencies to work properly. To install the dependencies used in the project, with the project's page open in the terminal, run:
    
    `npm install`
    
    - After these steps, you need to run `ng serve` . It will generate a link to be open in the browser with the application.
    
<br>

## **Spring**

1. To run the project properly, some development tools must be installed. Java JDK, Spring Tools Suite (or Eclipse) and Maven must be installed and the environment variable defined.
2. To install Java JDK
    - Download JDK [here](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)
    - Install the JDK exe File
    - Check the Directory ``C:\Program Files\Java\jdk-xxx`` if exists folder jdk;
3. To install Maven (it will compile the application)
    - Download Maven [here](https://maven.apache.org/download.cgi) ;
    - Unzip file; 
    - Create a folder named maven in ``C:\`` ; 
    - Press the Windows key on the keyboard and type: "edit system variables". Click on the option that appears.
    - In the "Environment Variables" screen that will open, click the "New" button just below the part of the screen that says "environment Variables".
    - In the variable name and value fields, fill in: ``MAVEN_HOME`` and ``C:\maven\bin``, respectively. Press "Confirm" button.
    - Check if it worked by opening a new prompt and typing ``mvn -version``. If it worked, an error will appears.
4. To install Spring Tools Suite
    - Download Spring Tools Suite [here](https://spring.io/tools)
    - Double click on the downloaded file to unzip.
    - Wait for unpacking.
    - A folder called ``sts-x.xx.x.RELEASE`` will be created in the unzip location.
    - Move the folder to a location of your choice.
    -Select the ``SpringToolSuite4`` application from inside the folder and create a shortcut on the desktop for easy access.
5. Import the project into your Spring Tools Suite.
    - File -> Import -> Maven -> Existing Maven Projects -> Next -> Browse -> Select Downloaded Project -> Finish
6. A change to the application.properties file is required.
    - It is necessary to define your database address, username and password.
    - By default these are the data, just when installing the database enter the same data for username and password 
7. Finally, start your backend application by going in the Project Explorer -> aetherna -> src/main/java -> br.com.minos.aetherna -> AethernaApplication. After you opened it, right click on the code screen -> Run As -> Java Application or go to your Toolbar and click on the green play button (first one from left to right)    

## **DataBase Note**

It's important that you create the "aetherna" schema in your database. If you don't, the Backend application won't run. To solve this simply create a schema called "aetherna" or go the DataBase folder in the project and run this file -> DDL - Create Schema and Course Table.sql - By doing this you create the necessary schema in your database, alongside the Course table. 
    - If you are unable to run the DDL.sql file, open your database, then open the DDL.sql file. copy it's content and paste on a new SQL tab for running queries. 
    - Remember to select all the content and then clicking on the lightning icon on your toolbar. This will run the current select SQL code

## Extra

I also uploaded the json collection I used in Postman for testing the Http requests

## Conclusion

Finally, thanks! I hope you liked my project and if you found any errors/bugs or have any recommendation, please enter in contact with me!
Until next time!