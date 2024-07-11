-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema clubsoftcuentacorriente
-- -----------------------------------------------------

show databases;

-- -----------------------------------------------------
-- Schema clubsoftcuentacorriente
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `clubsoftcuentacorriente` DEFAULT CHARACTER SET utf8 ;
USE `clubsoftcuentacorriente` ;

-- -----------------------------------------------------
-- Table `softclubcuentacorriente`.`cctabla`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubsoftcuentacorriente`.`cctabla` (
  `id_cctabla` INT NOT NULL AUTO_INCREMENT,
  `fecha_cctabla` DATE NOT NULL,
  `motivo_cctabla` VARCHAR(255) NOT NULL,
  `monto_cctabla` DECIMAL(10,2) NOT NULL,
  `metodo_cctabla` VARCHAR(45) NOT NULL,
  `estado_cctabla` VARCHAR(45) NOT NULL,
  `comprobante_cctabla` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_cctabla`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
