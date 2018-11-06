-- CSILLAG ROBERT, CSC
-- Schema for FlightsApp

-- Creating tables

CREATE TABLE user (
	user_id INTEGER(4) PRIMARY KEY,
	active INTEGER(1) NOT NULL,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	username VARCHAR(30) NOT NULL,
	password VARCHAR(30) NOT NULL,
	email VARCHAR(30)
);

CREATE TABLE role (
	role_id INTEGER(4) PRIMARY KEY,
	role VARCHAR(20) NOT NULL
);

CREATE TABLE user_role (
	user_id INTEGER(4) NOT NULL,
	role_id INTEGER(4) NOT NULL
);

CREATE TABLE flight (
	flight_id VARCHAR(10) NOT NULL PRIMARY KEY,
	airplane_type VARCHAR(50),
	departure_city VARCHAR (70) NOT NULL,
	departure_date_time DATETIME NOT NULL,
	arrival_city VARCHAR (70) NOT NULL,
	arrival_date_time DATETIME NOT NULL
);

CREATE TABLE city (
	city_name VARCHAR (70) NOT NULL PRIMARY KEY,
	country VARCHAR (70) NOT NULL,
	latitude DECIMAL (10,6) NOT NULL,
	longitude DECIMAL (10,6) NOT NULL
);

ALTER TABLE user
MODIFY COLUMN password VARCHAR(100);

ALTER TABLE user_role
ADD CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES user(user_id);

ALTER TABLE user_role
ADD CONSTRAINT role_id_fk FOREIGN KEY (role_id) REFERENCES role(role_id);

ALTER TABLE user_role
ADD CONSTRAINT user_role_pk PRIMARY KEY(user_id, role_id);

ALTER TABLE flight
ADD CONSTRAINT dep_city_fk FOREIGN KEY (departure_city) REFERENCES city(city_name);

ALTER TABLE flight
ADD CONSTRAINT arr_city_fk FOREIGN KEY (arrival_city) REFERENCES city(city_name);