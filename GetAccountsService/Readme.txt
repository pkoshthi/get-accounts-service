
(1) Run the GetAccountsService as "Spring Boot App" in STS. Ensure that the application is running on default Tomcat port 8080 by seeing the console.

(2)	Access h2-console in browser using the below URL
	http://localhost:8080/h2-console
	Once you hit this URL in browser, It will redirect to Login page. Please make ensure that the database details populated are as per the application.properties file.
	
	For Example : If the application.properties file is configured as below
	spring.datasource.url=jdbc:h2:mem:test
	spring.datasource.driverClassName=org.h2.Driver
	spring.datasource.username=sa
	spring.datasource.password=
	
	The same values should appear in h2 login page as below.
	Driver Class : org.h2.Driver
	JDBC URL : jdbc:h2:mem:test
	User Name : sa
	Paassword :
	
	Click on "Connect" button, then you can find SQL editor
	Execute below SQL commands and ensure the details stored in database.
	
	SELECT * FROM Account;
	INSERT INTO Account VALUES(1001,'Saving',2000.00,201,1);
	INSERT INTO Account VALUES(1002,'Current',2000.00,201,1);
	INSERT INTO Account VALUES(1003,'Saving',3000.00,202,1);
	INSERT INTO Account VALUES(1004,'Saving',4000.00,202,0);
	INSERT INTO Account VALUES(1005,'Fixed Deposits',5000.00,201,1);
	INSERT INTO Account VALUES(1006,'Recurring Deposits',500.00,202,0);
	
	
(3)	Hit the AccountService end point in browser as below. Here -->201 and 202 are the customer Ids.
	http://localhost:8080/account/201
	http://localhost:8080/account/202

