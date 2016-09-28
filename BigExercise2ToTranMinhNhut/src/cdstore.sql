-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 19, 2016 at 12:05 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cdstore`
--
CREATE DATABASE IF NOT EXISTS `cdstore` DEFAULT CHARACTER SET utf16 COLLATE utf16_general_ci;
USE `cdstore`;

-- --------------------------------------------------------

--
-- Table structure for table `cd`
--

CREATE TABLE IF NOT EXISTS `cd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) CHARACTER SET utf8 NOT NULL,
  `singer` varchar(150) CHARACTER SET utf8 NOT NULL,
  `numbersongs` int(11) NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf16 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `cd`
--

INSERT INTO `cd` (`id`, `name`, `singer`, `numbersongs`, `price`) VALUES
(1, 'in the end', 'linking park', 10, 400),
(2, 'the sound of silience', 'simon', 8, 300),
(3, 'phantom of the opera', 'nightwish', 12, 350),
(4, 'Tình ca', 'Phạm Duy', 8, 250);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
