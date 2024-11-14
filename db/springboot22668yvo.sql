-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot22668yvo
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springboot22668yvo`
--

/*!40000 DROP DATABASE IF EXISTS `springboot22668yvo`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springboot22668yvo` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springboot22668yvo`;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;


CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) NOT NULL COMMENT '地址',
  `name` varchar(200) NOT NULL COMMENT '收货人',
  `phone` varchar(200) NOT NULL COMMENT '电话',
  `isdefault` varchar(200) NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2024-04-03 08:07:49',11,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2024-04-03 08:07:49',12,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2024-04-03 08:07:49',13,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2024-04-03 08:07:49',14,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2024-04-03 08:07:49',15,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2024-04-03 08:07:49',16,'宇宙银河系月球1号','月某','13823888886','是'),(7,'2024-04-03 08:07:49',17,'宇宙银河系黑洞1号','黑某','13823888887','是'),(8,'2024-04-03 08:07:49',18,'宇宙银河系地球1号','地某','13823888888','是');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chengyuan`
--

DROP TABLE IF EXISTS `chengyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chengyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `shoujihao` varchar(200) DEFAULT NULL COMMENT '手机号',
  `touxiang` longtext COMMENT '头像',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `tuanduimingcheng` varchar(200) DEFAULT NULL COMMENT '团队名称',
  `tuanzhangxingming` varchar(200) DEFAULT NULL COMMENT '团长姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuming` (`yonghuming`)
) ENGINE=InnoDB AUTO_INCREMENT=1712131899285 DEFAULT CHARSET=utf8 COMMENT='成员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chengyuan`
--

