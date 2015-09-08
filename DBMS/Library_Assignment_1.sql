/*Creating database*/
CREATE DATABASE Library_Database;
USE Library_Database;
/*Creating table members*/
CREATE TABLE Members(
member_id INT PRIMARY KEY AUTO_INCREMENT,
member_name VARCHAR(20),
addressLine1 VARCHAR(20),
addressLine2 VARCHAR(20),
category CHAR);
/*Creating table authors*/
CREATE TABLE Authors(
author_id INT PRIMARY KEY AUTO_INCREMENT,
author_name VARCHAR(20));
/*Creating table publishers*/
CREATE TABLE Publishers(
publisher_id INT PRIMARY KEY AUTO_INCREMENT,
publisher_name VARCHAR(20));
/*Creating table subjects*/
CREATE TABLE Subjects(
subject_id INT PRIMARY KEY AUTO_INCREMENT,
subject_name VARCHAR(20));
/*Creating table titles*/
CREATE TABLE Titles(
title_id INT PRIMARY KEY AUTO_INCREMENT,
title_name VARCHAR(20),
subject_id INT,
publisher_id INT,
FOREIGN KEY(subject_id) REFERENCES subjects(subject_id),
CONSTRAINT publisher_id_first
FOREIGN KEY(publisher_id)REFERENCES publishers(publisher_id)
ON DELETE CASCADE
);
/*Creating table title_author*/
CREATE TABLE Title_author(
title_id INT,
author_id INT,
PRIMARY KEY(title_id,author_id),
FOREIGN KEY(title_id) REFERENCES titles(title_id),
FOREIGN KEY(author_id) REFERENCES authors(author_id));
/*Creating table books*/
CREATE TABLE Books(
accession_no INT PRIMARY KEY AUTO_INCREMENT,
title_id INT,
purchase_date DATE,
price INT,
status INT,
FOREIGN KEY(title_id) REFERENCES titles(title_id) ON DELETE CASCADE
);
/*Creating table book_issue*/
CREATE TABLE Book_issue(
issue_date DATE,
accession_no INT,
member_id INT,
due_date DATE,
PRIMARY KEY(issue_date,accession_no,member_id),
FOREIGN KEY(accession_no) REFERENCES books(accession_no),
CONSTRAINT member_id_first
FOREIGN KEY(member_id) REFERENCES members(member_id)
ON DELETE CASCADE
);

/*Creating table book_return*/
CREATE TABLE Book_return(
return_date DATE,
issue_date DATE,
accession_no INT,
member_id INT,
PRIMARY KEY(return_date,accession_no,member_id),
FOREIGN KEY(accession_no) REFERENCES books(accession_no),
CONSTRAINT member_id_second
FOREIGN KEY(member_id) REFERENCES members(member_id)
ON DELETE CASCADE
);

/*Altering table book_issue defining default value*/
ALTER TABLE Book_issue
MODIFY COLUMN issue_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP();
/*Creating trigger for----Alter definitions of following LIS tables to provide the default constraints
Book_Issue
Due_dt
Current date + 15 days
*/
CREATE TRIGGER BookTrigger
BEFORE
INSERT 
ON Book_issue  
FOR EACH ROW 
SET NEW.due_date = NOW() + INTERVAL 15 day;

/*Showing all tables*/
SHOW CREATE TABLE Book_issue;
/*Drooping foreign key so that can drop members table*/
ALTER TABLE Book_issue
DROP FOREIGN KEY member_id_first;
/*Drooping foreign key so that can drop members table*/
ALTER TABLE Book_return
DROP FOREIGN KEY member_id_second;

/*Drooping  members table*/

DROP TABLE Members;
/*Creating member table again*/
CREATE TABLE Members(
member_id INT PRIMARY KEY AUTO_INCREMENT,
member_name VARCHAR(20),
addressLine1 VARCHAR(20),
addressLine2 VARCHAR(20),
category CHAR);
/*Setting up references again*/
ALTER TABLE Book_issue
ADD CONSTRAINT member_id_first
FOREIGN KEY (member_id)
REFERENCES Members(member_id);
/*Setting up references again*/
ALTER TABLE Book_return
ADD CONSTRAINT member_id_second
FOREIGN KEY (member_id)
REFERENCES Members(member_id);



