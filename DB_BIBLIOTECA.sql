DROP DATABASE IF EXISTS BDBIBLIOTECA;
CREATE DATABASE IF NOT EXISTS BDBIBLIOTECA;
USE BDBIBLIOTECA;

CREATE TABLE Miembro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    telefono VARCHAR(15),
    fechanacimiento DATE
);

CREATE TABLE Libro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100),
    precio DECIMAL(10, 2) NOT NULL
);

CREATE TABLE Categoria (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255)
);

CREATE TABLE Bibliotecario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    idcategoria INT NOT NULL,
    telefono VARCHAR(15),
    correo VARCHAR(100),
    FOREIGN KEY (idcategoria) REFERENCES Categoria(id)
);

CREATE TABLE Prestamo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    idmiembro INT NOT NULL,
    idlibro INT NOT NULL,
    fecha_prestamo DATE NOT NULL,
    fecha_devolucion DATE,
    motivo VARCHAR(255),
    FOREIGN KEY (idmiembro) REFERENCES Miembro(id),
    FOREIGN KEY (idlibro) REFERENCES Libro(id)
);

CREATE TABLE DetallePrestamo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    idprestamo INT NOT NULL,
    idlibro INT NOT NULL,
    instrucciones VARCHAR(255),
    FOREIGN KEY (idprestamo) REFERENCES Prestamo(id),
    FOREIGN KEY (idlibro) REFERENCES Libro(id)
);

INSERT INTO Miembro (nombre, direccion, telefono, fechanacimiento) VALUES
('Juan Pérez', 'Av. Literatura 123', '987654321', '1985-07-15'),
('María García', 'Calle Libros 456', '912345678', '1990-10-22'),
('Luis Mendoza', 'Jr. Novelas 789', '921234567', '1978-03-09'),
('Ana Romero', 'Av. Autores 101', '934567890', '1982-12-05'),
('Carlos Ruiz', 'Jr. Lectura 202', '923456789', '1995-01-15'),
('Rosa Flores', 'Av. Páginas 303', '911223344', '1988-06-30'),
('Jorge Valdez', 'Jr. Biblioteca 404', '922233344', '1979-11-20'),
('Patricia Ríos', 'Av. Historias 505', '931234567', '1993-05-25');

INSERT INTO Libro (titulo, autor, precio) VALUES
('Cien años de soledad', 'Gabriel García Márquez', 30.00),
('El amor en los tiempos del cólera', 'Gabriel García Márquez', 25.00),
('Don Quijote de la Mancha', 'Miguel de Cervantes', 35.00),
('La casa de los espíritus', 'Isabel Allende', 28.00),
('1984', 'George Orwell', 22.00),
('Ficciones', 'Jorge Luis Borges', 20.00),
('El túnel', 'Ernesto Sabato', 18.00),
('Crónica de una muerte anunciada', 'Gabriel García Márquez', 24.00);

INSERT INTO Categoria (nombre, descripcion) VALUES
('Ficción', 'Libros de ficción y narrativa'),
('No Ficción', 'Libros de no ficción y ensayo'),
('Ciencia', 'Libros de ciencia y tecnología'),
('Historia', 'Libros sobre eventos históricos'),
('Literatura Infantil', 'Libros para niños'),
('Literatura Juvenil', 'Libros para jóvenes adultos'),
('Literatura Griega', 'Libros para jóvenes adultos'),
('Literatura Romana', 'Libros para jóvenes adultos');


INSERT INTO Bibliotecario (nombre, idcategoria, telefono, correo) VALUES
('Carlos Jiménez', 1, '987654321', 'cjimenez@biblioteca.com'),
('Laura Morales', 2, '912345678', 'lmorales@biblioteca.com'),
('David Torres', 3, '934567890', 'dtorres@biblioteca.com'),
('Ana Gutiérrez', 4, '923456789', 'agutierrez@biblioteca.com'),
('Rosa López', 5, '911223344', 'rlopez@biblioteca.com'),
('Miguel Romero', 6, '922233344', 'mromero@biblioteca.com'),
('Juan Alberto', 6, '922233344', 'mromero@biblioteca.com'),
('Julio Manchay', 6, '922233344', 'mromero@biblioteca.com');


INSERT INTO Prestamo (idmiembro, idlibro, fecha_prestamo, fecha_devolucion, motivo) VALUES
(1, 1, '2024-10-01', NULL, 'Lectura personal'),
(2, 2, '2024-10-02', '2024-10-10', 'Lectura en grupo'),
(3, 3, '2024-10-03', NULL, 'Investigación'),
(4, 4, '2024-10-04', '2024-10-12', 'Lectura de placer'),
(5, 5, '2024-10-05', NULL, 'Preparación para examen'),
(6, 6, '2024-10-06', '2024-10-14', 'Recomendación'),
(7, 7, '2024-10-07', '2024-10-15', 'Investigación'),
(8, 8, '2024-10-08', '2024-10-16', 'Recomendación');


INSERT INTO DetallePrestamo (idprestamo, idlibro, instrucciones) VALUES
(1, 1, 'Leer durante 1 mes'),
(2, 2, 'Devolver en buen estado'),
(3, 3, 'Mantener el libro seco'),
(4, 4, 'No marcar las páginas'),
(5, 5, 'Consultar con el bibliotecario si hay dudas'),
(6, 6, 'Leer en un plazo de 2 semanas'),
(7, 7, 'Consultar con el bibliotecario si hay dudas'),
(8, 8, 'No marcar las páginas');

