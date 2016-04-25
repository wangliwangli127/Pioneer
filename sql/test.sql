/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.6.17 : Database - pioneer
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pioneer` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `pioneer`;

/*Table structure for table `p_clickmoods` */

DROP TABLE IF EXISTS `p_clickmoods`;

CREATE TABLE `p_clickmoods` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `m_id` int(11) NOT NULL,
  `uid_list` longtext,
  `browsedTimes` int(11) DEFAULT NULL,
  `praisedTimes` int(11) DEFAULT NULL,
  `comment` varchar(200) NOT NULL,
  `clickdate` datetime NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `p_clickmoods` */

/*Table structure for table `p_friendrelation` */

DROP TABLE IF EXISTS `p_friendrelation`;

CREATE TABLE `p_friendrelation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `u_uid` int(11) NOT NULL,
  `f_uid` int(11) NOT NULL,
  `is_shield` int(11) DEFAULT NULL,
  `is_friends` int(11) DEFAULT NULL,
  `created_time` datetime NOT NULL,
  `invite_content` varchar(200) DEFAULT NULL,
  `is_pass` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `p_friendrelation` */

/*Table structure for table `p_message` */

DROP TABLE IF EXISTS `p_message`;

CREATE TABLE `p_message` (
  `msgid` int(11) NOT NULL AUTO_INCREMENT,
  `from_uid` int(11) DEFAULT NULL,
  `to_uid` int(11) DEFAULT NULL,
  `content` longtext NOT NULL,
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`msgid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `p_message` */

/*Table structure for table `p_moods` */

DROP TABLE IF EXISTS `p_moods`;

CREATE TABLE `p_moods` (
  `m_id` int(11) NOT NULL AUTO_INCREMENT,
  `f_uid` int(11) NOT NULL,
  `mcontent` longtext NOT NULL,
  `created_time` datetime NOT NULL,
  `is_public` int(11) DEFAULT NULL,
  PRIMARY KEY (`m_id`),
  KEY `FKCD0A73CDC56EE3C7` (`m_id`),
  CONSTRAINT `FKCD0A73CDC56EE3C7` FOREIGN KEY (`m_id`) REFERENCES `p_clickmoods` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `p_moods` */

/*Table structure for table `p_users` */

DROP TABLE IF EXISTS `p_users`;

CREATE TABLE `p_users` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `date_joined` datetime NOT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `p_users` */

insert  into `p_users`(`u_id`,`username`,`email`,`date_joined`) values (1,'wangli','','0000-00-00 00:00:00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
