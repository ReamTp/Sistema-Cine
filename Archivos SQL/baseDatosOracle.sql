-- Creación de Tablas

-- Comidas y Bebidas
CREATE TABLE comidas(
	id_comida INT PRIMARY KEY NOT NULL,
    nombre_comida VARCHAR2(50),
    precio DECIMAL(5,2)
);

CREATE TABLE bebidas(
	id_bebida INT PRIMARY KEY NOT NULL,
    nombre_bebida VARCHAR2(50),
    precio DECIMAL(5,2)
);

--Metodos de Pagos
CREATE TABLE metodos_pagos(
	id_mp INT PRIMARY KEY NOT NULL,
    nombre_mp VARCHAR2(50)
);

-- Boletas de comidas y bebidas
CREATE TABLE boleta_consumibles(
	id_boleta INT PRIMARY KEY NOT NULL,
    fecha DATE DEFAULT SYSDATE,
    hora TIMESTAMP,
    id_mp INT,
    CONSTRAINT fk_id_mp FOREIGN KEY (id_mp) REFERENCES metodos_pagos(id_mp),
    pago_total DECIMAL(5,2)
);

-- Listas de comidas y bebidas
CREATE TABLE lista_comida(
	id_boleta INT,
    CONSTRAINT fk_boleta FOREIGN KEY (id_boleta) REFERENCES boleta_consumibles(id_boleta),
    id_comida INT,
    CONSTRAINT fk_id_comida FOREIGN KEY (id_comida) REFERENCES comidas(id_comida),
    cantidad NUMBER(2)
);

CREATE TABLE lista_bebidas(
	id_boleta INT,
    CONSTRAINT fk_boleta2 FOREIGN KEY (id_boleta) REFERENCES boleta_consumibles(id_boleta),
    id_bebida INT,
    CONSTRAINT fk_id_bebida FOREIGN KEY (id_bebida) REFERENCES bebidas(id_bebida),
    cantidad NUMBER(2)
);

-- Tipos de Usuarios y Documentos
CREATE TABLE tipo_usuarios(
	id_tipo_user INT PRIMARY KEY NOT NULL,
    nombre_type_user VARCHAR2(50)
);

CREATE TABLE tipo_documentos(
	id_tipo_doc INT PRIMARY KEY NOT NULL,
    nombre_type_doc VARCHAR2(50)
);

-- Usuarios y Miembros
CREATE TABLE usuarios(
	id_user INT PRIMARY KEY NOT NULL,
    nombre_user VARCHAR2(50),
    id_tipo_doc INT,
    CONSTRAINT fk_id_tipo_doc FOREIGN KEY (id_tipo_doc) REFERENCES tipo_documentos(id_tipo_doc),
    numero_doc INT,
    correo VARCHAR2(50),
    constraseña VARCHAR2(50),
    id_tipo_user INT,
    CONSTRAINT fk_id_tipo_user FOREIGN KEY (id_tipo_user) REFERENCES tipo_usuarios(id_tipo_user)
);

CREATE TABLE miembros(
	id_miembro INT PRIMARY KEY NOT NULL,
    nombre_member VARCHAR2(50),
    id_tipo_doc INT,
    CONSTRAINT fk_id_tipo_doc2 FOREIGN KEY (id_tipo_doc) REFERENCES tipo_documentos(id_tipo_doc),
    num_doc INT
);

-- Datos relacionados con Peliculas
CREATE TABLE categorias(
	id_categ INT PRIMARY KEY NOT NULL,
    nombre_categ VARCHAR2(50),
    descripcion VARCHAR2(150)
);

CREATE TABLE salas(
	id_sala INT PRIMARY KEY NOT NULL,
    nombre_sala VARCHAR2(50),
    capacidad NUMBER(3)
);

CREATE TABLE horarios(
	id_hor INT PRIMARY KEY NOT NULL,
    hora TIMESTAMP
);

CREATE TABLE peliculas(
	id_peli INT PRIMARY KEY NOT NULL,
    nombre_peli VARCHAR2(50),
    duracion DECIMAL(2,2),
    id_categ INT,
    CONSTRAINT fk_id_categ FOREIGN KEY (id_categ) REFERENCES categorias(id_categ),
    descripcion VARCHAR2(250),
    id_hor INT,
    CONSTRAINT fk_id_hor FOREIGN KEY (id_hor) REFERENCES horarios(id_hor)
);

CREATE TABLE sala_peliculas(
	id_peli INT,
    CONSTRAINT fk_id_peli FOREIGN KEY (id_peli) REFERENCES peliculas(id_peli),
    id_sala INT,
    CONSTRAINT fk_id_sala FOREIGN KEY (id_sala) REFERENCES salas(id_sala),
    asiento_disp NUMBER(3)
);

CREATE TABLE estrenos(
	id_peli INT,
    CONSTRAINT fk_id_peli2 FOREIGN KEY (id_peli) REFERENCES peliculas(id_peli)
);

-- Boletos para Miembros y Clientes Normales
CREATE TABLE boletos_miembros(
	id_boleto INT PRIMARY KEY NOT NULL,
    id_miembro INT,
    CONSTRAINT fk_id_miembro2 FOREIGN KEY (id_miembro) REFERENCES miembros(id_miembro),
    id_peli INT,
    CONSTRAINT fk_id_peli3 FOREIGN KEY (id_peli) REFERENCES peliculas(id_peli),
    id_sala INT,
    CONSTRAINT fk_id_sala2 FOREIGN KEY (id_sala) REFERENCES salas(id_sala),
    total_pagar DECIMAL(5,2),
    descuento DECIMAL(2,3),
    id_mp INT,
    CONSTRAINT fk_id_mp2 FOREIGN KEY (id_mp) REFERENCES metodos_pagos(id_mp),
    precio_final DECIMAL(5,2)
);

CREATE TABLE boletos_clientes(
	id_boleto INT PRIMARY KEY NOT NULL,
    nombre_cli VARCHAR2(50),
    num_doc INT,
    id_peli INT,
    CONSTRAINT fk_id_peli4 FOREIGN KEY (id_peli) REFERENCES peliculas(id_peli),
    id_sala INT,
    CONSTRAINT fk_id_sala3 FOREIGN KEY (id_sala) REFERENCES salas(id_sala),
    id_mp INT,
    CONSTRAINT fk_id_mp3 FOREIGN KEY (id_mp) REFERENCES metodos_pagos(id_mp),
    precio_final DECIMAL(5,2)
);

