# newsportal-IP
##### Brian Juma
## Project description
A RESTful API for querying and retrieving news within and an interdepartmental organization.

## Setup & installation

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