LOCK TABLES `chengyuan` WRITE;
/*!40000 ALTER TABLE `chengyuan` DISABLE KEYS */;
INSERT INTO `chengyuan` VALUES (31,'2024-04-03 08:07:49','用户名1','姓名1','123456','男',1,'13823888881','upload/chengyuan_touxiang1.jpg','440300199101010001','团队名称1','团长姓名1'),(32,'2024-04-03 08:07:49','用户名2','姓名2','123456','男',2,'13823888882','upload/chengyuan_touxiang2.jpg','440300199202020002','团队名称2','团长姓名2'),(33,'2024-04-03 08:07:49','用户名3','姓名3','123456','男',3,'13823888883','upload/chengyuan_touxiang3.jpg','440300199303030003','团队名称3','团长姓名3'),(34,'2024-04-03 08:07:49','用户名4','姓名4','123456','男',4,'13823888884','upload/chengyuan_touxiang4.jpg','440300199404040004','团队名称4','团长姓名4'),(35,'2024-04-03 08:07:49','用户名5','姓名5','123456','男',5,'13823888885','upload/chengyuan_touxiang5.jpg','440300199505050005','团队名称5','团长姓名5'),(36,'2024-04-03 08:07:49','用户名6','姓名6','123456','男',6,'13823888886','upload/chengyuan_touxiang6.jpg','440300199606060006','团队名称6','团长姓名6'),(37,'2024-04-03 08:07:49','用户名7','姓名7','123456','男',7,'13823888887','upload/chengyuan_touxiang7.jpg','440300199707070007','团队名称7','团长姓名7'),(38,'2024-04-03 08:07:49','用户名8','姓名8','123456','男',8,'13823888888','upload/chengyuan_touxiang8.jpg','440300199808080008','团队名称8','团长姓名8'),(1712131877168,'2024-04-03 08:11:17','222','李月','222','女',36,'13612514514','upload/1712131871960.jpg','125145145145145145','111','杨洋'),(1712131899284,'2024-04-03 08:11:39','333','李月英','333','女',36,'13612514514','upload/1712131894201.jpg','145145145145145145','111','杨洋');
/*!40000 ALTER TABLE `chengyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL),(2,'picture2','upload/picture2.jpg',NULL),(3,'picture3','upload/picture3.jpg',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fuzeren`
--

DROP TABLE IF EXISTS `fuzeren`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fuzeren` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tuanduimingcheng` varchar(200) NOT NULL COMMENT '团队名称',
  `tuanzhangxingming` varchar(200) NOT NULL COMMENT '团长姓名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `touxiang` longtext COMMENT '头像',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tuanduimingcheng` (`tuanduimingcheng`)
) ENGINE=InnoDB AUTO_INCREMENT=1712131833580 DEFAULT CHARSET=utf8 COMMENT='负责人';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fuzeren`
--

LOCK TABLES `fuzeren` WRITE;
/*!40000 ALTER TABLE `fuzeren` DISABLE KEYS */;
INSERT INTO `fuzeren` VALUES (21,'2024-04-03 08:07:49','团队名称1','团长姓名1','123456','男',1,'upload/fuzeren_touxiang1.jpg','440300199101010001','13823888881'),(22,'2024-04-03 08:07:49','团队名称2','团长姓名2','123456','男',2,'upload/fuzeren_touxiang2.jpg','440300199202020002','13823888882'),(23,'2024-04-03 08:07:49','团队名称3','团长姓名3','123456','男',3,'upload/fuzeren_touxiang3.jpg','440300199303030003','13823888883'),(24,'2024-04-03 08:07:49','团队名称4','团长姓名4','123456','男',4,'upload/fuzeren_touxiang4.jpg','440300199404040004','13823888884'),(25,'2024-04-03 08:07:49','团队名称5','团长姓名5','123456','男',5,'upload/fuzeren_touxiang5.jpg','440300199505050005','13823888885'),(26,'2024-04-03 08:07:49','团队名称6','团长姓名6','123456','男',6,'upload/fuzeren_touxiang6.jpg','440300199606060006','13823888886'),(27,'2024-04-03 08:07:49','团队名称7','团长姓名7','123456','男',7,'upload/fuzeren_touxiang7.jpg','440300199707070007','13823888887'),(28,'2024-04-03 08:07:49','团队名称8','团长姓名8','123456','男',8,'upload/fuzeren_touxiang8.jpg','440300199808080008','13823888888'),(1712131833579,'2024-04-03 08:10:33','111','杨洋','111','女',36,'upload/1712131824891.jpg','125145145145145145','13612514514');
/*!40000 ALTER TABLE `fuzeren` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'admin','users','管理员','391ikibxf4kuilwyerm525d0ke66kt0b','2024-04-03 08:09:53','2024-04-03 09:09:54'),(2,1712131833579,'111','fuzeren','负责人','bmmhpp6etxzs0fbwc0l89p1bg04intj0','2024-04-03 08:10:54','2024-04-03 09:13:16'),(3,1712131877168,'222','chengyuan','成员','0mnkwveehjziq8chpbvq8uhxijo6b971','2024-04-03 08:12:06','2024-04-03 09:12:07'),(4,1712131899284,'333','chengyuan','成员','9bp3cw4uxtcylx243gpb0m6s9ti2l4c3','2024-04-03 08:12:38','2024-04-03 09:12:39');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuanduixiangmu`
--

DROP TABLE IF EXISTS `tuanduixiangmu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tuanduixiangmu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `xiangmufenlei` varchar(200) DEFAULT NULL COMMENT '项目分类',
  `xiangmujieduan` varchar(200) DEFAULT NULL COMMENT '项目阶段',
  `tuanduimingcheng` varchar(200) DEFAULT NULL COMMENT '团队名称',
  `tuanzhangxingming` varchar(200) DEFAULT NULL COMMENT '团长姓名',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `xiangmuxuqiu` longtext COMMENT '项目需求',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8 COMMENT='团队项目';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuanduixiangmu`
--

LOCK TABLES `tuanduixiangmu` WRITE;
/*!40000 ALTER TABLE `tuanduixiangmu` DISABLE KEYS */;
INSERT INTO `tuanduixiangmu` VALUES (41,'2024-04-03 08:07:49','项目名称1','项目分类1','未开始','团队名称1','团长姓名1','联系电话1','项目需求1'),(42,'2024-04-03 08:07:49','项目名称2','项目分类2','未开始','团队名称2','团长姓名2','联系电话2','项目需求2'),(43,'2024-04-03 08:07:49','项目名称3','项目分类3','未开始','团队名称3','团长姓名3','联系电话3','项目需求3'),(44,'2024-04-03 08:07:49','项目名称4','项目分类4','未开始','团队名称4','团长姓名4','联系电话4','项目需求4'),(45,'2024-04-03 08:07:49','项目名称5','项目分类5','未开始','团队名称5','团长姓名5','联系电话5','项目需求5'),(46,'2024-04-03 08:07:49','项目名称6','项目分类6','未开始','团队名称6','团长姓名6','联系电话6','项目需求6'),(47,'2024-04-03 08:07:49','项目名称7','项目分类7','未开始','团队名称7','团长姓名7','联系电话7','项目需求7'),(48,'2024-04-03 08:07:49','项目名称8','项目分类8','未开始','团队名称8','团长姓名8','联系电话8','项目需求8'),(49,'2024-04-03 08:11:58','新能源','新能源','进行中','111','杨洋','13612514514','<p>新能源新能源新能源新能源新能源新能源新能源新能源新能源新能源新能源新能源</p>');
/*!40000 ALTER TABLE `tuanduixiangmu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `image` varchar(200) DEFAULT NULL COMMENT '头像',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','upload/image1.jpg','管理员','2024-04-03 08:07:49');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmufenlei`
--

DROP TABLE IF EXISTS `xiangmufenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiangmufenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmufenlei` varchar(200) NOT NULL COMMENT '项目分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='项目分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmufenlei`
--

LOCK TABLES `xiangmufenlei` WRITE;
/*!40000 ALTER TABLE `xiangmufenlei` DISABLE KEYS */;
INSERT INTO `xiangmufenlei` VALUES (11,'2024-04-03 08:07:49','项目分类1'),(12,'2024-04-03 08:07:49','项目分类2'),(13,'2024-04-03 08:07:49','项目分类3'),(14,'2024-04-03 08:07:49','项目分类4'),(15,'2024-04-03 08:07:49','项目分类5'),(16,'2024-04-03 08:07:49','项目分类6'),(17,'2024-04-03 08:07:49','项目分类7'),(18,'2024-04-03 08:07:49','项目分类8'),(19,'2024-04-03 08:10:02','新能源');
/*!40000 ALTER TABLE `xiangmufenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmuwendang`
--

DROP TABLE IF EXISTS `xiangmuwendang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiangmuwendang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `fengmian` longtext COMMENT '封面',
  `ziliaofenlei` varchar(200) DEFAULT NULL COMMENT '资料分类',
  `ziliaowenjian` longtext COMMENT '资料文件',
  `shangchuanshijian` datetime DEFAULT NULL COMMENT '上传时间',
  `tuanduimingcheng` varchar(200) DEFAULT NULL COMMENT '团队名称',
  `chengyuanxingming` varchar(200) DEFAULT NULL COMMENT '成员姓名',
  `ziliaojianjie` longtext COMMENT '资料简介',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '成员账号',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8 COMMENT='项目文档';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmuwendang`
--

LOCK TABLES `xiangmuwendang` WRITE;
/*!40000 ALTER TABLE `xiangmuwendang` DISABLE KEYS */;
INSERT INTO `xiangmuwendang` VALUES (61,'2024-04-03 08:07:49','项目名称1','upload/xiangmuwendang_fengmian1.jpg,upload/xiangmuwendang_fengmian2.jpg,upload/xiangmuwendang_fengmian3.jpg','资料分类1','','2024-04-03 16:07:49','团队名称1','成员姓名1','资料简介1','成员账号1',1),(62,'2024-04-03 08:07:49','项目名称2','upload/xiangmuwendang_fengmian2.jpg,upload/xiangmuwendang_fengmian3.jpg,upload/xiangmuwendang_fengmian4.jpg','资料分类2','','2024-04-03 16:07:49','团队名称2','成员姓名2','资料简介2','成员账号2',2),(63,'2024-04-03 08:07:49','项目名称3','upload/xiangmuwendang_fengmian3.jpg,upload/xiangmuwendang_fengmian4.jpg,upload/xiangmuwendang_fengmian5.jpg','资料分类3','','2024-04-03 16:07:49','团队名称3','成员姓名3','资料简介3','成员账号3',3),(64,'2024-04-03 08:07:49','项目名称4','upload/xiangmuwendang_fengmian4.jpg,upload/xiangmuwendang_fengmian5.jpg,upload/xiangmuwendang_fengmian6.jpg','资料分类4','','2024-04-03 16:07:49','团队名称4','成员姓名4','资料简介4','成员账号4',4),(65,'2024-04-03 08:07:49','项目名称5','upload/xiangmuwendang_fengmian5.jpg,upload/xiangmuwendang_fengmian6.jpg,upload/xiangmuwendang_fengmian7.jpg','资料分类5','','2024-04-03 16:07:49','团队名称5','成员姓名5','资料简介5','成员账号5',5),(66,'2024-04-03 08:07:49','项目名称6','upload/xiangmuwendang_fengmian6.jpg,upload/xiangmuwendang_fengmian7.jpg,upload/xiangmuwendang_fengmian8.jpg','资料分类6','','2024-04-03 16:07:49','团队名称6','成员姓名6','资料简介6','成员账号6',6),(67,'2024-04-03 08:07:49','项目名称7','upload/xiangmuwendang_fengmian7.jpg,upload/xiangmuwendang_fengmian8.jpg,upload/xiangmuwendang_fengmian9.jpg','资料分类7','','2024-04-03 16:07:49','团队名称7','成员姓名7','资料简介7','成员账号7',7),(68,'2024-04-03 08:07:49','项目名称8','upload/xiangmuwendang_fengmian8.jpg,upload/xiangmuwendang_fengmian9.jpg,upload/xiangmuwendang_fengmian10.jpg','资料分类8','','2024-04-03 16:07:49','团队名称8','成员姓名8','资料简介8','成员账号8',8),(69,'2024-04-03 08:12:29','新能源','upload/1712131935457.jpg','过程','upload/1712131943063.doc','2024-04-03 16:15:14','111','样衣','<p>新能源新能源新能源新能源新能源新能源新能源新能源新能源新能源新能源新能源新能源</p>','222',1712131877168),(70,'2024-04-03 08:13:07','新能源','upload/1712131968731.jpg','过程','upload/1712131977719.doc','2024-04-03 16:15:49','111','丽丽','<p>新能源新能源新能源</p>','333',1712131899284);
/*!40000 ALTER TABLE `xiangmuwendang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ziliaofenlei`
--

DROP TABLE IF EXISTS `ziliaofenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ziliaofenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ziliaofenlei` varchar(200) NOT NULL COMMENT '资料分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8 COMMENT='资料分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ziliaofenlei`
--

LOCK TABLES `ziliaofenlei` WRITE;
/*!40000 ALTER TABLE `ziliaofenlei` DISABLE KEYS */;
INSERT INTO `ziliaofenlei` VALUES (51,'2024-04-03 08:07:49','资料分类1'),(52,'2024-04-03 08:07:49','资料分类2'),(53,'2024-04-03 08:07:49','资料分类3'),(54,'2024-04-03 08:07:49','资料分类4'),(55,'2024-04-03 08:07:49','资料分类5'),(56,'2024-04-03 08:07:49','资料分类6'),(57,'2024-04-03 08:07:49','资料分类7'),(58,'2024-04-03 08:07:49','资料分类8'),(59,'2024-04-03 08:10:46','过程');
/*!40000 ALTER TABLE `ziliaofenlei` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-16 12:56:10
