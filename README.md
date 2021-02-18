# **QA SFIA 1**	<img align="right" width="100" height="100" src="http://www.apprenticeshipguide.co.uk/wp-content/uploads/2018/01/QA-logo-2019-3.jpg">


## Employee Role Assignment


### Index

1. [Introduction](#Introduction)
2. [Technologies](#Technologies)
3. [Scope](#Scope)
4. [General Approach](#General-Approach)
5. [ERD](#ERD)
6. [Front End](#Front-End)
7. [Back End](#Back-End)
8. [CI Pipeline](#CI-Pipeline)
9. [Project Tracking](#Project-Tracking)
10. [Risk Assessment](#Risk-Assessment)
11. [Testing](#Testing)
12. [Improvements](#Improvements)
13. [Bibliography](#Bibliography)

### Introduction

Welcome to the introduction of my project

### Technologies

- Kanban Board: **Jira**

- Database: **GCP Managed SQL Server**

- Programming Language: **Java**

- Front-End: **HTML, CSS, JavaScript**

- Unit Tests: **JUnit and Mockito**

- Integration Tests: **Selenium**

- Version Control: **Git**

- CI Server: **CircleCi**

- Cloud Server: **GCP Virtual Machine**

### Scope

- A Jira board with full expansion on user stories, use cases and tasks needed to complete the project.

- Clear Documentation from a design phase describing the architecture you will use for your project.

- A detailed Risk Assessment created at the beginning of your project.

- A relational database used to store data persistently for the project.

- A functional application created in the OOP language, following best practices and design principles, that you have covered during training, this application needs to meet the requirements set on your Kanban Board

- The application must have a functioning front-end website and integrated API.

- Fully designed test suites for the application you are creating, as well as automated tests for validation of the application.

- You must meet an acceptable level of test coverage in your backend and provide consistent reports and evidence that you have done so.

- Code fully integrated into a Version Control System

- Code built through a CI server

- Application deployed to a cloud-based virtual machine


### General Approach

### ERD

For my project the databases are connecting and linking to each other in some way. This is done through primary key and foreign keys. An easy way to visualise this is by making an Entity Relationship (ER) diagram. From the diagram you can see 4 of my tables and lines that connect to each other as seen below:
<p align="center">
  <img width="811" height="711" src="https://icecube-eu-286.icedrive.io/thumbnail?p=QKQT%2B16neK2ds664x5r7hCczwAtVHyq6Ss4TDm3MclDRWU3zgmOTEtNiozlQmorKIBvDpeFu3Gka6s%2BL7mRPRotw5xHkfva9oNdmPShazlI81CtJXnkwkOwm7vHJh69P&w=1280&h=1280&m=cropped">
</p>

After a quick glance at my diagram you can see that primary keys always match up to foreign keys. The next term to determine is the exact relationship the two tables have between each other and vice versa

These relationships are described as One-to-one, One-to-many, Many-to-one and Many-to-many. These relationships are assigned to everysingle link that you can see on the diagram, which will be expressed below:

Employee > Job title (One-to-one) - An employee will have a job title / A job title is assigned to an employee

Job title > Restrictions (One-to-Many) - A job will have many restrictions / Many restrictions are assigned to a job.

Job title > Location (Many-to-One) - A location will have many jobs / Many jobs are at a location






### Front End

### Back End

### CI Pipeline

### Project Tracking

### Risk Assessment

### Testing

### Improvements

### Bibliography