/*
Navicat MySQL Data Transfer

Source Server         : jk
Source Server Version : 50725
Source Host           : 192.168.2.55:10001
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-03-22 17:30:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(2) DEFAULT NULL,
  `sex` int(2) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `del_flag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1b861e9d-34bb-4d7c-9ace-1dd43269', '三毛', '15', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('2e6455a4-c98f-4862-bfb9-84f6f405', '王五', '15', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('5f483d2c6f724b9b8c6ed53114441f59', '张三', '25', '2', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('68d73505-849d-46f3-89cc-7ba87b63', '张三4', '15', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('6d37ec44-af68-4254-8e2d-e0520a38', '张三0', '15', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('77ca6d6d-778b-470c-b50e-d36316ba', 'mybatis-plus-ar', '15', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('ab261e6a-da8b-42fb-a9bf-3f6eb314', '张三3', '15', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('b6d3bfbd-03ed-4877-94ae-e362e593', '张三1', '15', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('d2a32b06-6fac-43df-b0d6-16373020', '张三\'特殊`符号', '25', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('d2e09f9d-9bf8-4b93-baf7-e387c192', '张三2', '15', null, null, null, null, null, null, null);
