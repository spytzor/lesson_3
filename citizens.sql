-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2023 at 12:53 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `citizens`
--

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE `country` (
  `c_id` int(11) NOT NULL,
  `c_name` varchar(45) DEFAULT NULL,
  `capital` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `country`
--

INSERT INTO `country` (`c_id`, `c_name`, `capital`) VALUES
(1, 'Greece', 'Athens'),
(2, 'France', 'Paris'),
(3, 'Germany', 'Berlin'),
(4, 'Italy', 'Rome'),
(5, 'Spain', 'Madrid'),
(6, 'UK', 'London');

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `p_id` int(11) NOT NULL,
  `p_name` varchar(45) DEFAULT NULL,
  `c_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`p_id`, `p_name`, `c_id`) VALUES
(1, 'Nikos Papadopoulos', 1),
(2, 'Marco Rossi', 4),
(3, 'Jose Marquez', 5),
(4, 'Kostas Georgiadis', 1),
(5, 'Nikos Aggelakis', 1),
(6, 'Antonio Baggio', 4),
(7, 'Andre Bernard', 2),
(8, 'Javi Gonzalez', 5),
(9, 'Mario Muller', 3),
(10, 'Nico Mayer', 3),
(11, 'Ben Walker', 6),
(12, 'Paolo Tardelli', 4),
(13, 'Juan Pedro', 5),
(14, 'Periklis Kokkinos', 1),
(15, 'Aggelos Athanasiou', 1),
(16, 'Antonio Busquets', 5),
(17, 'Donald Cooper', 6),
(18, 'Tom Atkinson', 6),
(19, 'Wolf Schmidt', 3),
(20, 'Nico Neumann', 3),
(21, 'Peter Hamilton', 6),
(22, 'Demetrio Bissacco', 4),
(23, 'Juan Rodriguez', 5),
(24, 'Athanasios Anastasakis', 1),
(25, 'Mario Santi', 4),
(26, 'Antonio Peron', 4),
(27, 'Robert Dubois', 2),
(28, 'Leroy Petit', 2),
(29, 'Renard Durand', 2),
(30, 'Nico Meyer', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`c_id`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`p_id`),
  ADD KEY `c_id` (`c_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `person`
--
ALTER TABLE `person`
  ADD CONSTRAINT `person_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `country` (`c_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
