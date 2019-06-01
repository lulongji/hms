/*
 Navicat Premium Data Transfer

 Source Server         : Cloopen - 192.168.179.191 （MCM测试）
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : 192.168.179.191
 Source Database       : hml

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : utf-8

 Date: 06/01/2019 20:24:43 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_reserve`
-- ----------------------------
DROP TABLE IF EXISTS `t_reserve`;
CREATE TABLE `t_reserve` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `phone` varchar(255) NOT NULL,
  `numcount` varchar(255) NOT NULL,
  `message` varchar(1000) DEFAULT NULL,
  `starttime` varchar(255) NOT NULL,
  `endtime` varchar(255) NOT NULL,
  `roomno` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_reserve`
-- ----------------------------
BEGIN;
INSERT INTO `t_reserve` VALUES ('2', 'zhaowq', '鲁龙基', '18600244699', '1', '韦琪酒店是北京市朝阳区人民政府投资开发的一间酒店。2004年被全国旅游星级饭店评定委员会评为三星酒店', '2015-09-24', '2015-09-24', '1002');
COMMIT;

-- ----------------------------
--  Table structure for `t_room`
-- ----------------------------
DROP TABLE IF EXISTS `t_room`;
CREATE TABLE `t_room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roomno` varchar(50) NOT NULL,
  `area` varchar(50) DEFAULT NULL,
  `breakfast` varchar(10) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `isflag` varchar(5) DEFAULT NULL,
  `leib` varchar(5) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `nono` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`,`roomno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_room`
-- ----------------------------
BEGIN;
INSERT INTO `t_room` VALUES ('1', '1001', '北京', '1', '1000', '1', '1', '此房间为豪华套房，诚邀您的入驻。', '1'), ('2', '1002', '北京', '1', '1200', '1', '2', '此房间为豪华套房，诚邀您的入驻。', '2'), ('3', '1003', '北京', '1', '1300', '1', '3', '此房间为豪华套房，诚邀您的入驻。', '3'), ('4', '1004', '北京', '1', '1400', '1', '1', '此房间为豪华套房，诚邀您的入驻。', '4'), ('5', '1005', '北京', '1', '1500', '1', '1', '此房间为豪华套房，诚邀您的入驻。', '5');
COMMIT;

-- ----------------------------
--  Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `cardnum` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_user`
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES ('1', 'zhaowq', '123456', '18600244688', '23210119981923');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
