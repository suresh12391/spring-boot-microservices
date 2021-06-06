CREATE SCHEMA  IF NOT EXISTS `ec_products`;
USE `ec_products`;


CREATE TABLE products (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  quantity INTEGER NOT NULL,
  price    DOUBLE NOT NULL,
  is_active BIT  NOT NULL,
  created_at DATE NOT NULL,
  created_by BIGINT NOT NULL,
  updated_at DATE DEFAULT NULL,
  updated_by BIGINT DEFAULT NULL,
  PRIMARY KEY (`id`)
);