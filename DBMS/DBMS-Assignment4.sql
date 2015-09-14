USE library_database;

-- Assignment 1
/* 1. Write a SELECT command to display name of those members
who belong to the category as to which member
“Arushi” belongs.


Note: Solve the problem using subquery.
*/

SELECT 
    member_name
from
    members
where
    category = (SELECT 
        category
    from
        members
    where
        member_name = 'arushi');
        
/* 2. Write a SELECT command to display information on the books
that have not been returned till date. The information should
include book issue date, title, member name and due date.

Note: Use Correlated Subquery.
*/
-- Inserting a row in book_issue to get the result

INSERT INTO book_issue (accession_no,member_id)
VALUES((SELECT accession_no FROM books where title_id=ALL(SELECT title_id FROM titles where title_name='PAPER TOWN')),
(SELECT member_id FROM members where member_name='AJ'));

-- Checking query


SELECT 
    bi.issue_date, bi.due_date, m.member_name, t.title_name
from
    book_issue bi
        inner join
    books b ON bi.accession_no = b.accession_no
        inner join
    titles t ON b.title_id = t.title_id
        inner join
    members m ON bi.member_id = m.member_id
where
    bi.accession_no = (SELECT 
        bi1.accession_no
    from
        book_issue bi1
    where
        bi1.accession_no = bi.accession_no AND bi1.accession_no NOT IN (SELECT 
            br.accession_no
        from
            book_return br));
    

/*  3. Write a SELECT command to display information on the books
that have been returned after their due dates. The information
should include book issue date, title, member name and due
date.
Note: Use Correlated Subquery.
*/


    

SELECT 
    bi.Issue_date, t.Title_name, m.Member_name, bi.Due_date
FROM
    book_Issue bi
        INNER JOIN
    books b ON b.Accession_no = bi.Accession_no
        INNER JOIN
    titles t ON t.Title_id = b.title_id
        INNER JOIN
    Members m ON m.Member_id = bi.Member_id
WHERE
    EXISTS( SELECT 
        br.member_id, br.issue_date, br.accession_no
    FROM
        book_return br
    WHERE
        br.issue_date = DATE(bi.issue_date) AND br.member_id = bi.member_id AND br.accession_no = bi.accession_no AND br.Return_date > bi.Due_Date);

 /*4-Write a SELECT command to display information of those books
whose price is equal to the most expensive book purchase so far.
*/

SELECT 
    b.accession_no, b.title_id, b.purchase_date, b.price
FROM
    books b
WHERE
    b.price = (SELECT 
        MAX(Price)
    FROM
        books) ;
        
 /* 5-Write a SELECT command to display the second maximum price
of a book.*/       
    
SELECT 
    max(price)
FROM
    books
WHERE
    price < (SELECT 
        max(price)
    FROM
        books);
        
 -- Assignment 2
 /*  1--Create a View which can be used to display member name and
all issue details of the member using a simple SELECT command.
*/

CREATE VIEW ISSUE_DETAILS AS 
SELECT m.member_name,bi.issue_date,bi.accession_no,m.member_id,bi.due_date
FROM members m INNER JOIN book_issue bi ON bi.member_id=m.member_id;

SELECT 
    *
FROM
    ISSUE_DETAILS;
 
 
 /*2--- Create a View which contains three columns, member name,
member id and full description of category, i.e., Faculty, Students
and Others instead of F,S and O.*/

CREATE VIEW fullDescriptionOfCategory AS
SELECT Member_id,Member_name,IF(person_type='F','Faculty',
IF(person_type='S','Student',IF(person_type='O','Others',NULL))) AS Category FROM Members;

SELECT 
    *
FROM
    fullDescriptionOfCategory;


/*  3--    Create a View which contains the information – subject name,
title, member name, category, issue date, due date and return
date. If the books have not been returned, NULL should be
displayed instead of return date.*/

CREATE VIEW returnDetailsOfBooks AS SELECT s.Subject_name,t.Title_id,m.Member_name,
m.Category,bi.Issue_date,bi.Due_date,br.Return_date 
FROM  Book_return br RIGHT OUTER JOIN
Book_issue bi ON br.Member_id=bi.Member_id
INNER JOIN Members m ON bi.Member_id=m.Member_id 
INNER JOIN Books b ON b.Accession_no=bi.Accession_no 
INNER JOIN Titles t ON b.Title_id=t.Title_id 
INNER JOIN Subjects s ON s.Subject_id=t.Subject_id ;

SELECT 
    *
FROM
    returnDetailsOfBooks;

        
        
        
