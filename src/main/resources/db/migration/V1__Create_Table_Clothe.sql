-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: loja
-- ------------------------------------------------------
-- Server version	8.0.36

CREATE TABLE `roupas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(255) DEFAULT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `tamanho` varchar(255) DEFAULT NULL,
  `preço` varchar(255) DEFAULT NULL,
  `quantidade` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);