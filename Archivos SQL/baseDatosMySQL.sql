/*
================================================================= Crear Tablas =================================================================
*/

-- Comidas y Bebidas
CREATE TABLE IF NOT EXISTS `dbsistemacine`.`comidas`(
	id_comida INT PRIMARY KEY NOT NULL,
    nombre_comida VARCHAR(50),
    precio DOUBLE(7,2)
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`bebidas`(
	id_bebida INT PRIMARY KEY NOT NULL,
    nombre_bebida VARCHAR(50),
    precio DOUBLE(7,2)
);

-- Metodos de Pagos
CREATE TABLE IF NOT EXISTS `dbsistemacine`.`metodos_pagos`(
	id_mp INT PRIMARY KEY NOT NULL,
    nombre_mp VARCHAR(50)
);

-- Boletas de comidas y bebidas
CREATE TABLE IF NOT EXISTS `dbsistemacine`.`boleta_consumibles`(
	id_boleta INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    fecha DATE,
    hora TIME,
    id_mp INT,
    CONSTRAINT fk_id_mp FOREIGN KEY (id_mp) REFERENCES metodos_pagos(id_mp),
    pago_total DOUBLE(5,2)
);
-- Listas de comidas y bebidas
CREATE TABLE IF NOT EXISTS `dbsistemacine`.`lista_comida`(
	id_boleta INT,
    CONSTRAINT fk_boleta FOREIGN KEY (id_boleta) REFERENCES boleta_consumibles(id_boleta),
    id_comida INT,
    CONSTRAINT fk_id_comida FOREIGN KEY (id_comida) REFERENCES comidas(id_comida),
    cantidad INT(2)
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`lista_bebidas`(
	id_boleta INT,
    CONSTRAINT fk_boleta2 FOREIGN KEY (id_boleta) REFERENCES boleta_consumibles(id_boleta),
    id_bebida INT,
    CONSTRAINT fk_id_bebida FOREIGN KEY (id_bebida) REFERENCES bebidas(id_bebida),
    cantidad INT(2)
);

-- Tipos de Usuarios y Documentos
CREATE TABLE IF NOT EXISTS `dbsistemacine`.`tipo_usuarios`(
	id_tipo_user INT PRIMARY KEY NOT NULL,
    nombre_type_user VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`tipo_documentos`(
	id_tipo_doc INT PRIMARY KEY NOT NULL,
    nombre_type_doc VARCHAR(50)
);

-- Usuarios y Miembros
CREATE TABLE IF NOT EXISTS `dbsistemacine`.`usuarios`(
	id_user INT PRIMARY KEY NOT NULL,
    nombre_user VARCHAR(50),
    id_tipo_doc INT,
    CONSTRAINT fk_id_tipo_doc FOREIGN KEY (id_tipo_doc) REFERENCES tipo_documentos(id_tipo_doc),
    numero_doc INT,
    correo VARCHAR(50),
    contra VARCHAR(50),
    id_tipo_user INT,
    CONSTRAINT fk_id_tipo_user FOREIGN KEY (id_tipo_user) REFERENCES tipo_usuarios(id_tipo_user)
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`miembros`(
	id_miembro INT PRIMARY KEY NOT NULL,
    nombre_member VARCHAR(50),
    id_tipo_doc INT,
    CONSTRAINT fk_id_tipo_doc2 FOREIGN KEY (id_tipo_doc) REFERENCES tipo_documentos(id_tipo_doc),
    num_doc INT
);

-- Datos relacionados con Peliculas
CREATE TABLE IF NOT EXISTS `dbsistemacine`.`categorias`(
	id_categ INT PRIMARY KEY NOT NULL,
    nombre_categ VARCHAR(50),
    descripcion VARCHAR(150)
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`salas`(
	id_sala INT PRIMARY KEY NOT NULL,
    nombre_sala VARCHAR(50),
    capacidad INT(3)
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`horarios`(
	id_hor INT PRIMARY KEY NOT NULL,
    hora TIME
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`peliculas`(
	id_peli INT PRIMARY KEY NOT NULL,
    nombre_peli VARCHAR(50),
    duracion DECIMAL(3,2),
    id_categ INT,
    CONSTRAINT fk_id_categ FOREIGN KEY (id_categ) REFERENCES categorias(id_categ),
    descripcion VARCHAR(250),
    id_hor INT,
    CONSTRAINT fk_id_hor FOREIGN KEY (id_hor) REFERENCES horarios(id_hor)
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`sala_peliculas`(
	id_peli INT,
    CONSTRAINT fk_id_peli FOREIGN KEY (id_peli) REFERENCES peliculas(id_peli),
    id_sala INT,
    CONSTRAINT fk_id_sala FOREIGN KEY (id_sala) REFERENCES salas(id_sala)
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`estrenos`(
	id_peli INT,
    CONSTRAINT fk_id_peli2 FOREIGN KEY (id_peli) REFERENCES peliculas(id_peli),
    fecha DATE
);

-- Boletos para Miembros y Clientes Normales
CREATE TABLE IF NOT EXISTS `dbsistemacine`.`boletos_miembros`(
	id_boleto INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    fecha DATE,
    hora TIME,
    id_miembro INT,
    CONSTRAINT fk_miembro FOREIGN KEY (id_miembro) REFERENCES miembros(id_miembro),
    id_peli INT,
    CONSTRAINT fk_peli FOREIGN KEY (id_peli) REFERENCES peliculas(id_peli),
    total_pagar DOUBLE(7,2),
    descuento DOUBLE(5,2),
    id_mp INT,
    CONSTRAINT fk_mp FOREIGN KEY (id_mp) REFERENCES metodos_pagos(id_mp),
    precio_final DOUBLE(7,2)
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`boletos_clientes`(
	id_boleto INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    fecha DATE,
    hora TIME,
    nombre_cli VARCHAR(50),
    id_tipo_doc INT,
    CONSTRAINT fk_id_tip_doc FOREIGN KEY (id_tipo_doc) REFERENCES tipo_documentos(id_tipo_doc),
    num_doc INT,
    id_peli INT,
    CONSTRAINT fk_id_peli4 FOREIGN KEY (id_peli) REFERENCES peliculas(id_peli),
    id_mp INT,
    CONSTRAINT fk_id_mp3 FOREIGN KEY (id_mp) REFERENCES metodos_pagos(id_mp),
    precio_final DOUBLE(7,2)
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`cant_bol_cli`(
	id_boleto INT,
    CONSTRAINT fk_id_boleto_2 FOREIGN KEY (id_boleto) REFERENCES boletos_clientes(id_boleto),
    cant_bol_adultos INT,
    cant_bol_niños INT
);

CREATE TABLE IF NOT EXISTS `dbsistemacine`.`cant_bol_mie`(
	id_boleto INT,
    CONSTRAINT fk_id_boleto_3 FOREIGN KEY (id_boleto) REFERENCES boletos_miembros(id_boleto),
    cant_bol_adultos INT,
    cant_bol_niños INT
);

/*
================================================================= Insertar Datos =================================================================
*/
-- Insertar Comidas
INSERT INTO `dbsistemacine`.`comidas` (`id_comida`, `nombre_comida`, `precio`) VALUES ('1', 'Caja de PopCorn chico', '8.45');
INSERT INTO `dbsistemacine`.`comidas` (`id_comida`, `nombre_comida`, `precio`) VALUES ('2', 'Caja de PopCorn mediana', '15.21');

-- Insertar Bebidas
INSERT INTO `dbsistemacine`.`bebidas` (`id_bebida`, `nombre_bebida`, `precio`) VALUES ('1', 'Vaso grande de Gaseosa', '5.63');
INSERT INTO `dbsistemacine`.`bebidas` (`id_bebida`, `nombre_bebida`, `precio`) VALUES ('2', 'Vaso grande de chicha', '4.67');

-- Insertar Métodos de Pagos
INSERT INTO `dbsistemacine`.`metodos_pagos` (`id_mp`, `nombre_mp`) VALUES ('1', 'Dinero');
INSERT INTO `dbsistemacine`.`metodos_pagos` (`id_mp`, `nombre_mp`) VALUES ('2', 'Tarjeta de credito');
INSERT INTO `dbsistemacine`.`metodos_pagos` (`id_mp`, `nombre_mp`) VALUES ('3', 'Tarjeta de debito');

-- Insertar Tipos de usuarios
INSERT INTO `dbsistemacine`.`tipo_usuarios` (`id_tipo_user`, `nombre_type_user`) VALUES ('1', 'Directivo');
INSERT INTO `dbsistemacine`.`tipo_usuarios` (`id_tipo_user`, `nombre_type_user`) VALUES ('2', 'Empleado');

-- Insertar Tipos de Documentos
INSERT INTO `dbsistemacine`.`tipo_documentos` (`id_tipo_doc`, `nombre_type_doc`) VALUES ('1', 'DNI');
INSERT INTO `dbsistemacine`.`tipo_documentos` (`id_tipo_doc`, `nombre_type_doc`) VALUES ('2', 'Pasaporte');

-- Insertar Usuarios
INSERT INTO `dbsistemacine`.`usuarios` (`id_user`, `nombre_user`, `id_tipo_doc`, `numero_doc`, `correo`, `contra`, `id_tipo_user`) VALUES ('1', 'Marco Fernandez', '1', '47859621', 'marco@gmail.com', 'marco', '1');
INSERT INTO `dbsistemacine`.`usuarios` (`id_user`, `nombre_user`, `id_tipo_doc`, `numero_doc`, `correo`, `contra`, `id_tipo_user`) VALUES ('2', 'Maria Espinosa', '1', '75846215', 'maria@gmail.com', 'maria', '2');

-- Insertar Miembros
INSERT INTO `dbsistemacine`.`miembros` (`id_miembro`, `nombre_member`, `id_tipo_doc`, `num_doc`) VALUES ('1', 'Marta Paredes', '1', '45871239');
INSERT INTO `dbsistemacine`.`miembros` (`id_miembro`, `nombre_member`, `id_tipo_doc`, `num_doc`) VALUES ('2', 'Juan Fernandez', '1', '85477412');

-- Insertar Categorias
INSERT INTO `dbsistemacine`.`categorias` (`id_categ`, `nombre_categ`, `descripcion`) VALUES ('1', 'Terror', 'Categoria la cual busca generar miedo a los espectadores');
INSERT INTO `dbsistemacine`.`categorias` (`id_categ`, `nombre_categ`, `descripcion`) VALUES ('2', 'Comedia', 'Busca generar risas a los espectadores entreteniendolos');
INSERT INTO `dbsistemacine`.`categorias` (`id_categ`, `nombre_categ`, `descripcion`) VALUES ('3', 'Familia', 'Es contenido hecho para disfrutar en familia desde los más pequeños hasta los más grande');
INSERT INTO `dbsistemacine`.`categorias` (`id_categ`, `nombre_categ`, `descripcion`) VALUES ('4', 'Acción', 'Categoria con muchas escenas de acción');

-- Insertar Salas
INSERT INTO `dbsistemacine`.`salas` (`id_sala`, `nombre_sala`, `capacidad`) VALUES ('1', 'Sala 1', '45');
INSERT INTO `dbsistemacine`.`salas` (`id_sala`, `nombre_sala`, `capacidad`) VALUES ('2', 'Sala 2', '45');
INSERT INTO `dbsistemacine`.`salas` (`id_sala`, `nombre_sala`, `capacidad`) VALUES ('3', 'Sala 3', '45');

-- Insertar Horarios
INSERT INTO `dbsistemacine`.`horarios` (`id_hor`, `hora`) VALUES ('1', '14:30');
INSERT INTO `dbsistemacine`.`horarios` (`id_hor`, `hora`) VALUES ('2', '15:30');
INSERT INTO `dbsistemacine`.`horarios` (`id_hor`, `hora`) VALUES ('3', '16:30');
INSERT INTO `dbsistemacine`.`horarios` (`id_hor`, `hora`) VALUES ('4', '18:30');

-- Insertar Peliculas
INSERT INTO `dbsistemacine`.`peliculas` (`id_peli`, `nombre_peli`, `duracion`, `id_categ`, `descripcion`, `id_hor`) VALUES ('1', 'Spiderman Home Coming', '1.5', '4', 'Spiderman regresa a casa xd', '1');
INSERT INTO `dbsistemacine`.`peliculas` (`id_peli`, `nombre_peli`, `duracion`, `id_categ`, `descripcion`, `id_hor`) VALUES ('2', 'Spiderman Far From Home', '2.5', '4', 'Despues de Home Coming Peter se toma vacaciones', '2');