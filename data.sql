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
    
INSERT INTO products (codes, namep, marca, price, existence, descrip, 
	dateExpiry, registerFor) VALUES ("ALIM202305AFF05", "Arroz", "Italriso", 20, 10, 
    "Arroz blanco", "2023/12/15" , "juanlopez");
    
    
    
    
    