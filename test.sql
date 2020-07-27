/*
 Navicat Premium Data Transfer

 Source Server         : local_mysql
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 27/07/2020 16:27:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NULL DEFAULT NULL,
  `product_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `productor` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_product_detail_index`(`user_id`, `product_name`, `productor`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of order_info
-- ----------------------------
INSERT INTO `order_info` VALUES (3, 1, 'p1', 'DX');
INSERT INTO `order_info` VALUES (1, 1, 'p1', 'WHH');
INSERT INTO `order_info` VALUES (2, 1, 'p2', 'WL');
INSERT INTO `order_info` VALUES (4, 2, 'p1', 'WHH');
INSERT INTO `order_info` VALUES (5, 2, 'p5', 'WL');
INSERT INTO `order_info` VALUES (6, 3, 'p3', 'MA');
INSERT INTO `order_info` VALUES (7, 4, 'p1', 'WHH');
INSERT INTO `order_info` VALUES (8, 6, 'p1', 'WHH');
INSERT INTO `order_info` VALUES (9, 9, 'p8', 'TE');

-- ----------------------------
-- Table structure for t
-- ----------------------------
DROP TABLE IF EXISTS `t`;
CREATE TABLE `t`  (
  `qty` int(11) NULL DEFAULT NULL,
  `price` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t
-- ----------------------------
INSERT INTO `t` VALUES (3, 50);
INSERT INTO `t` VALUES (5, 60);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'cs', '123456');
INSERT INTO `user` VALUES (2, 'cs2', '123456');
INSERT INTO `user` VALUES (3, 'cs5', '12345612');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `age` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `name_index`(`name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES (1, 'xys', 20);
INSERT INTO `user_info` VALUES (2, 'a', 21);
INSERT INTO `user_info` VALUES (3, 'b', 23);
INSERT INTO `user_info` VALUES (4, 'c', 50);
INSERT INTO `user_info` VALUES (5, 'd', 15);
INSERT INTO `user_info` VALUES (6, 'e', 20);
INSERT INTO `user_info` VALUES (7, 'f', 21);
INSERT INTO `user_info` VALUES (8, 'g', 23);
INSERT INTO `user_info` VALUES (9, 'h', 50);
INSERT INTO `user_info` VALUES (10, 'i', 15);

-- ----------------------------
-- View structure for v
-- ----------------------------
DROP VIEW IF EXISTS `v`;
CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `v` AS SELECT qty, price, qty*price AS value FROM t ;

SET FOREIGN_KEY_CHECKS = 1;
