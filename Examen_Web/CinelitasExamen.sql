#creamos la bendita base de datos
CREATE DATABASE Cinelitas;
use Cinelitas;

CREATE TABLE `salas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sala` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `salas` VALUES (1,'Sala #1'),(2,'Sala #2'),(3,'Sala #3'),(4,'Sala #4'),(5,'Sala #5');

CREATE TABLE `peliculas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `costo` varchar(45) NOT NULL,
  `salas_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`salas_id`),
  KEY `fk_peliculas_salas_idx` (`salas_id`),
  CONSTRAINT `fk_peliculas_salas` FOREIGN KEY (`peliculas_id`) REFERENCES `peliculas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ;  

INSERT INTO `peliculas` VALUES (1,'Avengers Endgame','10 de marzo','₡5000',1); 
INSERT INTO `peliculas` VALUES (2,'Cocaine Bear','23 de marzo','₡6000',3);
INSERT INTO `peliculas` VALUES (3,'Matrix','15 de marzo','₡7500',5); 

 
 