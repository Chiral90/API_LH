-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: lh
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `master_info_ingr`
--

DROP TABLE IF EXISTS `master_info_ingr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `master_info_ingr` (
  `code` varchar(10) NOT NULL,
  `name` varchar(100) NOT NULL DEFAULT '',
  `class_sup` char(2) NOT NULL DEFAULT '',
  `class_sub` char(2) NOT NULL DEFAULT '',
  `unit_sup` char(2) NOT NULL DEFAULT '',
  `unit_sub` char(2) NOT NULL DEFAULT '',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `master_info_ingr`
--

LOCK TABLES `master_info_ingr` WRITE;
/*!40000 ALTER TABLE `master_info_ingr` DISABLE KEYS */;
INSERT INTO `master_info_ingr` VALUES ('000001','박력분','01','01','02','01'),('000002','중력분','01','01','02','01'),('000003','강력분','01','01','02','02'),('000011','버터','01','01','02','02'),('000012','쇼트닝','01','01','02','02'),('000013','크림치즈','01','01','02','02'),('000014','유화제','01','01','02','02'),('000015','식용유','01','01','02','02'),('000016','마가린','01','01','02','02'),('000021','설탕','01','01','02','02'),('000022','소금','01','01','02','02'),('000023','물엿','01','01','02','02'),('000031','계란','01','02','02','02'),('000032','우유','01','01','02','02'),('000041','베이킹 파우더','01','01','02','02'),('000042','제빵 개량제','01','01','02','02'),('000043','슈가 파우더','01','01','02','02'),('000044','탈지 분유','01','01','02','02'),('000045','바닐라 파우더','01','01','02','02'),('000046','옥수수 전분','01','01','02','02'),('000047','코코아 파우더','01','01','02','02'),('000048','베이킹 소다','01','01','02','02'),('000049','아몬드 파우더','01','01','02','02'),('000050','이스트','01','01','02','02'),('000051','딸기잼','01','01','02','02'),('000052','생크림','01','01','02','02'),('000053','계피가루','01','01','02','02'),('000054','호두분태','01','01','02','02'),('000055','건포도','01','01','02','02'),('000056','체리','01','01','02','02'),('000057','오렌지필','01','01','02','02'),('000058','적포도주','01','01','02','02'),('000059','커스터드 크림','01','01','02','02'),('000060','레몬 제스터','01','01','02','02'),('000061','초코칩','01','01','02','02'),('000062','다크 초콜릿(커버추어)','01','01','02','02'),('000063','땅콩버터','01','01','02','02'),('000064','럼','01','01','02','02'),('000065','아몬드 슬라이스','01','01','02','02'),('000066','카라멜 색소','01','01','02','02'),('000067','통밀가루','01','01','02','02'),('000068','오트밀','01','01','02','02'),('000069','몰트액','01','01','02','02');
/*!40000 ALTER TABLE `master_info_ingr` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-01 19:04:53
