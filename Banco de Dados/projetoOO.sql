SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';


-- -----------------------------------------------------
-- Table `projetoOO`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projetoOO`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `projetoOO`.`Secretaria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projetoOO`.`Secretaria` (
  `codigoIdentificacao` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(45) NOT NULL,
  `rg` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `folga` VARCHAR(45) NOT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`codigoIdentificacao`),
  INDEX `fk_Secretaria_Usuario_idx` (`Usuario_idUsuario` ASC),
  CONSTRAINT `fk_Secretaria_Usuario`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `projetoOO`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `projetoOO`.`Aluno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projetoOO`.`Aluno` (
  `matricula` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `dataNascimento` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `serie` VARCHAR(45) NOT NULL,
  `Secretaria_codigoIdentificacao` INT NOT NULL,
  PRIMARY KEY (`matricula`),
  INDEX `fk_Aluno_Secretaria1_idx` (`Secretaria_codigoIdentificacao` ASC),
  CONSTRAINT `fk_Aluno_Secretaria1`
    FOREIGN KEY (`Secretaria_codigoIdentificacao`)
    REFERENCES `projetoOO`.`Secretaria` (`codigoIdentificacao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
