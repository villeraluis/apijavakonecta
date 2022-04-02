-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 02, 2022 at 10:23 PM
-- Server version: 5.7.24
-- PHP Version: 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `konecta2`
--

-- --------------------------------------------------------

--
-- Table structure for table `productos`
--

CREATE TABLE `productos` (
  `id` bigint(20) NOT NULL,
  `categoria` varchar(255) NOT NULL,
  `fecha_creacion` date NOT NULL,
  `nombre_producto` varchar(255) NOT NULL,
  `peso` int(11) NOT NULL,
  `precio` int(11) NOT NULL,
  `referencia` varchar(255) NOT NULL,
  `stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `productos`
--

INSERT INTO `productos` (`id`, `categoria`, `fecha_creacion`, `nombre_producto`, `peso`, `precio`, `referencia`, `stock`) VALUES
(1, 'bebidas2', '2022-04-02', 'cafe', 100, 1000, 'bebidas', 9),
(2, 'fritos', '2022-04-02', 'empanadas', 200, 1500, '123', 42),
(3, 'bebidas', '2022-04-02', 'gaseosa', 350, 2000, '350ml', 89);

-- --------------------------------------------------------

--
-- Table structure for table `ventas`
--

CREATE TABLE `ventas` (
  `id_venta` bigint(20) NOT NULL,
  `cantidad_venta` int(11) NOT NULL,
  `fecha_venta` date NOT NULL,
  `fk_producto` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ventas`
--

INSERT INTO `ventas` (`id_venta`, `cantidad_venta`, `fecha_venta`, `fk_producto`) VALUES
(1, 2, '2022-04-02', 3),
(2, 1, '2022-04-02', 2),
(3, 1, '2022-04-02', 3),
(4, 1, '2022-04-02', 3),
(5, 1, '2022-04-02', 1),
(6, 1, '2022-04-02', 1),
(7, 1, '2022-04-02', 2),
(8, 1, '2022-04-02', 3),
(9, 1, '2022-04-02', 3),
(10, 1, '2022-04-02', 3),
(11, 1, '2022-04-02', 2),
(12, 1, '2022-04-02', 2),
(13, 1, '2022-04-02', 3),
(14, 1, '2022-04-02', 3),
(15, 1, '2022-04-02', 1),
(16, 1, '2022-04-02', 1),
(17, 1, '2022-04-02', 1),
(18, 1, '2022-04-02', 1),
(19, 1, '2022-04-02', 1),
(20, 1, '2022-04-02', 3),
(21, 1, '2022-04-02', 3),
(22, 1, '2022-04-02', 3),
(23, 1, '2022-04-02', 3),
(24, 1, '2022-04-02', 2),
(25, 1, '2022-04-02', 1),
(26, 1, '2022-04-02', 1),
(27, 1, '2022-04-02', 2),
(28, 1, '2022-04-02', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id_venta`),
  ADD KEY `FKd9lbhk3nnuuy0ok0pw9f1vsby` (`fk_producto`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `productos`
--
ALTER TABLE `productos`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id_venta` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `FKd9lbhk3nnuuy0ok0pw9f1vsby` FOREIGN KEY (`fk_producto`) REFERENCES `productos` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
