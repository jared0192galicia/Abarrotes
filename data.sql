CREATE DATABASE abarrotes_db;

USE abarrotes_db;

CREATE TABLE products(
	codes VARCHAR(15) PRIMARY KEY UNIQUE NOT NULL,
    namep VARCHAR(20) NOT NULL,
    model VARCHAR(15) NOT NULL DEFAULT 'Generico',
    marca VARCHAR(15) NOT NULL DEFAULT 'Sin marca',
    price DOUBLE NOT NULL,
    existence INTEGER NOT NULL DEFAULT 0,
    descrip VARCHAR(100) NOT NULL,
    dateExpiry DATE NULL,
    registerFor VARCHAR(15) NOT NULL,
    updateFor VARCHAR(15)
);

INSERT INTO products (codes, namep, price, existence, descrip, 
	registerFor) VALUES ("LIMP202305AFF03", "Escoba", 27.5, 10, 
    "Escoba normal", "juanlopez");
    
INSERT INTO products (codes, namep, model, marca, price, existence, descrip, 
	dateExpiry, registerFor) VALUES ("ALIM202305AFF05", "Arroz", "Italriso", 20, 10, 
    "Arroz blanco", "2023/12/15" , "juanlopez");
    
INSERT INTO products (codes, namep, marca, price, existence, descrip, 
	dateExpiry, registerFor) VALUES ("ALIM202305AFF05", "Arroz", "Italriso", 20, 10, 
    "Arroz blanco", "2023/12/15" , "juanlopez");
    
    
CREATE TABLE users (
	userName VARCHAR(20) UNIQUE NOT NULL PRIMARY KEY,
    pass VARCHAR (100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    nameU VARCHAR(100) NOT NULL,
    statusU BOOL NOT NULL DEFAULT TRUE,
    age INTEGER NOT NULL,
    sex CHAR NOT NULL,
    levelU INTEGER NOT NULL DEFAULT 1
)ENGINE='InnoDB' default charset = latin1;

INSERT INTO users VALUES ("pepetoro", aes_encrypt("1234", "root"),
 "jared0192galici@gmail.com", "Juan lopez", 1, 37, 'M', 1);
 
INSERT INTO users VALUES ("root", aes_encrypt("root", "root"),
 "jared0192galici@gmail", "user root", 0, 50, 'M', 1);

SELECT email, sex, CONVERT(AES_DECRYPT(pass, "root") USING UTF8),
 nameU, statusU, age, levelU FROM users WHERE userName = 'root';
 
 UPDATE users SET pass = aes_encrypt("root", "root"), 
	email = "", nameU = "", statusU = "1", age = 1, sex = 'F',
    levelU = 2 where userName = 'root' or email = "";
 
    SELECT user.alias , convert(aes_decrypt(pass, "root") 
    using UTF8) as passs from user;
    SELECT user.pass from user;

CREATE TABLE sale(
	codeS VARCHAR(15) NOT NULL PRIMARY KEY,
    dateS DATE NOT NULL,
    income DOUBLE NOT NULL DEFAULT 0,
    userName VARCHAR(20) NOT NULL,
    codesPr VARCHAR(500)
);






select  proveedor.nombre 
from proveedor as p, proveedor 

where p.nombre = "Smith" and p.ciudad=proveedor.ciudad;






    
    