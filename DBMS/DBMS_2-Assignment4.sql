-- Creating Database zipcodeForm
CREATE DATABASE zipcodeForm;
USE zipcodeForm;

-- creating table Zipcode
CREATE TABLE zipcode(
    zipcode_id int PRIMARY KEY AUTO_INCREMENT
);
-- Creating table cityInfo
CREATE TABLE cityInfo(
    zipcode int PRIMARY KEY AUTO_INCREMENT,
    cityName varchar(20),
    FOREIGN KEY (zipcode)
        REFERENCES zipcode (zipcode_id)
);
-- Creating table stateInfo
CREATE TABLE stateInfo(
    zipcode int PRIMARY KEY,
    stateName varchar(20),
    FOREIGN KEY (zipcode)
        REFERENCES zipcode (zipcode_id)
);
 
 -- Inserting values in zipcodeNumber table
INSERT INTO zipcode(zipcode_id) VALUES (101);
INSERT INTO zipcode(zipcode_id) VALUES (102);
INSERT INTO zipcode(zipcode_id) VALUES (103);
 
 -- Inserting values in cityInfo table
INSERT INTO cityInfo(zipcode,cityName) VALUES (101,'lasvegas');
INSERT INTO cityInfo(cityName) VALUES ('london');
INSERT INTO cityInfo(cityName) VALUES ('newyork');
 
 -- Inserting values in stateInfo table
INSERT INTO stateInfo(zipcode,stateName) VALUES (101,'Nevada');
INSERT INTO stateInfo(zipcode,stateName) VALUES (102,'Canada');
INSERT INTO stateInfo(zipcode,stateName) VALUES (103,'UnitedStates');
 
 
 -- Query to find the zip code city name and stateName
SELECT 
    z.zipcode_id, cityName, stateName
from
    zipcode z,
    cityInfo c,
    stateInfo s
where
    ((z.zipcode_id = c.zipcode) AND (z.zipcode_id = s.zipcode))
ORDER BY stateName asc ,cityName asc;

 
 
 
 
