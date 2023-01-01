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
-- Table structure for table `temp_cost_ingr`
--

DROP TABLE IF EXISTS `temp_cost_ingr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `temp_cost_ingr` (
  `code` varchar(10) NOT NULL,
  `regdate` varchar(8) NOT NULL DEFAULT '',
  `name` varchar(1000) NOT NULL DEFAULT '',
  `price` decimal(10,0) NOT NULL DEFAULT '0',
  PRIMARY KEY (`code`,`regdate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `temp_cost_ingr`
--

LOCK TABLES `temp_cost_ingr` WRITE;
/*!40000 ALTER TABLE `temp_cost_ingr` DISABLE KEYS */;
INSERT INTO `temp_cost_ingr` VALUES ('000001','20221230','포베이커 큐원 박력분 중력분 강력분 밀가루 1kg (택1)',5130),('000002','20221230','포베이커 큐원 박력분 중력분 강력분 밀가루 1kg (택1)',5130),('000003','20221230','안티모카푸토 00 클래시카 강력분 밀가루, 1kg, 1개',4000),('000011','20221230','페이장브레통 버터 4종 200g 방목우유버터, 1. 무염버터 200g',7000),('000012','20221230','더베이킹 콤비 쇼트닝 450g',7000),('000013','20221230','(무료배송)동서 엘로이 미니포션 크림치즈 28g /20 40 60개 중 수량선택, 28g 12개',12500),('000014','20221230','[아로마케이] RMA 상온 유화제 천연 화장품 만들기 재료 DIY, RMA 상온유화제 50g',6800),('000015','20221230','해표 카놀라유, 900ml, 2개',11900),('000016','20221230','오뚜기 브레드5000 마가린 4.5kg, 1개',18610),('000021','20221230','[청정원] 유기농 설탕 흑설탕, 1kg, 1개',5700),('000022','20221230','1000도씨 용융소금 고유미네랄 순도 99.9% 고급소금 (700g.1kg), 1통, 1kg',56250),('000023','20221230','오뚜기 옛날 물엿 1.2kg, 1개',3910),('000031','20221230','[당일 생산] 닥터안스에그 무항생제 인증 수의사 계란, 대란 60구, 3120g 이상',21500),('000032','20221230','남양유업 맛있는 우유 GT, 900ml, 2개',4850),('000041','20221230','키토라푸드 글루텐프리 베이킹파우더, 500g, 1개',7430),('000042','20221230','쿠킹스토리 제빵개량제 200g, 1개',1800),('000043','20221230','알티스트 설탕대신 스테비아 0칼로리 슈가파우더, 400g, 1개',6550),('000044','20221230','서울우유 탈지분유, 1kg, 1개',20350),('000045','20221230','메가카페 바닐라 파우더 1kg',10200),('000046','20221230','산과들 옥수수전분99% (옵션), 3kg, 1개',13790),('000047','20221230','네덜란드 산 더치코코아 코코아 분말(100%) 파우더 무가당 1KG, 1포',9380),('000048','20221230','소다혁명 베이킹소다 총용량, 3kg, 3개',12510),('000049','20221230','웰넛 자연두레 아몬드분말, 1kg, 1개입',14900),('000050','20221230','사프 인스턴트 이스트 레드, 125g, 1개',1610),('000051','20221230','오뚜기 딸기잼 디스펜팩 40개, 1세트',6790),('000052','20221230','쿠킹스토리 생크림 홉라, 1개, 500ml',3700),('000053','20221230','프리미엄YB1 시나몬가루 계피가루 계핏가루 300g 정유성분 가득',9800),('000054','20221230','맛을 그리다 호두분태 800g, 1봉',8000),('000055','20221230','썬뷰 유기농 건포도 스낵팩, 198g, 1개',8500),('000056','20221230','웰프레쉬 체리 (냉동), 500g, 1개',4300),('000057','20221230','선인 오렌지필 조각 100g (소분상품)',4950),('000058','20221230','디케이 와인 에어레이터 + 케이스 세트, 1세트',9250),('000059','20221230','슈크림호빵 커스터드 크림 대만찐빵 1팩 12개입',11000),('000060','20221230','스탠오 치즈 그라인더 미니 스텐 강판 브라운치즈 슬라이서 갈이 그레이터 가는도구 레몬 제스터',7500),('000061','20221230','SKY 다크초코칩, 1개, 1kg',6060),('000062','20221230','제키스 프리미엄 다크 초콜릿 92% 파우치 48개입, 259g, 1개',18000),('000063','20221230','스키피 땅콩버터 크리미, 462g, 1개',5450),('000064','20221230','베이킹파티 럼 레진 30g 럼향 럼주대용',900),('000065','20221230','유가원 유기농 슬라이스 아몬드 토핑, 140g, 1개',9600),('000066','20221230','유림 카라멜 색소 180ml 베이킹재료 가정용, 단품',1700),('000067','20221230','우리밀농협 우리밀 통밀가루 (1kg), 1개, 1kg',3400),('000068','20221230','\n                                                        이든타운 오트밀 압착귀리, 1kg, 1개\n                                                    ',5700),('000069','20221230','포베이커 선인 몰트엑기스 맥아당 발색 향미증진 몰트액 100g (소분상품)',3760);
/*!40000 ALTER TABLE `temp_cost_ingr` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-01 19:04:54
