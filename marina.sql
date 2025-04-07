-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2022 at 02:34 PM
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
-- Database: `marina`
--

-- --------------------------------------------------------

--
-- Table structure for table `boats`
--

CREATE TABLE `boats` (
  `bid` int(11) NOT NULL,
  `bname` varchar(32) DEFAULT NULL,
  `color` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `boats`
--

INSERT INTO `boats` (`bid`, `bname`, `color`) VALUES
(101, 'Interlake', 'blue'),
(102, 'Interlake', 'red'),
(103, 'Clipper', 'green'),
(104, 'Marine', 'red');

-- --------------------------------------------------------

--
-- Table structure for table `reserves`
--

CREATE TABLE `reserves` (
  `sid` int(11) NOT NULL,
  `bid` int(11) NOT NULL,
  `day` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reserves`
--

INSERT INTO `reserves` (`sid`, `bid`, `day`) VALUES
(22, 101, '1998-10-10 00:00:00'),
(22, 102, '1998-10-10 00:00:00'),
(22, 103, '1998-10-08 00:00:00'),
(22, 104, '1998-10-07 00:00:00'),
(31, 102, '1998-11-10 00:00:00'),
(31, 103, '1998-11-06 00:00:00'),
(31, 104, '1998-11-12 00:00:00'),
(64, 101, '1998-09-05 00:00:00'),
(64, 102, '1998-09-08 00:00:00'),
(74, 103, '1998-09-08 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `sailors`
--

CREATE TABLE `sailors` (
  `sid` int(11) NOT NULL,
  `sname` varchar(32) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL,
  `age` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sailors`
--

INSERT INTO `sailors` (`sid`, `sname`, `rating`, `age`) VALUES
(22, 'Dustin', 7, 45),
(29, 'Brutus', 1, 33),
(31, 'Lubber', 8, 55.5),
(32, 'Andy', 8, 25.5),
(58, 'Rusty', 10, 35),
(64, 'Horatio', 7, 35),
(71, 'Zorba', 10, 16),
(74, 'Horatio', 9, 40),
(85, 'Art', 3, 25.5),
(95, 'Bob', 3, 63.5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `boats`
--
ALTER TABLE `boats`
  ADD PRIMARY KEY (`bid`);

--
-- Indexes for table `reserves`
--
ALTER TABLE `reserves`
  ADD PRIMARY KEY (`sid`,`bid`,`day`),
  ADD KEY `bid` (`bid`);

--
-- Indexes for table `sailors`
--
ALTER TABLE `sailors`
  ADD PRIMARY KEY (`sid`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reserves`
--
ALTER TABLE `reserves`
  ADD CONSTRAINT `reserves_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `sailors` (`sid`),
  ADD CONSTRAINT `reserves_ibfk_2` FOREIGN KEY (`bid`) REFERENCES `boats` (`bid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
