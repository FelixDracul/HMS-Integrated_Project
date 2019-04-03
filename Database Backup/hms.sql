-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 03, 2019 at 05:22 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hms`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointments`
--

CREATE TABLE `appointments` (
  `appID` varchar(5) NOT NULL,
  `patientID` varchar(5) NOT NULL,
  `DocID` varchar(5) NOT NULL,
  `billID` varchar(7) NOT NULL,
  `date` varchar(10) NOT NULL,
  `time` varchar(5) NOT NULL,
  `queueNum` int(11) NOT NULL,
  `symptoms` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointments`
--

INSERT INTO `appointments` (`appID`, `patientID`, `DocID`, `billID`, `date`, `time`, `queueNum`, `symptoms`) VALUES
('a0001', 'p0001', 'd0001', 'b000001', '2018-12-4', '13.45', 0, 'Cough');

-- --------------------------------------------------------

--
-- Table structure for table `doctors`
--

CREATE TABLE `doctors` (
  `DocID` varchar(5) NOT NULL,
  `FName` varchar(30) NOT NULL,
  `LName` varchar(40) NOT NULL,
  `Specialization` varchar(40) NOT NULL,
  `DocFee` double NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `DoB` varchar(10) NOT NULL,
  `ContactNum` int(11) NOT NULL,
  `StartDate` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctors`
--

INSERT INTO `doctors` (`DocID`, `FName`, `LName`, `Specialization`, `DocFee`, `Gender`, `DoB`, `ContactNum`, `StartDate`) VALUES
('d0001', 'Gihan', 'Weerabandu', 'General Physician', 500, 'm', '1986-06-02', 713456379, '2013-04-23'),
('d0002', 'Ruwanthi', 'Ranaweera', 'Gynocologist', 600, 'f', '1986-04-07', 774568267, '2015-08-01');

-- --------------------------------------------------------

--
-- Table structure for table `medicine_in`
--

CREATE TABLE `medicine_in` (
  `Code` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Dosage` varchar(15) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Unit_price` double NOT NULL,
  `Brand` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pastmedi`
--

CREATE TABLE `pastmedi` (
  `mID` int(11) NOT NULL,
  `AppID` varchar(14) NOT NULL,
  `medicineN` varchar(30) NOT NULL,
  `Dosage_(mg)` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patients`
--

CREATE TABLE `patients` (
  `patID` varchar(7) NOT NULL,
  `pFName` varchar(50) NOT NULL,
  `pLName` varchar(60) NOT NULL,
  `pDoB` varchar(10) NOT NULL,
  `pContactNum` int(11) NOT NULL,
  `pAddress` varchar(100) NOT NULL,
  `pGender` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patients`
--

INSERT INTO `patients` (`patID`, `pFName`, `pLName`, `pDoB`, `pContactNum`, `pAddress`, `pGender`) VALUES
('p0001', 'John', 'Doe', '1990-10-12', 771234567, '123, ABC', 'm');

-- --------------------------------------------------------

--
-- Table structure for table `pharmacists`
--

CREATE TABLE `pharmacists` (
  `PharmID` varchar(5) NOT NULL,
  `FName` varchar(30) NOT NULL,
  `LName` varchar(40) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `DoB` varchar(10) NOT NULL,
  `ContactNum` int(11) NOT NULL,
  `StartDate` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `receptionists`
--

CREATE TABLE `receptionists` (
  `RecId` varchar(5) NOT NULL,
  `FName` varchar(30) NOT NULL,
  `LName` varchar(40) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `DoB` varchar(10) NOT NULL,
  `ContactNum` int(11) NOT NULL,
  `StartDate` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `type` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`, `type`) VALUES
('kamal', '123', 'r'),
('rasitha', 'qwe', 'd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointments`
--
ALTER TABLE `appointments`
  ADD PRIMARY KEY (`appID`);

--
-- Indexes for table `doctors`
--
ALTER TABLE `doctors`
  ADD PRIMARY KEY (`DocID`);

--
-- Indexes for table `medicine_in`
--
ALTER TABLE `medicine_in`
  ADD PRIMARY KEY (`Code`);

--
-- Indexes for table `pastmedi`
--
ALTER TABLE `pastmedi`
  ADD PRIMARY KEY (`mID`);

--
-- Indexes for table `patients`
--
ALTER TABLE `patients`
  ADD PRIMARY KEY (`patID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pastmedi`
--
ALTER TABLE `pastmedi`
  MODIFY `mID` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
