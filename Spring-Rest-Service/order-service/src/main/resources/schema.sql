CREATE SCHEMA  IF NOT EXISTS `ec_orders`;
USE `ec_orders`;


CREATE TABLE orders (
  id BIGINT NOT NULL AUTO_INCREMENT,
  product_id BIGINT NOT NULL,
  customer_id BIGINT NOT NULL,
  quantity INTEGER NOT NULL,
  amount    DOUBLE NOT NULL,
  is_active BIT  NOT NULL,
  created_at DATE NOT NULL,
  created_by BIGINT NOT NULL,
  updated_at DATE DEFAULT NULL,
  updated_by BIGINT DEFAULT NULL,
  PRIMARY KEY (`id`)
);