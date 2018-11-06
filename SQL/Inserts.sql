--user
INSERT INTO user (user_id, active, first_name, last_name, username, password)
VALUES (1, 1, 'Admin', 'Test', 'admin', '$2y$11$89Vca6gMKYtQhMKKWSJdIu6VbNA98pNPVYmC5GGCbr5CD1GdNqNUi');

INSERT INTO user (user_id, active, first_name, last_name, username, password)
VALUES (2, 1, 'User', 'Test', 'user1', '$2y$11$34MrrT4biumki3vnOh2TYeyO1TFStcAymzsrY5zI06gIqvSUxwCDa');

--role
INSERT INTO role (role_id, role)
VALUES (1, 'ADMIN');

INSERT INTO role (role_id, role)
VALUES (2, 'USER');

--user_role
INSERT INTO user_role (user_id, role_id)
VALUES (1, 1);

INSERT INTO user_role (user_id, role_id)
VALUES (2, 2);

--city
INSERT INTO city (city_name, country, latitude, longitude)
VALUES ('Cluj-Napoca', 'Romania', 46.770439, 23.591423);

INSERT INTO city (city_name, country, latitude, longitude)
VALUES ('Bucharest', 'Romania', 44.439663, 26.096306);

INSERT INTO city (city_name, country, latitude, longitude)
VALUES ('Nuremberg', 'Germany', 49.460983, 11.061859);

INSERT INTO city (city_name, country, latitude, longitude)
VALUES ('Munich', 'Germany', 48.137154, 11.576124);

--flight
INSERT INTO flight (flight_id, airplane_type, departure_city, departure_date_time, arrival_city, arrival_date_time)
VALUES ('WZ3370', 'Airbus A320', 'Cluj-Napoca', '2018-11-05 06:30:00', 'Nuremberg', '2018-11-05 07:10:00');

INSERT INTO flight (flight_id, airplane_type, departure_city, departure_date_time, arrival_city, arrival_date_time)
VALUES ('WZ3369', 'Airbus A320', 'Nuremberg', '2018-11-05 08:30:00', 'Cluj-Napoca', '2018-11-05 10:10:00');

INSERT INTO flight (flight_id, airplane_type, departure_city, departure_date_time, arrival_city, arrival_date_time)
VALUES ('WZ3339', 'Airbus A380', 'Bucharest', '2018-11-05 12:35:00', 'Munich', '2018-11-05 13:20:00');

INSERT INTO flight (flight_id, airplane_type, departure_city, departure_date_time, arrival_city, arrival_date_time)
VALUES ('WZ3340', 'Airbus A380', 'Munich', '2018-11-05 14:40:00', 'Bucharest', '2018-11-05 15:20:00');

