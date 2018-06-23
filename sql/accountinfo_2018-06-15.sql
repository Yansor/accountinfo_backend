# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.6.40)
# Database: accountinfo
# Generation Time: 2018-06-15 07:53:33 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table digital_account
# ------------------------------------------------------------

DROP TABLE IF EXISTS `digital_account`;

CREATE TABLE `digital_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mark` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

LOCK TABLES `digital_account` WRITE;
/*!40000 ALTER TABLE `digital_account` DISABLE KEYS */;

INSERT INTO `digital_account` (`id`, `mark`, `name`, `password`, `url`, `user_name`)
VALUES
	(9,'http://www.docker-cn.com/registry-mirror     \"registry-mirrors\": [\"https://registry.docker-cn.com\"]','Docker 镜像',NULL,NULL,NULL),
	(10,NULL,'五星 - ITMS','Spring01','http://itms.efivestar.com:8080/','p170009'),
	(11,'http://P170009@git.efivestar.com/scm/dev/apiv1.git  http://git.efivestar.com:4100/v1/xsh-uop/%E8%BF%90%E8%90%A5%E7%BB%B4%E6%8A%A4/%E5%88%86%E7%B1%BB%E7%AE%A1%E7%90%86/%E5%95%86%E5%93%81%E5%88%86%E7%B1%BB%E7%AE%A1%E7%90%86/ ','五星 - 文档中心',NULL,NULL,NULL),
	(12,'itms-services://?action=download-manifest&url=https://dl.efivestar.com/eep/test/v1.8.60/manifest.plist','开发环境 圆圈Iphone 下载地址 ',NULL,NULL,NULL),
	(13,NULL,'测试统一运营平台','Spring03','https://xshadmin-t.efivestar.com/','F172723'),
	(14,NULL,'五星 - 集家 ','Spring15','https://home-t.5star.cn/','F160581'),
	(15,'npm set registry http://registry.npm.taobao.org','NPM 镜像 ',NULL,NULL,NULL),
	(16,'Licensee:米 业成 (STUDENT) Key: nFmqBBvEqdvbiUjy8NZiyWiRSg3yO+PtZ8c9wdwxWse4WprphvSu9sohAdpNnJK5','Axure RP 8 lIcense Key ',NULL,NULL,NULL),
	(17,'love teacher: wanghongsheng live street: qunlistreet love job : javaprogrammer','appleid','asd123—A',NULL,'tangzhilan@yeah.net'),
	(18,NULL,'预生产mq地址','guest','http://172.20.6.38:15672/','guest'),
	(26,'qq登录','52破解','112233***','https://www.52pojie.cn/','1650563029'),
	(21,NULL,'freebuf','abc895686843','http://www.freebuf.com/','nengbowan@163.com'),
	(22,NULL,'Atlassian','abc895686843','http://id.atlassian.com ','nengbowan@163.com'),
	(23,NULL,'IDEA _ License Key ',NULL,'http://xdouble.cn:8888/',NULL),
	(24,NULL,'五星 - 预生产调度中心','Spring03','','F172723');

/*!40000 ALTER TABLE `digital_account` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
