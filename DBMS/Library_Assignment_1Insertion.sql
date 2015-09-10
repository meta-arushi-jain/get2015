USE LIBRARY_DATABASE;
/*Inserting into members--------Assignment-3*/
INSERT INTO Members (member_name,addressLine1,addressLine2,category )
VALUES( "AJ","16","jaipur",'f');

INSERT INTO Members (member_name,addressLine1,addressLine2,category )
VALUES( "arushi","2","jaipur",'f');

INSERT INTO Members (member_name,addressLine1,addressLine2,category )
VALUES( "sumitra","18","chittor",'f');

INSERT INTO Members (member_name,addressLine1,addressLine2,category )
VALUES( "deepali","37","neemuch",'f');

INSERT INTO Members (member_name,addressLine1,addressLine2,category )
VALUES( "priya","75","kota",'f');

/*Inserting into subjects*/
INSERT INTO Subjects (subject_name)
VALUES("Novel");

INSERT INTO Subjects (subject_name)
VALUES("IT");

INSERT INTO Subjects (subject_name)
VALUES("Business");

INSERT INTO Subjects (subject_name)
VALUES("Campus");

INSERT INTO Subjects (subject_name)
VALUES("Technology");

/*Inserting into publishers*/
INSERT INTO Publishers (publisher_name)
VALUES("Tata_mc_Hill");

INSERT INTO Publishers (publisher_name)
VALUES("Pearson");

INSERT INTO Publishers (publisher_name)
VALUES("Scootney Books");

INSERT INTO Publishers (publisher_name)
VALUES("Arihant");

INSERT INTO Publishers (publisher_name)
VALUES("Amazing");

/*Inserting into authors*/
INSERT INTO Authors (author_name)
VALUES("White Johnson");

INSERT INTO Authors (author_name)
VALUES("Dull Ann");

INSERT INTO Authors (author_name)
VALUES("Groon Marjorie");

INSERT INTO Authors (author_name)
VALUES("Branath Abraham");

INSERT INTO Authors (author_name)
VALUES("Smith Meander");

/*Inserting into titles*/
INSERT INTO Titles (title_name,subject_id,publisher_id)
VALUES("DBMS",(SELECT subject_id FROM Subjects where subject_name='Technology'),
(SELECT publisher_id FROM Publishers where publisher_name='Scootney Books'));

INSERT INTO Titles (title_name,subject_id,publisher_id)
VALUES("Operating System",(SELECT subject_id FROM Subjects where subject_name='Technology'),
(SELECT publisher_id FROM Publishers where publisher_name='Technology'));

INSERT INTO Titles (title_name,subject_id,publisher_id)
VALUES("Ansi C",(SELECT subject_id FROM Subjects where subject_name='Technology'),
(SELECT publisher_id FROM Publishers where publisher_name='Technology'));

INSERT INTO Titles (title_name,subject_id,publisher_id)
VALUES("The PRESENT",(SELECT subject_id FROM Subjects where subject_name='Technology'),
(SELECT publisher_id FROM publishers where publisher_name='New Moon Books'));

INSERT INTO Titles (title_name,subject_id,publisher_id)
VALUES("PAPER TOWN",(SELECT subject_id FROM Subjects where subject_name='Technology'),
(SELECT publisher_id FROM Publishers where publisher_name='Five Publishing'));
/*Inserting into books*/
INSERT INTO Books (title_id,purchase_date,price,status)
VALUES((SELECT title_id FROM Titles where title_name='Ansi C'),NOW(),2000,1);

INSERT INTO Books (title_id,purchase_date,price,status)
VALUES((SELECT title_id FROM Titles where title_name='Operating System'),NOW(),4000,0);

INSERT INTO Books (title_id,purchase_date,price,status)
VALUES((SELECT title_id FROM Titles where title_name='The PRESENT'),NOW(),8000,1);

INSERT INTO Books (title_id,purchase_date,price,status)
VALUES((SELECT title_id FROM Titles where title_name='PAPER TOWN'),NOW(),900,0);

INSERT INTO Books (title_id,purchase_date,price,status)
VALUES((SELECT title_id FROM Titles where title_name='DBMS'),NOW(),3000,0);

/*Inserting into title_author*/
INSERT INTO Title_author (title_id,author_id)
VALUES((SELECT title_id FROM Titles where title_name='Ansi C'),(SELECT author_id FROM Authors where author_name='Dull Ann'));
/*Inserting into book_issue*/
INSERT INTO Book_issue (accession_no,member_id)
VALUES((SELECT accession_no FROM books where title_id=ALL(SELECT title_id FROM Titles where title_name='Ansi C')),
(SELECT member_id FROM Members where member_name='arushi'));

/*Inserting into Book_return*/
INSERT INTO Book_return(return_date,issue_date,accession_no,member_id)
VALUES((SELECT due_date from Book_issue where member_id =2),
(SELECT issue_date from Book_issue where member_id=2),
(SELECT accession_no FROM Book_issue where member_id=2),2);


/*Change value of addressLine2 column of Members table with “Jaipur”.
*/

SET SQL_SAFE_UPDATES=0;
UPDATE Members SET addressLine2='Jaipur' where member_id=member_id ;

/*Change value of addressLine1 column of Members table with value “EPIP, Sitapura” for the members belonging to category “F”.
*/
UPDATE Members SET addressLine1='EPIP, Sitapura' where category='f' ;

ALTER TABLE Titles
DROP FOREIGN KEY publisher_id_first;
/* Delete all the rows from Publishers table.*/
Delete from Publishers;

/* Insert the sample data back in Publishers table using substitution variables.
.*/
SET @name= 'New Moon Books';
INSERT INTO Publishers (publisher_name)
VALUES(@name);

SET @name= 'Tecnology';
INSERT INTO Publishers (publisher_name)
VALUES(@name);

SET @name= 'Scootney Books';
INSERT INTO Publishers (publisher_name)
VALUES(@name);


/* Delete those rows of Titles table belonging to Publisher with publisher_id = 1
.*/
DELETE FROM Titles where publisher_id=1;
