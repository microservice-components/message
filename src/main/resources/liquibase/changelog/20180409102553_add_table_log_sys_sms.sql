--liquibase formatted sql
--changeset duiker(generated):20180409102553_add_table_log_sys_sms

SET FOREIGN_KEY_CHECKS = 0;
-- ----------------------------
-- Table structure for log_sys_sms
-- ----------------------------
DROP TABLE IF EXISTS `log_sys_sms`;
CREATE TABLE `log_sys_sms` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `result_id` char(40) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '发送结果id',
  `source` char(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '来源',
  `content` varchar(4096) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '内容',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `count` int(11) NOT NULL DEFAULT '1',
  `account` varchar(24) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'sdk_91zd' COMMENT '发送短信所用账号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8713 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='短信发送日志';

SET FOREIGN_KEY_CHECKS = 1;
