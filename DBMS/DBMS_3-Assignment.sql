
USE library_database;

/* Assignment-1
Question 1 : display information on books issued for more than two months
    The Information should include member_Name, member_Id, title_Name, accession_No, issue_Date,
    due_Date, and Issued for how many months and be sorted on member_Name, and within member_Name on title_Name
*/
-- Inserting values to check accuracy

INSERT INTO book_issue (accession_no,member_id)
VALUES((SELECT accession_no FROM books where title_id=ALL(SELECT title_id FROM titles where title_name='Operating System')),
(SELECT member_id FROM members where member_name='sumitra'));

INSERT INTO book_return(return_date,issue_date,accession_no,member_id)
VALUES("2015-11-23",
(SELECT issue_date from book_issue where member_id=3),
(SELECT accession_no FROM book_issue where member_id=3),3);

-- Query to execute

SELECT 
    m.member_name,
    m.member_id,
    t.title_name,
    b.accession_no,
    bi.issue_date,
    bi.due_date,
    TIMESTAMPDIFF(MONTH,
        br.issue_date,
        br.return_date) AS months_duration
FROM
    members m
        inner join
    titles t
        inner join
    books b
        inner join
    book_return br
        inner join
    book_issue bi
where
    m.member_id = bi.member_id AND bi.accession_no = b.accession_no AND b.title_id = t.title_id AND m.member_id = br.member_id AND b.status = 0;





/*   Question 2 : display those rows from members table having maximum length for member_Name
    Information should contain member_Name and length of member_Name 
*/
SELECT 
    member_name, CHAR_LENGTH(member_name) AS Length
FROM
    members
WHERE
    CHAR_LENGTH(member_name) = (SELECT 
        max(CHAR_LENGTH(member_name))
    FROM
        members);



/*  Question 3 : display count of numebr of books issued so far.
*/
SELECT 
    COUNT(DISTINCT accession_no) AS 'No. of Books Issued'
FROM
    Book_Issue;


-- Assignment-2


/*  Question 1 : display subject_wise information on numebr of books purchased.
    The information should include subject_Name, subject_id, number of books purchased.
*/
SELECT 
    subject_name,
    s.subject_Id,
    count(t.title_id) AS 'No. of books purchased'
FROM
    Subjects s,
    Titles t
WHERE
    t.subject_id = s.subject_Id
GROUP BY (subject_id);


/*  Question 2 : display those rows from the book_issue table where a book can be returned after two months.
    That is the difference in due_date and issue_Date is greater than two months
    
    
    WE WILL NOT GET ANY ROW AS WE HAVE SET IT AS ONLY FOR 15 DAYS
*/
SELECT 
    m.member_name,
    m.member_Id,
    t.title_Name,
    t.title_Id,
    bi.accession_No,
    bi.issue_Date,
    bi.due_Date,
    DATEDIFF(due_Date, issue_Date) AS DiffDate
FROM
    Members m,
    Book_Issue bi,
    Titles t,
    Books bk
WHERE
    (m.member_id = bi.member_id AND t.title_id = bk.title_id AND bk.accession_No = bi.accession_No) AND (DATEDIFF(bi.due_Date, bi.issue_Date)) > 60 ;


/*  Question 3 : select the list of books having price greater than the minimum price of books purchased so far
*/
SELECT 
    accession_No, title_Id, purchase_Date, price, status
FROM
    Books
WHERE
    price > (SELECT 
        MIN(price)
    FROM
        Books);
        

-- Assignment-3


/*  Question 1 : Query to display total number of students, total number of faculty
    and total number of others in library information system in a single row.
*/

ALTER TABLE members ADD person_type char;

Update Members Set person_type='F' where member_id=1;
Update Members Set person_type='O' where member_id=2;
Update Members Set person_type='S' where member_id=3;
Update Members Set person_type='O' where member_id=4;
Update Members Set person_type='F' where member_id=5;

SELECT 
    COUNT(if(person_type = 'F', person_type, null)) AS NO_OF_PROFESSORS,
    COUNT(if(person_type = 'S', person_type, null)) AS NO_OF_STUDENTS,
    COUNT(if(person_type = 'O', person_type, null)) AS NO_OF_OTHERS
from
    members;



/*  Question 2: Query to display the information of those titles that have been issued more than 2 times
*/


SELECT 
    t.title_name AS TitleName, count(bi.accession_no) AS number
FROM
    book_issue bi,
    titles t,
    books b
WHERE
    b.accession_no = bi.accession_no AND t.title_id = b.title_id
GROUP BY t.title_Name
HAVING count(t.title_Name) >= 2;


/*  Question 3: Query to display information on books issued to members of category other than "F"
*/



SELECT 
    m.member_name AS Name,
    m.category AS Category,
    b.member_id AS ID,
    t.title_name AS Title,
    bs.accession_no AS 'Accession Number',
    b.issue_date AS 'Issue Date',
    b.due_date AS 'Due Date'
FROM
    book_issue b,
    members m,
    titles t,
    books bs
WHERE
    m.member_id = b.member_id AND bs.accession_no = b.accession_no AND t.title_id = bs.title_id AND m.person_type NOT IN ('F');



/*  Question 4: Query to display information on those authors for which
    at least one book has been purchased
*/
SELECT 
    a.author_name, a.author_id
from
    books b,
    title_author ta,
    authors a,
    titles t
where
    a.author_id = ta.author_id and ta.title_id = b.title_id and b.title_id = t.title_id;
