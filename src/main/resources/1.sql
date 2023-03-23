/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : spbootvue14647znzjglxt

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2022-12-30 21:52:06
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `admins`
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins` (
                          `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                          `admin_username` varchar(50) NOT NULL COMMENT '帐号',
                          `admin_password` varchar(50) NOT NULL COMMENT '密码',
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='管理员';

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- Table structure for `register`
-- ----------------------------
DROP TABLE IF EXISTS `registers`;
CREATE TABLE `registers` (
                             `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                             `turnstle_id` int(10) unsigned NOT NULL COMMENT '闸机id',
                             `turnstle_num` varchar(50) NOT NULL COMMENT '机器号',
                             `turnstle_name` varchar(255) NOT NULL COMMENT '名称',
                             `turnstle_pics` varchar(255) NOT NULL COMMENT '图片',
                             `turnstle_area` int(10) unsigned NOT NULL COMMENT '区域',
                             `turnstle_register` varchar(50) NOT NULL COMMENT '登记',
                             `user_id` int(10) unsigned NOT NULL COMMENT '个人信息ID',
                             `username` varchar(50) NOT NULL COMMENT '用户名',
                             `user_realname` varchar(50) NOT NULL COMMENT '姓名',
                             `user_tele` varchar(50) NOT NULL COMMENT '手机',
                             `user_pics` varchar(255) NOT NULL COMMENT '照片',
                             `register_remarks` text NOT NULL COMMENT '备注',
                             `register_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '登记时间',
                             PRIMARY KEY (`id`),
                             KEY `register_turnstle_id_index` (`turnstle_id`),
                             KEY `register_area_index` (`turnstle_area`),
                             KEY `register_user_id_index` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COMMENT='登记';


-- ----------------------------
-- Table structure for `operator`
-- ----------------------------
DROP TABLE IF EXISTS `operator`;
CREATE TABLE `operator` (
                            `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                            `turnstle_id` int(10) unsigned NOT NULL COMMENT '闸机id',
                            `turnstle_num` varchar(50) NOT NULL COMMENT '机器号',
                            `turnstle_name` varchar(255) NOT NULL COMMENT '名称',
                            `turnstle_pics` varchar(255) NOT NULL COMMENT '图片',
                            `turnstle_area` int(10) unsigned NOT NULL COMMENT '区域',
                            `turnstle_operator` varchar(50) NOT NULL COMMENT '操作',
                            `operator_remarks` text NOT NULL COMMENT '备注',
                            `operator_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '操作时间',
                            PRIMARY KEY (`id`),
                            KEY `operator_turnstle_id_index` (`turnstle_id`),
                            KEY `operator_turnstle_area_index` (`turnstle_area`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COMMENT='开关机';


DROP TABLE IF EXISTS `area`;
CREATE TABLE `area` (
                        `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                        `area_name` varchar(50) NOT NULL COMMENT '区域名',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='区域';


-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
                         `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                         `username` varchar(50) NOT NULL COMMENT '用户名',
                         `password` varchar(50) NOT NULL COMMENT '密码',
                         `user_realname` varchar(50) NOT NULL COMMENT '姓名',
                         `user_gentle` varchar(10) NOT NULL COMMENT '性别',
                         `user_tele` varchar(50) NOT NULL COMMENT '手机',
                         `user_email` varchar(50) NOT NULL COMMENT '邮箱',
                         `user_identity` varchar(50) NOT NULL COMMENT '身份证',
                         `user_pics` varchar(255) NOT NULL COMMENT '照片',
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='用户';


DROP TABLE IF EXISTS `turnstles`;
CREATE TABLE `turnstles` (
                             `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
                             `turnstle_num` varchar(50) NOT NULL COMMENT '机器号',
                             `turnstle_name` varchar(255) NOT NULL COMMENT '名称',
                             `turnstle_pics` varchar(255) NOT NULL COMMENT '图片',
                             `turnstle_area` int(10) unsigned NOT NULL COMMENT '区域',
                             `turnstle_status` varchar(50) NOT NULL COMMENT '状态',
                             `turnstle_remarks` text NOT NULL COMMENT '详细',
                             PRIMARY KEY (`id`),
                             KEY `turnstles_turnstle_area_index` (`turnstle_area`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COMMENT='闸机';


