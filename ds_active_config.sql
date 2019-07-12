/*
 Navicat Premium Data Transfer

 Source Server         : lj
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : tl3d_cyc

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 12/07/2019 18:48:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ds_active_config
-- ----------------------------
DROP TABLE IF EXISTS `ds_active_config`;
CREATE TABLE `ds_active_config`  (
  `id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人名称',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人登录名称',
  `create_date` datetime NULL DEFAULT NULL COMMENT '创建日期',
  `update_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人名称',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人登录名称',
  `update_date` datetime NULL DEFAULT NULL COMMENT '更新日期',
  `sys_org_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属部门',
  `sys_company_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属公司',
  `bpm_status` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '流程状态',
  `start_date` datetime NULL DEFAULT NULL COMMENT '活动开始时间',
  `end_date` datetime NULL DEFAULT NULL COMMENT '活动结束时间',
  `app_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '应用代码',
  `activity_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动代码',
  `version_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动版本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ds_active_record
-- ----------------------------
DROP TABLE IF EXISTS `ds_active_record`;
CREATE TABLE `ds_active_record`  (
  `id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人名称',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人登录名称',
  `create_date` datetime NULL DEFAULT NULL COMMENT '创建日期',
  `update_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人名称',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人登录名称',
  `update_date` datetime NULL DEFAULT NULL COMMENT '更新日期',
  `sys_org_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属部门',
  `sys_company_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属公司',
  `bpm_status` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '流程状态',
  `wx_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '微信id',
  `date` datetime NULL DEFAULT NULL COMMENT '参与日期',
  `gift_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '获得的礼包码',
  `content` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '答题记录',
  `sex` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `birthday` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生日',
  `app_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '应用代码',
  `activity_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动代码',
  `version_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动版本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ds_gift_code
-- ----------------------------
DROP TABLE IF EXISTS `ds_gift_code`;
CREATE TABLE `ds_gift_code`  (
  `id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人名称',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人登录名称',
  `create_date` datetime NULL DEFAULT NULL COMMENT '创建日期',
  `update_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人名称',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人登录名称',
  `update_date` datetime NULL DEFAULT NULL COMMENT '更新日期',
  `sys_org_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属部门',
  `sys_company_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属公司',
  `bpm_status` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '流程状态',
  `gift_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '礼包码',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `app_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '应用代码',
  `activity_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动代码',
  `version_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动版本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ds_gift_code
-- ----------------------------
INSERT INTO `ds_gift_code` VALUES ('4028eac36be50dd8016be51ef5b9000c', '管理员', 'admin', '2019-07-12 15:38:59', NULL, NULL, NULL, 'A03', 'A03', '1', 'test1', 0, NULL, NULL, NULL);
INSERT INTO `ds_gift_code` VALUES ('4028eac36be50dd8016be51f173c000d', '管理员', 'admin', '2019-07-12 15:39:08', NULL, NULL, NULL, 'A03', 'A03', '1', 'test2', 0, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for ds_result_config
-- ----------------------------
DROP TABLE IF EXISTS `ds_result_config`;
CREATE TABLE `ds_result_config`  (
  `id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人名称',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人登录名称',
  `create_date` datetime NULL DEFAULT NULL COMMENT '创建日期',
  `update_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人名称',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人登录名称',
  `update_date` datetime NULL DEFAULT NULL COMMENT '更新日期',
  `sys_org_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属部门',
  `sys_company_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属公司',
  `bpm_status` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '流程状态',
  `constellation` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '星座名称',
  `start_date` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开始日期',
  `end_date` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '结束日期',
  `name1` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '男痴情人名称',
  `code1` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '男痴情人编码',
  `name2` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '女痴情人名称',
  `code2` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '女痴情人编码',
  `app_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '应用代码',
  `activity_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动代码',
  `version_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动版本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ds_result_config
-- ----------------------------
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be50dd83a0000', '管理员', 'admin', '2019-07-12 15:20:18', '管理员', 'admin', '2019-07-12 15:34:19', 'A03', 'A03', '1', '白羊座', '3.21', '4.19', '阿朱', '10', '阿朱', '10', NULL, NULL, NULL);
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be50e437f0001', '管理员', 'admin', '2019-07-12 15:20:45', '管理员', 'admin', '2019-07-12 15:32:13', 'A03', 'A03', '1', '金牛座', '4.20', '5.20', '虚竹', '4', '天山童姥', '3', NULL, NULL, NULL);
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be50f04c70002', '管理员', 'admin', '2019-07-12 15:21:35', '管理员', 'admin', '2019-07-12 15:37:02', 'A03', 'A03', '1', '双子座', '5.21', '6.21', '无崖子', '13', '无崖子', '13', NULL, NULL, NULL);
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be50f56250003', '管理员', 'admin', '2019-07-12 15:21:56', '管理员', 'admin', '2019-07-12 15:32:45', 'A03', 'A03', '1', '巨蟹座', '6.22', '7.22', '王语嫣', '5', '王语嫣', '5', NULL, NULL, NULL);
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be50fabaa0004', '管理员', 'admin', '2019-07-12 15:22:17', '管理员', 'admin', '2019-07-12 15:33:26', 'A03', 'A03', '1', '狮子座', '7.23', '8.22', '乔峰', '7', '李秋水', '6', NULL, NULL, NULL);
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be51035260005', '管理员', 'admin', '2019-07-12 15:22:53', '管理员', 'admin', '2019-07-12 15:32:22', 'A03', 'A03', '1', '处女座', '8.23', '9.22', '虚竹', '4', '天山童姥', '3', NULL, NULL, NULL);
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be51181580006', '管理员', 'admin', '2019-07-12 15:24:18', '管理员', 'admin', '2019-07-12 15:33:45', 'A03', 'A03', '1', '天秤座', '9.23', '10.23', '段正淳', '8', '段正淳', '8', NULL, NULL, NULL);
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be511ce420007', '管理员', 'admin', '2019-07-12 15:24:37', '管理员', 'admin', '2019-07-12 15:30:26', 'A03', 'A03', '1', '天蝎座', '10.24', '11.22', '游坦之', '2', '阿紫', '1', NULL, NULL, NULL);
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be51212bc0008', '管理员', 'admin', '2019-07-12 15:24:55', '管理员', 'admin', '2019-07-12 15:37:16', 'A03', 'A03', '1', '射手座', '11.23', '12.21', '钟灵', '12', '钟灵', '12', NULL, NULL, NULL);
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be512d5020009', '管理员', 'admin', '2019-07-12 15:25:45', '管理员', 'admin', '2019-07-12 15:30:34', 'A03', 'A03', '1', '摩羯座', '12.22', '1.19', '游坦之', '2', '阿紫', '1', NULL, NULL, NULL);
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be513489a000a', '管理员', 'admin', '2019-07-12 15:26:14', '管理员', 'admin', '2019-07-12 15:34:46', 'A03', 'A03', '1', '水瓶座', '1.20', '2.18', '慕容复', '11', '慕容复', '11', NULL, NULL, NULL);
INSERT INTO `ds_result_config` VALUES ('4028eac36be50dd8016be5139307000b', '管理员', 'admin', '2019-07-12 15:26:33', '管理员', 'admin', '2019-07-12 15:34:02', 'A03', 'A03', '1', '双鱼座', '2.19', '3.20', '段誉', '9', '段誉', '9', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
