DROP TABLE IF EXISTS `roupas`;

CREATE TABLE `roupas` (
                          `id` int NOT NULL AUTO_INCREMENT,
                          `marca` varchar(255) NOT NULL,
                          `preço` varchar(255) NOT NULL,
                          `quantidade` varchar(255) NOT NULL,
                          `tamanho` varchar(255) NOT NULL,
                          `tipo` varchar(255) NOT NULL,
                          PRIMARY KEY (`id`)
);
