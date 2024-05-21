INSERT INTO roles (id, role) VALUES (1, 'ROLE_ADMIN');
INSERT INTO roles (id, role) VALUES (2, 'ROLE_USER');
INSERT INTO users (id, name, surname, age, email, password) VALUES (1,'admin','admin',18,'admin@mail.ru','admin');
INSERT INTO users (id, name, surname, age, email, password) VALUES (2,'user','user',18,'user@mail.ru','user');
INSERT INTO users_roles (user_id, role_id) VALUES(1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES(1, 2);
INSERT INTO users_roles (user_id, role_id) VALUES(2, 2);
