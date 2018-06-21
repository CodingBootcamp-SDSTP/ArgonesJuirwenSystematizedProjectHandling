CREATE TABLE users (
username VARCHAR(255) , 
password VARCHAR(255) NOT NULL, 
type VARCHAR(255) NOT NULL
);

INSERT INTO users (username, password, type) VALUES ('E001', 'Juirwen', 'Member');
INSERT INTO users (username, password, type)  VALUES ('S001', 'Mirana', 'Admin');
