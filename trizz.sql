-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
<<<<<<< HEAD
-- Host: localhost    Database: dump20190305
=======
-- Host: localhost    Database: este
>>>>>>> e41ec4e81a51004e8ab8eb16283f563dcc918c0d
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
<<<<<<< HEAD
-- Table structure for table `experience`
--

DROP TABLE IF EXISTS `experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `experience` (
  `id_experience` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `commento` varchar(400) NOT NULL,
  `positivo` varchar(400) DEFAULT NULL,
  `negativo` varchar(300) DEFAULT NULL,
  `score` int(11) NOT NULL,
  PRIMARY KEY (`id_experience`),
  KEY `id_user_idx` (`id_user`),
  CONSTRAINT `id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`iduser`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experience`
--

LOCK TABLES `experience` WRITE;
/*!40000 ALTER TABLE `experience` DISABLE KEYS */;
INSERT INTO `experience` VALUES (1,3,'mi sono divertita a risolvere il mio problema usando segmentation perchè avevo un grosso problema','superTop','Noioso',3),(2,2,'ciao','ciaoooooo','Bene',2);
/*!40000 ALTER TABLE `experience` ENABLE KEYS */;
UNLOCK TABLES;

--
=======
>>>>>>> e41ec4e81a51004e8ab8eb16283f563dcc918c0d
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `feedback` (
  `id_feedback` int(11) NOT NULL AUTO_INCREMENT,
<<<<<<< HEAD
  `id_experience` int(11) NOT NULL,
  `id_principi` int(11) NOT NULL,
  `secondario` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id_feedback`,`id_experience`,`id_principi`),
  KEY `id_experience_idx` (`id_experience`),
  KEY `id_principi_idx` (`id_principi`),
  CONSTRAINT `id_experience` FOREIGN KEY (`id_experience`) REFERENCES `experience` (`id_experience`),
  CONSTRAINT `id_principi` FOREIGN KEY (`id_principi`) REFERENCES `principi` (`id_principi`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
=======
  `id_principi` int(11) NOT NULL,
  `valore` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_feedback`),
  KEY `id_principi_idx` (`id_principi`),
  KEY `valore_idx` (`valore`),
  CONSTRAINT `id_principi` FOREIGN KEY (`id_principi`) REFERENCES `principi` (`id_principi`),
  CONSTRAINT `valore` FOREIGN KEY (`valore`) REFERENCES `score` (`id_score`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
>>>>>>> e41ec4e81a51004e8ab8eb16283f563dcc918c0d
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
<<<<<<< HEAD
INSERT INTO `feedback` VALUES (1,1,20,1),(2,2,15,0),(3,2,2,1);
=======
>>>>>>> e41ec4e81a51004e8ab8eb16283f563dcc918c0d
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `principi`
--

DROP TABLE IF EXISTS `principi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `principi` (
  `id_principi` int(10) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `descrizione` varchar(30) NOT NULL,
  `d_punti` varchar(50) NOT NULL,
  `d_numeri` varchar(300) NOT NULL,
  `p_chiave` varchar(100) NOT NULL,
  PRIMARY KEY (`id_principi`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `principi`
--

LOCK TABLES `principi` WRITE;
/*!40000 ALTER TABLE `principi` DISABLE KEYS */;
INSERT INTO `principi` VALUES (1,'Segmentation','Segmentazione','What happens if you divide the object?','1. Divide an obj into independent parts; 2. Make an object easy to disassemble; 3. Increase the degree of fragmentation or segmentation;','Slice pizza; Cutter knife blade; Furniture in kit form; Planner refills; Puzzle play mats for kids;'),(2,'Taking Out / Separation','Rimozione/Estrazione','What part can you take out?','',''),(3,'Local Quality','Condizioni locali','Would like to change any part of the object?','',''),(4,'Asymmetry','Asimmetria','What happens if you change an object a','',''),(5,'Merging','Unione/Combinazione','Is it possible to merge objects to perform ','',''),(6,'Universality / Multi-functionality','Multifunzionalità','Is it possible to make an object to perform ','',''),(7,'Nested Doll','Matrioska','What happens if you place one inside the other?','',''),(8,'Anti-Weight / Counterweight','Compensazione di peso','Is there any counterweight to compensate','',''),(9,'Prior Counteraction','Anti-azione preliminare','How would you take 1 step back to move ','',''),(10,'Prior Action','Azione preliminare','What can be done in advance?','',''),(11,'Cushion in Advance','Compensare in anticipo','What can you prepare for an emergency?','',''),(12,'Equipotentiality','Equipotenzialit?','What operating conditions can be changed to meet t','',''),(13,'The Other Way Round','Inversione','What can you do it in reverse?','',''),(14,'Spheroidality - Curvature','Sfericit? o curvatura','What happens if you use curvilinear objects?','',''),(15,'Dynamics','Dinamicit?','What parts can move relatively?','',''),(16,'Partial or Excessive Action','Azioni parziali o eccessive','What happens if the objects are slightly less or s','',''),(17,'Another Dimension','Cambio di dimensione','What happens in the other dimensional space?','',''),(18,'Mechanical Vibration','Vibrazioni meccaniche','What happens if you vibrate the objects?','',''),(19,'Periodic Action','Azione periodica','What happens if periodic actions are used?','',''),(20,'Continuity of Useful Action','Continuit? di azioni utili','What happens if you adopt coninuous actions?','',''),(21,'Rushing Through / Hurrying','Accelerare i tempi','What happens to the objects at high speed?','',''),(22,'Blessing in Disguise / Convert harmful to useful','Convertire azioni negative in ','Is it possible to use harmful factors to achieve a','',''),(23,'Feedback','Feedback','What happens if the feedback is introduced?','',''),(24,'Intermediary','Intermediario','What itermediate object can peform the action temp','',''),(25,'Self-Service','Self-service','How can you make an object automatic?','',''),(26,'Copying','Uso di copie','It is enough to use the copy of an object?','',''),(27,'Cheap Short-Living Objects','Oggetti economici a vita corta','What can be replaced with disposable objects?','',''),(28,'Replace Mechanical System','Sostituzione sistemi meccanici','What other sensory approaches can replace mechanic','',''),(29,'Pneumatics and Hydraulics','Uso di gas e liquidi','Is it possible to use gas or liquid instead of sol','',''),(30,'Flexible Membranes / Thin Films','Membrane e pellicole','How can you isolate or protect the object using th','',''),(31,'Porous Materials','Materiali porosi','What happens if you use porous materials?','',''),(32,'Colour Change','Cambiare le propriet? ottiche ','It is possible to change the color or transparency','',''),(33,'Homogeneity','Omogeneit?','What happens if the objects are similar or the sam','',''),(34,'Discarding and Recovering','Consumare e rigenerare','Is it possible to discard or recover an object?','',''),(35,'Parameter Change','Cambiamento di parametri','Is it possible to change the parameters of an obje','',''),(36,'Phase Transition','Cambiamento di stato','How can you use phase transitions?','',''),(37,'Thermal Expansion','Dilatazione termica','Which specific part do you want to try to expand?','',''),(38,'Accelerate Oxidation / Boosted interaction','Forti ossidanti','What happens if enhancers are added?','',''),(39,'Inert Environment','Atmosfera inerte','What happens if neutral parts are added?','',''),(40,'Composite Materials','Materiali compositi','Can you make something new by combining objects?','','');
/*!40000 ALTER TABLE `principi` ENABLE KEYS */;
UNLOCK TABLES;

--
<<<<<<< HEAD
=======
-- Table structure for table `score`
--

DROP TABLE IF EXISTS `score`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `score` (
  `id_score` int(11) NOT NULL AUTO_INCREMENT,
  `valore` enum('1','2','3','4','5') NOT NULL,
  PRIMARY KEY (`id_score`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score`
--

LOCK TABLES `score` WRITE;
/*!40000 ALTER TABLE `score` DISABLE KEYS */;
/*!40000 ALTER TABLE `score` ENABLE KEYS */;
UNLOCK TABLES;

--
>>>>>>> e41ec4e81a51004e8ab8eb16283f563dcc918c0d
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `iduser` int(15) NOT NULL AUTO_INCREMENT,
  `user` varchar(16) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nome` varchar(25) NOT NULL,
  `cognome` varchar(25) NOT NULL,
  `email` varchar(27) NOT NULL,
  `tipo_user` enum('ADMIN','UTENTE') NOT NULL,
  PRIMARY KEY (`iduser`)
<<<<<<< HEAD
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
=======
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
>>>>>>> e41ec4e81a51004e8ab8eb16283f563dcc918c0d
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
<<<<<<< HEAD
INSERT INTO `user` VALUES (1,'admin','admin','angelo','calaciura','angelo@gmail.com','ADMIN'),(2,'angelo','pippo','angelo','calaciura','angelo@gmail.com','UTENTE'),(3,'giusy','giusy','giusy','razzano','giusy@gmail.com','UTENTE');
=======
>>>>>>> e41ec4e81a51004e8ab8eb16283f563dcc918c0d
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

<<<<<<< HEAD
-- Dump completed on 2019-03-06 17:59:39
=======
-- Dump completed on 2019-02-28  3:12:45
>>>>>>> e41ec4e81a51004e8ab8eb16283f563dcc918c0d
