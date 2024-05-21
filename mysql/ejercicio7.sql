-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ejercicio7
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ejercicio7
-- -----------------------------------------------------
drop schema if exists ejercicio7;
CREATE SCHEMA IF NOT EXISTS `ejercicio7` DEFAULT CHARACTER SET utf8 ;
USE `ejercicio7` ;

-- -----------------------------------------------------
-- Table `ejercicio7`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ejercicio7`.`country` (
  `country_id` SMALLINT(20) NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(50) NULL,
   `last_update` char(20) NULL,
  PRIMARY KEY (`country_id`),
  UNIQUE INDEX `country_id_UNIQUE` (`country_id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ejercicio7`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ejercicio7`.`city` (
  `city_id` SMALLINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `city` VARCHAR(50) NULL,
  `last_update` char(20) NULL,
  `country_id` SMALLINT(20) NOT NULL,
  PRIMARY KEY (`city_id`),
  INDEX `fk_city_country1_idx` (`country_id` ASC) VISIBLE,
  UNIQUE INDEX `city_id_UNIQUE` (`city_id` ASC) VISIBLE,
  CONSTRAINT `fk_city_country1`
    FOREIGN KEY (`country_id`)
    REFERENCES `ejercicio7`.`country` (`country_id`)
    );


-- -----------------------------------------------------
-- Table `ejercicio7`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ejercicio7`.`address` (
  `address_id` SMALLINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(50) NULL,
  `address2` VARCHAR(50) NULL,
  `district` VARCHAR(50) NULL,
  `postal_code` VARCHAR(10) NULL,
  `phone` VARCHAR(20) NULL,
  `location` VARCHAR(20) NULL,
  `last_update` char(20) NULL,
  `city_id` SMALLINT(20) UNSIGNED NOT NULL,
  PRIMARY KEY (`address_id`),
  INDEX `fk_address_city1_idx` (`city_id` ASC) VISIBLE,
  CONSTRAINT `fk_address_city1`
    FOREIGN KEY (`city_id`)
    REFERENCES `ejercicio7`.`city` (`city_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

START TRANSACTION;
USE `ejercicio7`;
INSERT INTO `ejercicio7`.`country` (`country_id`, `country`, `last_update`) VALUES (1, 'alga', '22:00');
INSERT INTO `ejercicio7`.`country` (`country_id`, `country`, `last_update`) VALUES (2, 'roboalgo', 'hace 3 dias');
INSERT INTO `ejercicio7`.`country` (`country_id`, `country`, `last_update`) VALUES (3, 'rabo', 'hace 4 dias');
INSERT INTO `ejercicio7`.`country` (`country_id`, `country`, `last_update`) VALUES (4, 'alli', 'hoy');

COMMIT;


-- -----------------------------------------------------
-- Data for table `ejercicio7`.`city`
-- -----------------------------------------------------
START TRANSACTION;
USE `ejercicio7`;
INSERT INTO `ejercicio7`.`city` (`city_id`, `city`, `last_update`, `country_id`) VALUES (1, 'tarragona', 'ayer', 1);
INSERT INTO `ejercicio7`.`city` (`city_id`, `city`, `last_update`, `country_id`) VALUES (2, 'reus', 'hoy', 2);
INSERT INTO `ejercicio7`.`city` (`city_id`, `city`, `last_update`, `country_id`) VALUES (3, 'vila-seca', 'nose', 3);
INSERT INTO `ejercicio7`.`city` (`city_id`, `city`, `last_update`, `country_id`) VALUES (4, 'valls', '8años', 4);

COMMIT;


-- -----------------------------------------------------
-- Data for table `ejercicio7`.`address`
-- -----------------------------------------------------
START TRANSACTION;
USE `ejercicio7`;
INSERT INTO `ejercicio7`.`address` (`address_id`, `address`, `address2`, `district`, `postal_code`, `phone`, `location`, `last_update`, `city_id`) VALUES (1, 'algo@nepe', 'algo@algo', 'nose', '9391', '093029010', 'yo', 'aca', DEFAULT);
INSERT INTO `ejercicio7`.`address` (`address_id`, `address`, `address2`, `district`, `postal_code`, `phone`, `location`, `last_update`, `city_id`) VALUES (2, 'ups', 'nose', 'estocolo', '39102', '093910223', 'aca', 'uff', DEFAULT);
INSERT INTO `ejercicio7`.`address` (`address_id`, `address`, `address2`, `district`, `postal_code`, `phone`, `location`, `last_update`, `city_id`) VALUES (3, 'estoy', 'hay', 'ahi', '93812', '932182932', 'si', 'no', DEFAULT);
INSERT INTO `ejercicio7`.`address` (`address_id`, `address`, `address2`, `district`, `postal_code`, `phone`, `location`, `last_update`, `city_id`) VALUES (4, 'sha', 'shi', 'sho', '31913', '339122001', 'shu', 'she', DEFAULT);


select * from city;
