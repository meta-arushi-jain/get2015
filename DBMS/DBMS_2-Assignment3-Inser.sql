-- creating database e_Commerce
CREATE  DATABASE e_Commerce;
USE e_Commerce;

-- Creating table categories 
CREATE TABLE categories(
    id INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    parentId INTEGER NULL,
    FOREIGN KEY (parentid)
        REFERENCES categories (id)
);

-- Inserting the Top Most categories
-- Id is auto incremented so we will not be entering them.

INSERT INTO categories(name) VALUES ('Mobiles & Tablets');
INSERT INTO categories(name) VALUES ('Computers');
INSERT INTO categories(name) VALUES ('Home Appliances');
-- Inserting the sub categories of Mobiles and Tablets
INSERT INTO categories(name,parentId) VALUES('MOBILES',1);
INSERT INTO categories(name,parentId) VALUES('TABLETS',1);
INSERT INTO categories(name,parentId) VALUES('ACCESSORIES',1);
INSERT INTO categories(name,parentId) VALUES('CASE & COVERS',1);
-- Inserting the last Category of Mobiles and Tablets
INSERT INTO categories(name,parentId) VALUES('SMART_PHONES',4);
INSERT INTO categories(name,parentId) VALUES('FEATURED_PHONES',4);
INSERT INTO categories(name,parentId) VALUES('2G',5);
INSERT INTO categories(name,parentId) VALUES('3G',5);

-- Inserting the sub category of Computers
INSERT INTO categories(name,parentId) VALUES('DESKTOP',2);
INSERT INTO categories(name,parentId) VALUES('LAPTOP',2);
INSERT INTO categories(name,parentId) VALUES('LAPTOP ACCESSORIES',2);
INSERT INTO categories(name,parentId) VALUES('PRINTERS',2);
-- Inserting the last Category of Computers
INSERT INTO categories(name,parentId) VALUES('Keyboard',14);
INSERT INTO categories(name,parentId) VALUES('Mouse',14);
INSERT INTO categories(name,parentId) VALUES('Headphones',14);
INSERT INTO categories(name,parentId) VALUES('Inkjet',15);
INSERT INTO categories(name,parentId) VALUES('Laser',15);

-- Inserting the sub Category of Home Appliances
INSERT INTO categories(name,parentId) VALUES('TVs',3);
INSERT INTO categories(name,parentId) VALUES('Air Conditioners',3);
INSERT INTO categories(name,parentId) VALUES('Washing Machines',3);

-- Inserting the last Category
INSERT INTO categories(name,parentId) VALUES('LED',21);
INSERT INTO categories(name,parentId) VALUES('LCD',21);
INSERT INTO categories(name,parentId) VALUES('PLASMA',21);
INSERT INTO categories(name,parentId) VALUES('Full Automatic',23);
INSERT INTO categories(name,parentId) VALUES('Semi Automatic',23);
INSERT INTO categories(name,parentId) VALUES('Top Load',27);
INSERT INTO categories(name,parentId) VALUES('Front Load',27);


