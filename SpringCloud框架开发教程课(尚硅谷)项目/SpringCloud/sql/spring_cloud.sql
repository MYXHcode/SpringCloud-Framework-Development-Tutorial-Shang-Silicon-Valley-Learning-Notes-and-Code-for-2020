# 创建数据库 spring_cloud
CREATE DATABASE IF NOT EXISTS spring_cloud;

# 选择数据库 spring_cloud
USE spring_cloud;

# 创建支付表 payment
CREATE  TABLE IF NOT EXISTS `payment`
(
    `id`     BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `serial` VARCHAR(200) DEFAULT '',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

# 添加支付表 payment 的数据
INSERT INTO `payment`(`id`, `serial`)
VALUES (1, '20231202101000'),
       (2, '20231202101001'),
       (3, '20231202101002');
