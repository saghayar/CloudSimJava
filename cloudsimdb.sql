/*
Navicat MySQL Data Transfer

Source Server         : Cloudsim
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : cloudsimdb

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2016-08-11 14:33:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cloudlet
-- ----------------------------
DROP TABLE IF EXISTS `cloudlet`;
CREATE TABLE `cloudlet` (
  `id` int(11) NOT NULL,
  `length` int(11) DEFAULT NULL,
  `fileSize` int(11) DEFAULT NULL,
  `outputSize` int(11) DEFAULT NULL,
  `vmid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cloudlet
-- ----------------------------

-- ----------------------------
-- Table structure for cloudserver
-- ----------------------------
DROP TABLE IF EXISTS `cloudserver`;
CREATE TABLE `cloudserver` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `status` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cloudserver
-- ----------------------------

-- ----------------------------
-- Table structure for cost
-- ----------------------------
DROP TABLE IF EXISTS `cost`;
CREATE TABLE `cost` (
  `id` int(11) NOT NULL,
  `pCost` varchar(10) DEFAULT NULL,
  `memoryCost` varchar(10) DEFAULT NULL,
  `storagecost` varchar(50) DEFAULT NULL,
  `bandwidthcost` varchar(10) DEFAULT NULL,
  `dc_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cost
-- ----------------------------
INSERT INTO `cost` VALUES ('1', '2.0', '20.0', '20.0', '20.0', '1');
INSERT INTO `cost` VALUES ('2', '10.0', '1.0', '101.0', '0.0', '2');
INSERT INTO `cost` VALUES ('3', '20.0', '20.0', '20.0', '20.0', '3');
INSERT INTO `cost` VALUES ('4', '20.0', '20.0', '220.0', '20.0', '4');
INSERT INTO `cost` VALUES ('5', '20.0', '220.0', '20.0', '20.0', '5');
INSERT INTO `cost` VALUES ('6', '10.0', '10.0', '10.0', '10.0', '6');
INSERT INTO `cost` VALUES ('7', '99.0', '99.0', '990.0', '990.0', '7');
INSERT INTO `cost` VALUES ('8', '120.0', '210.0', '20.0', '10.0', '8');
INSERT INTO `cost` VALUES ('9', '3.0', '0.0', '0.0', '0.0', '9');
INSERT INTO `cost` VALUES ('10', '3.0', '0.0', '0.0', '0.0', '10');
INSERT INTO `cost` VALUES ('11', '3.0', '0.0', '0.0', '0.0', '11');
INSERT INTO `cost` VALUES ('12', '0.1', '0.05', '0.001', '0.1', '12');
INSERT INTO `cost` VALUES ('13', '0.1', '0.05', '0.001', '0.1', '13');
INSERT INTO `cost` VALUES ('14', '0.1', '0.05', '0.001', '0.1', '14');
INSERT INTO `cost` VALUES ('15', '0.1', '0.05', '0.001', '0.1', '15');
INSERT INTO `cost` VALUES ('16', '0.1', '0.05', '0.001', '0.1', '16');
INSERT INTO `cost` VALUES ('17', '0.1', '0.05', '0.001', '0.1', '17');
INSERT INTO `cost` VALUES ('18', '0.1', '0.05', '0.001', '0.1', '18');
INSERT INTO `cost` VALUES ('19', '0.1', '0.05', '0.001', '0.1', '19');
INSERT INTO `cost` VALUES ('20', '0.1', '0.05', '0.001', '0.1', '20');
INSERT INTO `cost` VALUES ('21', '0.1', '0.05', '0.001', '0.1', '21');
INSERT INTO `cost` VALUES ('22', '0.1', '0.05', '0.001', '0.1', '22');
INSERT INTO `cost` VALUES ('23', '0.1', '0.05', '0.001', '0.1', '23');
INSERT INTO `cost` VALUES ('24', '0.1', '0.05', '0.001', '0.1', '24');
INSERT INTO `cost` VALUES ('25', '0.1', '0.05', '0.001', '0.1', '25');
INSERT INTO `cost` VALUES ('26', '0.1', '0.05', '0.001', '0.1', '26');
INSERT INTO `cost` VALUES ('27', '0.1', '0.05', '0.001', '0.1', '27');
INSERT INTO `cost` VALUES ('28', '0.1', '0.05', '0.001', '0.1', '28');
INSERT INTO `cost` VALUES ('29', '0.1', '0.05', '0.001', '0.1', '29');
INSERT INTO `cost` VALUES ('30', '0.1', '0.05', '0.001', '0.1', '30');
INSERT INTO `cost` VALUES ('31', '0.1', '0.05', '0.001', '0.1', '31');
INSERT INTO `cost` VALUES ('32', '0.1', '0.05', '0.001', '0.1', '32');
INSERT INTO `cost` VALUES ('33', '0.1', '0.05', '0.001', '0.1', '33');
INSERT INTO `cost` VALUES ('34', '0.1', '0.05', '0.001', '0.1', '34');
INSERT INTO `cost` VALUES ('35', '0.1', '0.05', '0.001', '0.1', '35');
INSERT INTO `cost` VALUES ('36', '0.1', '0.05', '0.001', '0.1', '36');
INSERT INTO `cost` VALUES ('37', '0.1', '0.05', '0.001', '0.1', '37');

-- ----------------------------
-- Table structure for datacenter
-- ----------------------------
DROP TABLE IF EXISTS `datacenter`;
CREATE TABLE `datacenter` (
  `id` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `arch` varchar(21) DEFAULT NULL,
  `os` varchar(33) DEFAULT NULL,
  `vmm` varchar(23) DEFAULT NULL,
  `timezone` varchar(22) DEFAULT NULL,
  `sc_interval` varchar(33) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of datacenter
-- ----------------------------
INSERT INTO `datacenter` VALUES ('1', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('2', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('3', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('4', 'DataCenter1', 'x86', 'Linux', 'Xen', '4.0', '0.0');
INSERT INTO `datacenter` VALUES ('5', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('6', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('7', null, null, null, null, '0.0', '0.0');
INSERT INTO `datacenter` VALUES ('8', null, null, null, null, '0.0', '0.0');
INSERT INTO `datacenter` VALUES ('9', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('10', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('11', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('12', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('13', null, null, null, null, '0.0', '0.0');
INSERT INTO `datacenter` VALUES ('14', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('15', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('16', null, null, null, null, '0.0', '0.0');
INSERT INTO `datacenter` VALUES ('17', null, null, null, null, '0.0', '0.0');
INSERT INTO `datacenter` VALUES ('18', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');
INSERT INTO `datacenter` VALUES ('19', null, null, null, null, '0.0', '0.0');
INSERT INTO `datacenter` VALUES ('20', 'DataCenter1', 'x86', 'Linux', 'Xen', '10.0', '0.0');

-- ----------------------------
-- Table structure for host
-- ----------------------------
DROP TABLE IF EXISTS `host`;
CREATE TABLE `host` (
  `id` int(11) NOT NULL,
  `ram` varchar(50) DEFAULT NULL,
  `storage` varchar(40) DEFAULT NULL,
  `bw` varchar(50) DEFAULT NULL,
  `vm_schulder` varchar(45) DEFAULT NULL,
  `dc_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of host
-- ----------------------------
INSERT INTO `host` VALUES ('1', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('2', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('3', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('4', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('5', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('6', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('7', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('8', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('9', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('10', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('11', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('12', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('13', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('14', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('15', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('16', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('17', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('18', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('19', '1000000', '40000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('20', '10000000', '400000', '1000000', 'Time Shared', '1');
INSERT INTO `host` VALUES ('21', '1000000', '40000', '1000000', 'Time Shared', '1');

-- ----------------------------
-- Table structure for pe
-- ----------------------------
DROP TABLE IF EXISTS `pe`;
CREATE TABLE `pe` (
  `id` int(11) NOT NULL,
  `mips` int(11) DEFAULT NULL,
  `hostid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pe
-- ----------------------------
INSERT INTO `pe` VALUES ('1', '2400', '1');
INSERT INTO `pe` VALUES ('2', '2400', '1');
INSERT INTO `pe` VALUES ('3', '2400', '1');
INSERT INTO `pe` VALUES ('4', '2400', '1');
INSERT INTO `pe` VALUES ('5', '2400', '2');
INSERT INTO `pe` VALUES ('6', '2400', '2');
INSERT INTO `pe` VALUES ('7', '2400', '2');
INSERT INTO `pe` VALUES ('8', '2400', '2');
INSERT INTO `pe` VALUES ('9', '2400', '3');
INSERT INTO `pe` VALUES ('10', '2400', '3');
INSERT INTO `pe` VALUES ('11', '2400', '3');
INSERT INTO `pe` VALUES ('12', '2400', '3');
INSERT INTO `pe` VALUES ('13', '2400', '4');
INSERT INTO `pe` VALUES ('14', '2400', '4');
INSERT INTO `pe` VALUES ('15', '2400', '4');
INSERT INTO `pe` VALUES ('16', '2400', '4');
INSERT INTO `pe` VALUES ('17', '2400', '5');
INSERT INTO `pe` VALUES ('18', '2400', '5');
INSERT INTO `pe` VALUES ('19', '2400', '5');
INSERT INTO `pe` VALUES ('20', '2400', '5');
INSERT INTO `pe` VALUES ('21', '2400', '6');
INSERT INTO `pe` VALUES ('22', '2400', '6');
INSERT INTO `pe` VALUES ('23', '2400', '6');
INSERT INTO `pe` VALUES ('24', '2400', '6');
INSERT INTO `pe` VALUES ('25', '2400', '7');
INSERT INTO `pe` VALUES ('26', '2400', '7');
INSERT INTO `pe` VALUES ('27', '2400', '7');
INSERT INTO `pe` VALUES ('28', '2400', '7');
INSERT INTO `pe` VALUES ('29', '2400', '8');
INSERT INTO `pe` VALUES ('30', '2400', '8');
INSERT INTO `pe` VALUES ('31', '2400', '8');
INSERT INTO `pe` VALUES ('32', '2400', '8');
INSERT INTO `pe` VALUES ('33', '2400', '9');
INSERT INTO `pe` VALUES ('34', '2400', '9');
INSERT INTO `pe` VALUES ('35', '2400', '9');
INSERT INTO `pe` VALUES ('36', '2400', '9');
INSERT INTO `pe` VALUES ('37', '2400', '10');
INSERT INTO `pe` VALUES ('38', '2400', '10');
INSERT INTO `pe` VALUES ('39', '2400', '10');
INSERT INTO `pe` VALUES ('40', '2400', '10');
INSERT INTO `pe` VALUES ('41', '2400', '11');
INSERT INTO `pe` VALUES ('42', '2400', '11');
INSERT INTO `pe` VALUES ('43', '2400', '11');
INSERT INTO `pe` VALUES ('44', '2400', '11');
INSERT INTO `pe` VALUES ('45', '2400', '12');
INSERT INTO `pe` VALUES ('46', '2400', '12');
INSERT INTO `pe` VALUES ('47', '2400', '12');
INSERT INTO `pe` VALUES ('48', '2400', '12');
INSERT INTO `pe` VALUES ('49', '2400', '13');
INSERT INTO `pe` VALUES ('50', '2400', '13');
INSERT INTO `pe` VALUES ('51', '2400', '13');
INSERT INTO `pe` VALUES ('52', '2400', '13');
INSERT INTO `pe` VALUES ('53', '2400', '14');
INSERT INTO `pe` VALUES ('54', '2400', '14');
INSERT INTO `pe` VALUES ('55', '2400', '14');
INSERT INTO `pe` VALUES ('56', '2400', '14');
INSERT INTO `pe` VALUES ('57', '2400', '15');
INSERT INTO `pe` VALUES ('58', '2400', '15');
INSERT INTO `pe` VALUES ('59', '2400', '15');
INSERT INTO `pe` VALUES ('60', '2400', '15');
INSERT INTO `pe` VALUES ('61', '2400', '16');
INSERT INTO `pe` VALUES ('62', '2400', '16');
INSERT INTO `pe` VALUES ('63', '2400', '16');
INSERT INTO `pe` VALUES ('64', '2400', '16');
INSERT INTO `pe` VALUES ('65', '2400', '17');
INSERT INTO `pe` VALUES ('66', '2400', '17');
INSERT INTO `pe` VALUES ('67', '2400', '17');
INSERT INTO `pe` VALUES ('68', '2400', '17');
INSERT INTO `pe` VALUES ('69', '2400', '18');
INSERT INTO `pe` VALUES ('70', '2400', '18');
INSERT INTO `pe` VALUES ('71', '2400', '18');
INSERT INTO `pe` VALUES ('72', '2400', '18');
INSERT INTO `pe` VALUES ('73', '2400', '19');
INSERT INTO `pe` VALUES ('74', '2400', '19');
INSERT INTO `pe` VALUES ('75', '2400', '19');
INSERT INTO `pe` VALUES ('76', '2400', '19');
INSERT INTO `pe` VALUES ('77', '2400', '20');
INSERT INTO `pe` VALUES ('78', '2400', '20');
INSERT INTO `pe` VALUES ('79', '2400', '20');
INSERT INTO `pe` VALUES ('80', '2400', '20');
INSERT INTO `pe` VALUES ('81', '2400', '21');
INSERT INTO `pe` VALUES ('82', '2400', '21');
INSERT INTO `pe` VALUES ('83', '2400', '21');

-- ----------------------------
-- Table structure for vm
-- ----------------------------
DROP TABLE IF EXISTS `vm`;
CREATE TABLE `vm` (
  `id` int(11) NOT NULL,
  `mips` int(11) DEFAULT NULL,
  `size` varchar(150) DEFAULT NULL,
  `ram` varchar(50) DEFAULT NULL,
  `bw` varchar(50) DEFAULT NULL,
  `peCount` int(11) DEFAULT NULL,
  `vmm` varchar(10) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `dc_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vm
-- ----------------------------
INSERT INTO `vm` VALUES ('1', '1000', '1000', '512', '1000', '1', 'Xen', '1', '1');
INSERT INTO `vm` VALUES ('2', '1000', '1000', '512', '1000', '1', 'Xen', '1', '1');
INSERT INTO `vm` VALUES ('3', '1000', '1000', '512', '1000', '4', 'Xen', '1', '2');
INSERT INTO `vm` VALUES ('4', '1000', '1000', '512', '1000', '4', 'Xen', '1', '3');
INSERT INTO `vm` VALUES ('5', '1000', '1000', '512', '1000', '1', 'Xen', '1', '5');
INSERT INTO `vm` VALUES ('6', '1000', '1000', '512', '1000', '1', 'Xen', '1', '5');
INSERT INTO `vm` VALUES ('7', '1000', '1000', '512', '1000', '1', 'Xen', '1', '6');
INSERT INTO `vm` VALUES ('8', '1000', '1000', '512', '1000', '1', 'Xen', '1', '7');
INSERT INTO `vm` VALUES ('9', '1000', '1000', '512', '1000', '1', 'Xen', '1', '8');
INSERT INTO `vm` VALUES ('10', '1000', '1000', '512', '1000', '1', 'Xen', '1', '10');
INSERT INTO `vm` VALUES ('11', '1000', '1000', '512', '1000', '1', 'Xen', '1', '11');
INSERT INTO `vm` VALUES ('12', '1000', '1000', '512', '1000', '1', 'Xen', '1', '12');
INSERT INTO `vm` VALUES ('13', '1000', '1000', '512', '1000', '1', 'Xen', '1', '13');
INSERT INTO `vm` VALUES ('14', '1000', '1000', '512', '1000', '1', 'Xen', '1', '13');
INSERT INTO `vm` VALUES ('15', '1000', '1000', '512', '1000', '1', 'Xen', '1', '13');
INSERT INTO `vm` VALUES ('16', '1000', '1000', '512', '1000', '1', 'Xen', '1', '13');
INSERT INTO `vm` VALUES ('17', '1000', '1000', '512', '1000', '1', 'Xen', '1', '14');
INSERT INTO `vm` VALUES ('18', '1000', '1000', '512', '1000', '1', 'Xen', '1', '14');
INSERT INTO `vm` VALUES ('19', '1000', '1000', '512', '1000', '4', 'Xen', '1', '15');
INSERT INTO `vm` VALUES ('20', '1000', '1000', '512', '1000', '4', 'Xen', '1', '15');
INSERT INTO `vm` VALUES ('21', '1000', '1000', '512', '1000', '1', 'Xen', '1', '16');
INSERT INTO `vm` VALUES ('22', '1000', '1000', '512', '1000', '1', 'Xen', '1', '16');
INSERT INTO `vm` VALUES ('23', '1000', '1000', '512', '1000', '1', 'Xen', '1', '17');
INSERT INTO `vm` VALUES ('24', '1000', '1000', '512', '1000', '1', 'Xen', '1', '18');
INSERT INTO `vm` VALUES ('25', '1000', '1000', '512', '1000', '1', 'Xen', '1', '18');
INSERT INTO `vm` VALUES ('26', '1000', '1000', '512', '1000', '1', 'Xen', '1', '18');
INSERT INTO `vm` VALUES ('27', '1000', '1000', '512', '1000', '1', 'Xen', '1', '18');
INSERT INTO `vm` VALUES ('28', '1000', '1000', '512', '1000', '1', 'Xen', '1', '18');
INSERT INTO `vm` VALUES ('29', '1000', '1000', '512', '1000', '1', 'Xen', '1', '18');
INSERT INTO `vm` VALUES ('30', '1000', '1000', '512', '1000', '1', 'Xen', '1', '19');
INSERT INTO `vm` VALUES ('31', '1000', '1000', '512', '1000', '1', 'Xen', '1', '19');
INSERT INTO `vm` VALUES ('32', '1000', '1000', '512', '1000', '1', 'Xen', '1', '20');
INSERT INTO `vm` VALUES ('33', '1000', '1000', '512', '1000', '1', 'Xen', '1', '20');
