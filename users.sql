CREATE TABLE admins (
id VARCHAR(255) PRIMARY KEY, 
firstname VARCHAR(255) NOT NULL, 
lastname VARCHAR(255) NOT NULL, 
department VARCHAR(255) NOT NULL,
designation VARCHAR(255) NOT NULL
);

CREATE TABLE members (
id VARCHAR(255) PRIMARY KEY, 
firstname VARCHAR(255) NOT NULL, 
lastname VARCHAR(255) NOT NULL, 
department VARCHAR(255) NOT NULL,
designation VARCHAR(255) NOT NULL
);

INSERT INTO admins (id, firstname, lastname, department, designation) VALUES ('E001', 'Juirwen', 'Argones', 'Engineering Department', 'Senior SE');
INSERT INTO admins (id, firstname, lastname, department, designation)  VALUES ('S001', 'Mirana', 'Nightshade', 'Sales Department', 'Sales Manager');

INSERT INTO members (id, firstname, lastname, department, designation) VALUES ('ET020', 'Juan', 'Dela Cruz', 'Engineering Department', 'Software Engineer');
INSERT INTO members (id, firstname, lastname, department, designation) VALUES ('ST011', 'Uncle', 'Drew', 'Sales Department', 'Sales Representative');
