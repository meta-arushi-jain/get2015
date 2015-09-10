use library_database;

-- 1-to find the columns of table members
SELECT * FROM members;

-- 2- to find the member id,member name,category of table members
SELECT member_id,member_name, category FROM members;

-- 3- to find the member id,member name,category of table members whose category = "f"
SELECT member_id,member_name, category FROM members WHERE category = 'f';

-- 4 to find distinct category of table members
SELECT DISTINCT(category) FROM members;

-- 5 to find the category,member name of table members order by desc
SELECT category,member_name FROM members ORDER BY member_name DESC;

-- 6 to find the title name,publisher name, subject name of table
SELECT title_name,p.publisher_name, s.subject_name FROM Titles t , Publishers p,Subjects s WHERE t.publisher_id=p.publisher_id && t.subject_id=s.subject_id;

-- 7 to find the count of members of category
SELECT category,COUNT(*) From members GROUP BY category;

-- 8 to find name of members to which arushi belongs
SELECT m.member_name FROM members AS m JOIN members AS m1 ON m.category = m1.category WHERE m1.member_name ="arushi";


-- 9 to find the status of return book and if returned  then place 
SELECT issue_Date,member_Id,b.accession_No, IF( status = 0 , return_Date," " ) as Book_Return_Status FROM Books b,Book_Return r WHERE b. accession_No = r.accession_No;


-- Assignment 2
-- 1 -to  display results in ascending order of issue date and within issue date in ascending order of members name.

SELECT r.issue_Date, r.member_Id,r.accession_No,IF( b.status =0 , return_Date," " ) as Book_Returned from Books b,Book_Return r, Members m WHERE ((b. accession_No = r.accession_No )AND(r.member_Id=m.member_Id)) ORDER BY issue_date asc , member_Name asc;


