

CREATE DATABASE My_Classicmodels;

CREATE TABLE productlines (
    productLine VARCHAR(50) PRIMARY KEY,
    textDescription VARCHAR(4000),
    htmlDescription MEDIUMTEXT,
    image MEDIUMBLOB
);

CREATE TABLE products (
    productCode VARCHAR(15) PRIMARY KEY,
    productName VARCHAR(70),
    productLine VARCHAR(50),
    productScale VARCHAR(10),
    productVendor VARCHAR(50),
    productDescription TEXT,
    quantityInStock SMALLINT(6),
    buyPrice DOUBLE,
    FOREIGN KEY (productLine) REFERENCES productlines(productLine)  
);

CREATE TABLE orders (
    orderNumber INT(11) AUTO_INCREMENT PRIMARY KEY,
    orderDate DATETIME,
    requiredDate DATETIME,
    shippedDate DATETIME,
    status VARCHAR(15),
    comments TEXT,
    customerNumber INT(11),
);

CREATE TABLE orderdetails (
    orderNumber INT(11) AUTO_INCREMENT 	,
    productCode VARCHAR(15),
    PRIMARY KEY (orderNumber, productCode),
    quantityOrdered INT(11),
    priceEach DOUBLE,
    orderLineNumber SMALLINT(6),
    
    PRIMARY KEY (orderNumber, productCode),
    FOREIGN KEY (orderNumber) REFERENCES orders(orderNumber),
    FOREIGN KEY (productCode) REFERENCES products(productCode)
);


// Bai 2 :


