CREATE DATABASE  IF NOT EXISTS `administracionescolar` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `administracionescolar`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: administracionescolar
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `docente`
--

DROP TABLE IF EXISTS `docente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docente` (
  `idDocente` int NOT NULL AUTO_INCREMENT,
  `idPersona` int DEFAULT NULL,
  `Usuario` varchar(45) DEFAULT NULL,
  `Pass` varchar(45) DEFAULT NULL,
  `Especialidad` varchar(45) DEFAULT NULL,
  `idMateria` int DEFAULT NULL,
  `UltimaModificacion` date DEFAULT NULL,
  PRIMARY KEY (`idDocente`),
  KEY `FK_idPersona_idx` (`idPersona`),
  KEY `FK_idMateria_idx` (`idMateria`),
  CONSTRAINT `FK_idMateria1` FOREIGN KEY (`idMateria`) REFERENCES `materias` (`idMaterias`),
  CONSTRAINT `FK_idPersona` FOREIGN KEY (`idPersona`) REFERENCES `personas` (`idPersonas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `idEstudiate` int NOT NULL AUTO_INCREMENT,
  `idPersona` int DEFAULT NULL,
  `Usuario` varchar(45) DEFAULT NULL,
  `Pass` varchar(45) DEFAULT NULL,
  `GradoAcademico` varchar(45) DEFAULT NULL,
  `UltimaModificacion` date DEFAULT NULL,
  PRIMARY KEY (`idEstudiate`),
  KEY `FK_idPersona_idx` (`idPersona`),
  CONSTRAINT `FK_idPersona1` FOREIGN KEY (`idPersona`) REFERENCES `personas` (`idPersonas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `materias`
--

DROP TABLE IF EXISTS `materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materias` (
  `idMaterias` int NOT NULL AUTO_INCREMENT,
  `idEstudiante` int DEFAULT NULL,
  `NombreMateria` varchar(45) DEFAULT NULL,
  `UltimaModificacion` date DEFAULT NULL,
  PRIMARY KEY (`idMaterias`),
  KEY `FK_idEstudiante_idx` (`idEstudiante`),
  CONSTRAINT `FK_idEstudiante` FOREIGN KEY (`idEstudiante`) REFERENCES `estudiante` (`idEstudiate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `notas`
--

DROP TABLE IF EXISTS `notas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notas` (
  `idNotas` int NOT NULL AUTO_INCREMENT,
  `idEstudiante` int DEFAULT NULL,
  `idDocente` int DEFAULT NULL,
  `idMateria` int DEFAULT NULL,
  `Lab1` double DEFAULT NULL,
  `Examen1` double DEFAULT NULL,
  `Lab2` double DEFAULT NULL,
  `Examen2` double DEFAULT NULL,
  `Lab3` double DEFAULT NULL,
  `Examen3` double DEFAULT NULL,
  `NotaFinal` double DEFAULT NULL,
  `UltimaModificacion` date DEFAULT NULL,
  PRIMARY KEY (`idNotas`),
  KEY `FK_idEstudiante_idx` (`idEstudiante`),
  KEY `FK_idDocente_idx` (`idDocente`),
  KEY `FK_idMateria_idx` (`idMateria`),
  CONSTRAINT `FK_idDocente` FOREIGN KEY (`idDocente`) REFERENCES `docente` (`idDocente`),
  CONSTRAINT `FK_idEstudiante1` FOREIGN KEY (`idEstudiante`) REFERENCES `estudiante` (`idEstudiate`),
  CONSTRAINT `FK_idMateria` FOREIGN KEY (`idMateria`) REFERENCES `materias` (`idMaterias`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personas` (
  `idPersonas` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellido` varchar(45) DEFAULT NULL,
  `Sexo` varchar(45) DEFAULT NULL,
  `FechaNacimiento` date DEFAULT NULL,
  `UltimaModificacion` date DEFAULT NULL,
  PRIMARY KEY (`idPersonas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-19 22:31:41
