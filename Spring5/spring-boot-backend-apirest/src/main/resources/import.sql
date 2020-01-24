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

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('matias','$2a$10$x1GyOt4P2FDUKQQBNwus3OPtw6NlSbU3GGbOu6A.dZ4fbzRQH9tvK',1, 'Matías Ezequiel', 'Jacob Tonutti', 'matijacob@live.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('celeste','$2a$10$1TUES180dgv0BsIkW019luo47NcX0uavD6S7QuQlAzhqib2U97dq6',1, 'Celeste Mariela', 'Correa', 'correaceleste539@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('user','$2a$10$HFZqjIPAXciF0C0JtmaPQuUsYBigMoyTDZEAn94qRT47jBe5rIjO2',1, 'Federico', 'Haunche', 'treketreke@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (3,1);

/* Populate tabla productos */
INSERT INTO productos (nombre, precio, create_at) VALUES('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Camara digital DSC-W320B', 123490, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Apple iPod shuffle', 1499990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Notebook Z110', 37990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Bianchi Bicicleta Aro 26', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mica Comoda 5 Cajones', 299990, NOW());

/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 6);


