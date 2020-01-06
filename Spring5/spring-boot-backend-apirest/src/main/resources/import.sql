INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'África');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'Matías','Jacob','matijacob@live.com','2019-12-17');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'Celeste','Correa','correaceleste539@gmail.com','2019-12-16');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Matías','Jacob','matijacob1@live.com','2019-12-17');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Celeste','Correa','correaceleste5391@gmail.com','2019-12-16');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Matías','Jacob','matijacob2@live.com','2019-12-17');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Celeste','Correa','correaceleste5392@gmail.com','2019-12-16');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Matías','Jacob','matijacob3@live.com','2019-12-17');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Celeste','Correa','correaceleste5393@gmail.com','2019-12-16');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Matías','Jacob','matijacob4@live.com','2019-12-17');

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('matias','$2a$10$UViEZmqEdQ3rWXg42DLgw.9iFLtCR8XSn0h339z5C.Cefz5HzHkca',1, 'Matías Ezequiel', 'Jacob Tonutti', 'matijacob@live.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('celeste','$2a$10$1TUES180dgv0BsIkW019luo47NcX0uavD6S7QuQlAzhqib2U97dq6',1, 'Celeste Mariela', 'Correa', 'correaceleste539@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,1);


