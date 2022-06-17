# newsportal-IP
## Project description
A RESTful API for querying and retrieving news within and an interdepartmental organization.

## Usage/Live Link
Open the following URL in a browser -  https://newsportaljumabrian.herokuapp.com/

## Setup & installation
#### Executing the Application
* Download project zip file.
* After extraction open folder in a java IDE.
* Executing App.java should launch the application on your computer's local host.
* Fetch site url from the IDE terminal and open inside browser.
#### Database Set-up
+ Type `psql` command to connect to postgres server the server.
+ Proceed to create the database `news_portal` by typing: `CREATE DATABASE news_portal;`
+ Now connect to news portal database using`\c news_portal;`
+ Once connected, create the following tables by running these commands:
```
CREATE TABLE users (id serial primary key, name varchar, position varchar, role varchar, department varchar);
CREATE TABLE news (id serial primary key, title varchar, description varchar, type varchar, author varchar);
CREATE TABLE departments (id serial primary key, name varchar, description varchar, totalemployees int);
CREATE TABLE departments_users (id serial primary key, deptid int, userid int);
CREATE TABLE departments_news (id serial primary key, deptid int, newsid int, userid int);
CREATE DATABASE news_portal_test WITH TEMPLATE news_portal;
```
###### Routes
+ Use the following paths.
+ `/users` Lists all the users
+ `/departments` Gets all the departments
+ `/news` Get all news news

## Built with
+ Java programming.
+ Spark routing.
+ Junit for unit testing.
+ PostgreSQL database.
+ Maven build tool.


## Contribution
This is an open project and so all contributions are welcome.
* Fork project.
* Make modification.
* Submit a pull request for review.

## Author
Brian Juma.
<br>
Contact me via email: njengabrianj@gmail.com

## License 
The project is served under the MIT LICENSE copyright &copy; 2022 jumaBrian.
View <a href="https://github.com/jumaBrian/newsportal-IP/blob/master/LICENSE">license.</a>