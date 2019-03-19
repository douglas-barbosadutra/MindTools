-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: trizz
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experience`
--

LOCK TABLES `experience` WRITE;
/*!40000 ALTER TABLE `experience` DISABLE KEYS */;
INSERT INTO `experience` VALUES (1,2,'MUY BIEN','RAPIDO','ENGOMBRANTE',2),(2,2,'FGDF','sfgg','dfdfg',4),(3,1,'drfgfg','dfgtfh','hgjukj',2),(4,1,'fgfg','fgfh','ghghj',3),(5,1,'ghgjyj','fgfhyh','fghh',4),(6,1,'hgfyuhnkjm,',';okp[l;,.','estrfgh',3),(7,1,'tyftrdctrf','ikpok,l','dstrdf',3),(8,1,'a','a','a',4),(9,1,'rtrtrt','fgyy','ttytu',2),(10,1,'jhjkk','jhkjkk','jkkk',5);
/*!40000 ALTER TABLE `experience` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `feedback` (
  `id_feedback` int(11) NOT NULL AUTO_INCREMENT,
  `id_experience` int(11) NOT NULL,
  `id_principi` int(11) NOT NULL,
  `secondario` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id_feedback`,`id_experience`,`id_principi`),
  KEY `id_experience_idx` (`id_experience`),
  KEY `id_principi_idx` (`id_principi`),
  CONSTRAINT `id_experience` FOREIGN KEY (`id_experience`) REFERENCES `experience` (`id_experience`),
  CONSTRAINT `id_principi` FOREIGN KEY (`id_principi`) REFERENCES `principi` (`id_principi`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (1,1,20,0),(2,1,24,1),(3,1,34,1),(4,2,1,1),(5,2,13,0);
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
  `nomeita` varchar(300) NOT NULL,
  `d_punti` varchar(300) NOT NULL,
  `d_numeri` varchar(300) NOT NULL,
  `p_chiave` varchar(300) NOT NULL,
  `d_puntiIta` varchar(500) NOT NULL,
  `d_numeriIta` varchar(350) NOT NULL,
  `p_chiaveIta` varchar(350) NOT NULL,
  PRIMARY KEY (`id_principi`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `principi`
--

LOCK TABLES `principi` WRITE;
/*!40000 ALTER TABLE `principi` DISABLE KEYS */;
INSERT INTO `principi` VALUES (1,'Segmentation','Segmentazione','What happens if you divide the object?','1. Divide an object  into independent parts; 2. Make an object easy to disassemble; 3. Increase the degree of fragmentation or segmentation;','Slice pizza; Cutter knife blade; Furniture in kit form; Planner refills; Puzzle play mats for kids;','','',''),(2,'Separation','Rimozione/Estrazione','What part can you take out?','1.Separate an interfering part or property from an object. 2. Single out the only necessary part or property of an object. 2.Single out the only necessary part or property of an object.','Nutritional supplements; Perfume; Contact lens; Franchise business; Advertisment of Google','','',''),(3,'Local quality','Condizioni locali','Would like to change any part of the object?','1.Change an object\'s structure or environment from uniform to non- uniform. 2. Make each part of an object function in conditions most suitable for its operation. 3. Make each part of an object fulfill a different and useful function.','Bendable straw; Tear strip of packages; Date magnifier of watch; Magnetic tip of screwdriver; Touchscreen glove for smart phones','','',''),(4,'Asymmetry','Asimmetria','What happens if you change an object asymmetrically?','1.Change the shape of an object from symmetrical to asymmetrical. 2. If an object is asymmetrical, change its degree of asymmetry.','Tripod; Intake of Boeing 737 engine; Senz umbrella; Asymmetrical cord of earphones; Hair shop for men;','','',''),(5,'Merging','Unione/Combinazione','Is it possible to merge objects to perform parallel operations?','1.Bring closer togheter or merge identical or similar objects, assemble identical or similar parts to perform parallel operations. 2.Make operations contiguous or parallel; bring them togheter in time.','Mass merchandising store; Medical tour; All-in-one shampoo; Charity concert; Working holiday.','','',''),(6,'Multi-functionality','MultifunzionalitÃ ','Is it possible to make an object to perform multiple functions? ','1. Make an object or structure perform multiple functions; eliminate the need for other parts.','Swiss army knife; Smart phone; Multifunction fitness equipment; Two-way air conditioner; Sofa bed.','','',''),(7,'Nesting','Matrioska','What happens if you place one inside the other?','1. Place one object inside another; place each other, in turn, inside the other. 2. Make one part pass through a cavity in the other.','Ladder truck; Matryoshka (Russian traditional dolls); Hamburgers; ATM machine in Back; Built-in-furniture.','','',''),(8,'Counterweight','Compensazione di peso','Is there any counterweight to compensate for the weight?','1. To compesate for the weight of an object, merge it with other objects that provide lift. 2. To compesate for the weight of an object, make it interact with the environment.','Counterweight of elevator; Forklift truck; Carpool; Product placement adevertisment; star marketing','','',''),(9,'Preliminary counteraction','Anti-azione preliminare','How would you take 1 step back to move two steps forward?','1. Do an action with both harmful and useful effects. 2. Create beforehand stresses in an object.','Vaccination; Giving oneself up to the police; Free-sample stand; Free trial period; Product recalls;','','',''),(10,'Preliminary action','Azione preliminare','What can be done in advance?','1. Perform the required change of an object before it is needed (either fully or partially). 2. Pre-arrange objects such that they can come into action instantly.','Dotted line of toilet paper; Reservation; City air terminal; Envelope for return; Water detection stickers on cell phones;','','',''),(11,'Beforehand compesation ','Compensare in anticipo','What can you prepare for an emergency?','1. Prepare emergency means beforehand to compensate for the relatively low retiability of an object.','Car airbag; Spare tire; Black box; Fuse; Travel insurance;','','',''),(12,'Equipotentiality','Equipotenzialit?','What operating conditions can be changed to meet the level?','1. Change operating conditions to eliminate the need to raise or lower objects in a gravity field.','Extra trick shoe insoles; Movie subtitles; Low floor bus; Kid\'s menu in restaurant; Height controlled chair;','','',''),(13,'Reverse','Inversione','What can you do it in reverse?','1. Invert the action. 2. Make movable parts fixed, and fixed parts movable. 3. Turn the object (or process) \"upside down\".','Treadmill; Mobile library; Homeworking; Slow food; Door-to-door sales;','','',''),(14,'Curvature increase','Sfericit? o curvatura','What happens if you use curvilinear objects?','1. Instead of using rectilinear parts, use curvilinear ones. 2. Go from linear to rotary motion. 3. Use rollers, balls, spirals, domes.','Roundabout; Arches in architecture; Rotatable table; Spiral stair case; Revolving door','','',''),(15,'Dynamic parts','Dinamicit?','What parts can move relatively?','1. Allow the characteristics of an object to find an optimal operating condition. 2. If an object is rigid or inflexible, make it movable or adaptive. 3. divide an object into parts capable of movement relative to each other.','Jointed bus; Foldable bike; Convertible cars; Transforming robot toys; fordable keyboard;','','',''),(16,'Partial or Excessive','Azioni parziali o eccessive','What happens if the objects are slightly less or slightly more?','1. If 100 percent of an object is hard to archive using a given solution method them, use \"slightly less\" or \"slightly more\" of the same method.','Buffet restaurants; Post-it; Psychological pricing; Buy 1 get 1 free; Limited edition','','',''),(17,'Dimension change','Cambio di dimensione','What happens in the other dimensional space?','1. To move an object in two-or three-dimensional space. 2. Use a multi-story arrangement of objects instead of a single-story arramgement. 3. tilt or re-orient the object, lay it on its side.','Parking tower; QR code; 3D movie; Pup-up book; Wall mountable TV;','','',''),(18,'Vibration','Vibrazioni meccaniche','What happens if you vibrate the objects?','1. Cause an object to oscillate or vibrate. 2. Increase its frequency even up to the ultrasonic. 3. Use an objects\'s resonant frequency.','Vibrating pager; Ultrasonic cleaners; Ultrasound medical treatment; humidifier; Reversible lane;','','',''),(19,'Periodic actions','Azione periodica','What happens if periodic actions are used?','1. Instead of continuous action, use periodic or pulsating actions. 2. If an action is already periodic, change the periodic magnitude or frequency. 3. Use pauses between impuses to perform a different action.','Installment purchase; Traffic lights; Automatic air freshener; Monthly magazine; Sabbatical year;','','',''),(20,'Continuous useful action','Continuit? di azioni utili','What happens if you adopt coninuous actions?','1. Carry on work continuously: make all parts work at full load, all the time. 2. Eliminate all idle or intermittent actions. 3. Go form linar to ratary motion.','Convenience store; Greenhouse; Indoor ski slope; Dormed stadium; Roundabout;','','',''),(21,'Hurrying','Accelerare i tempi','What happens to the objects at high speed?','1. Conduct a process, or certain stages at high speed, to escape from destructive, harmful or hazardous operations.','Non-stop tolling; Drive-thru order; Flash pasteurization; Quick freezing; High-speed cutting;','','',''),(22,'Convert harmful to useful','Convertire azioni negative in ','Is it possible to use harmful factors to achieve a positive effect?','1. Use harmful factors to archieve a positive effect. 2. Eliminate the primary harmful action by adding it to another harmful action. 3. Amplify a harmful factor to such a degree that it is no longer harmful.','Recycling of waste materials; Hiring hackers as security consultants; Noise marketing: Botox; War memorial;','','',''),(23,'Feedback','Feedback','What happens if the feedback is introduced?','1. Introduce feedback. 2. If feedback is already used, change its magnitude or influence.','Survey; Likes on Facebook; Comments on articles; Parking guidance system; Fishing float;','','',''),(24,'Intermediary','Intermediario','What itermediate object can peform the action temporariy?','1. Use an intermediary carrier article or intermediary process. 2. Merge one object temporarily with another which can be easily removed.','Medicine capsules; Shoehorn; Chauffeur service; Real estate agent; Wedding planner;','','',''),(25,'Self-Service','Self-service','How can you make an object automatic?','1. Make an object serve it self by performing auxiliary helpful functions. 2. Use waste or lost resources, energy, or substances.','Automatic faucet; Self-sevice stand; Robot vacuum cleaner; Urinal sensor; DIY furniture;','','',''),(26,'Copying','Uso di copie','It is enough to use the copy of an object?','1. Instead of an unavaible, expensive, fragile object, use simpler and inexpensive copies. 2. Replace an object with optical copies.','Mannequins in show window; Artificial flowers; Scarecrow; Virtual simulation; Video conference;','','',''),(27,'Cheap disposables','Oggetti economici a vita corta','What can be replaced with disposable objects?','1. Replace an expensive object with a multiple of inexpensive objects, compromising certain qualities','Disposable cups; Disposable contact lenses; Disposable diapers; Disposable syringes; Security labels;','','',''),(28,'Mechanical interaction substitution','Sostituzione sistemi meccanici','What other sensory approaches can replace mechanical ones?','1. Replace a mechanical means with a sensory (optical, acoustic, taste or smell) means. 2. Use electric, magnetic and electromagnetic fields to interact with the object.','Melody cards; Braille books; Acoustic unit of traffic lights; Safety smell of LPG gas; Ultrasound mosquito repellents;','','',''),(29,'Pneumatics and hydraulics','Uso di gas e liquidi','Is it possible to use gas or liquid instead of solid parts?','1. Use gas and liquid parts of an object instead of solid parts (e.g. inflatable, filled with liquids, air cushion)','Air dome; Swimming tube; Water bed; Bubble wrap; Travel pillow;','','',''),(30,'Flexible shells and thin films','Membrane e pellicole','How can you isolate or protect the object using thin films?','1. Use flexible shells and thin films instead of three-dimensional structures. 2. Isolate the object from the external harmful environment using flexible sheels and thin films.','Air curtain; Protective film for smartphone; Sunblock cream; Keyboard skins; Window tinting;','','',''),(31,'Porous materials','Materiali porosi','What happens if you use porous materials?','1. Make an object porous ar add porous elements. 2. If an object is already porous, use the pores to introduce a useful substance or function.','Sponges; Mosquito nets; Filters of water purifier','','',''),(32,'Optical property change','Cambiare le propriet? ottiche ','It is possible to change the color or transparency?','1. Change the color of an object or its external environment. 2. Change the trasparency of an object or its external environment. 2. Change the trasparency of an object or its external environment.','Litmus paper; Temperature sensitive labels; Transparent packing materials; Red spot of Tefal frying pan; Photochromic sunglasses;','','',''),(33,'Homogeneity','Omogeneit?','What happens if the objects are similar or the same?','1. Make objects interact with a given object of the same material or material with identical properties.','Couple rings; Military uniform; Fashion street; Strach toothpicks; Skin colored band-aids;','','',''),(34,'Discarding or Recovering','Consumare e rigenerare','Is it possible to discard or recover an object?','1. Make portions of an object that have fulfilled their functions go away or modify them directly during operation. 2. Conversely, restore consumable parts of an object directly in opertion.','Satellite rockets; Dissolvable stitches for surgery; Refilled toner cartridges; Rechargeable batteries; Second-hand markets;','','',''),(35,'Parameter change','Cambiamento di parametri','Is it possible to change the parameters of an object?','1. Change an object\'s physical state (e.g. to a gas, liquid or solid). 2. Change the concentration or consistency. 3. Change the degree of flexibility.','Popcorns; Liquid soap; Liquid oxygen; Bubble hair dye; Coin tissue ( Instant wet towel)','','',''),(36,'Phase transition','Cambiamento di stato','How can you use phase transitions?','1. Use phenomena occurring during phase transitions (e.g. volume change, heat transfer, deformation).','Air conditioner; Humidifier; Dry ice blasting; Heat pipe; Perfumes;','','',''),(37,'Thermal expansion','Dilatazione termica','Which specific part do you want to try to expand?','1. Use thermal expansion (or contraction) of materials. 2. If thermal expansion is being used, use multiple materials with different coefficients of thermal expansion.','Hot-air balloon; Mercury thermometer; Bimetal; Expansion joints; Gap between railway lines;','','',''),(38,'Boosted interaction','Forti ossidanti','What happens if enhancers are added?','1. Replace common air with oxygen-enriched air (enriched atmosphere). 2. Replace enriched air with pure oxygen (highly enriched atmosphere).','Catalyst; Ozone Sterilization; Fermentation; Incentive and bonus; Cheerleaders;','','',''),(39,'Inert environment','Atmosfera inerte','What happens if neutral parts are added?','1. Replace a normal environment with an inert one. 2. Add neutral parts, or inert additives to an object.','Aseptic room; Nitrogen gas packing; Fire extinguisher; Vacation; Front page of Google;','','',''),(40,'Composite materials','Materiali compositi','Can you make something new by combining objects?','1. Change from uniform to composite (multiple) structures.','Reinforced concrete; Orchestra; Popera; Convergence products; Flower bouquet;','','','');
/*!40000 ALTER TABLE `principi` ENABLE KEYS */;
UNLOCK TABLES;

--
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
  `tipo_user` varchar(30) NOT NULL,
  `lingua` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`iduser`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'angelo','pippo','angelo','calaciura','janevito2014','user','italiano'),(2,'admin','admin','administratore','admin','fdgg','administratore',NULL),(3,'jane','jane','Jane','Gonzalez','janevito2014@gmail.com','user','inglese');
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

-- Dump completed on 2019-03-13 10:20:57
