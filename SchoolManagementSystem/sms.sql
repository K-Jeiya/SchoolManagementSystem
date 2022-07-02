-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 03, 2022 at 09:59 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sms`
--

-- --------------------------------------------------------

--
-- Table structure for table `classes`
--

CREATE TABLE `classes` (
  `Class` varchar(50) NOT NULL,
  `Teachername` varchar(50) NOT NULL,
  `Day` varchar(50) NOT NULL,
  `Timing` varchar(50) NOT NULL,
  `Subject` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `classes`
--

INSERT INTO `classes` (`Class`, `Teachername`, `Day`, `Timing`, `Subject`) VALUES
('1', 'Tasheen ', 'Tuesday', '8:00am - 9:00am', 'English'),
('1', 'Ammad', 'Tuesday', '9:00am - 9:30am', 'Science'),
('1', 'sibitain', 'Tuesday', '9:30am - 10:00am', 'Urdu'),
('1', 'Hassan', 'Tuesday', '10:00am - 10:30am', 'Computer'),
('1', 'Duaa', 'Tuesday', '10:30am - 11:15am', 'Math'),
('5', 'aliza', 'Friday', '8:00am - 8:45am', 'Science'),
('5', 'Muhammad', 'Friday', '8:45am - 9:15am', 'pakstudy'),
('5', 'Hassan', 'Friday', '9:15am - 9:45am', 'Computer');

-- --------------------------------------------------------

--
-- Table structure for table `courseassign`
--

CREATE TABLE `courseassign` (
  `TeacherId` varchar(50) NOT NULL,
  `Teachername` varchar(50) NOT NULL,
  `Coursesassign` varchar(50) NOT NULL,
  `Remainingslots` varchar(50) NOT NULL,
  `Totalassign` varchar(50) NOT NULL,
  `Cou1` varchar(50) NOT NULL,
  `Cou2` varchar(50) NOT NULL,
  `Cou3` varchar(50) NOT NULL,
  `Cou4` varchar(50) NOT NULL,
  `Cou5` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `courseassign`
--

INSERT INTO `courseassign` (`TeacherId`, `Teachername`, `Coursesassign`, `Remainingslots`, `Totalassign`, `Cou1`, `Cou2`, `Cou3`, `Cou4`, `Cou5`) VALUES
('6', 'Ammad', '3', '2', '5', 'English', 'Math', 'Science', '-', '-'),
('13', 'Hassan', '4', '1', '5', 'Computer', 'Urdu', 'English', 'Science', '-'),
('32', 'Jeiya', '4', '1', '5', 'English', 'Math', 'Urdu', 'English', '-'),
('4', 'Tasheen ', '2', '3', '5', 'Science', '-', 'English', '-', '-'),
('7', 'sibitain', '4', '1', '5', 'Science', 'Computer', 'English', 'Drawing', '-');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `CourseName` varchar(50) NOT NULL,
  `CourseCode` varchar(50) NOT NULL,
  `BookPrize` varchar(50) NOT NULL,
  `ForClass` varchar(50) NOT NULL,
  `Note` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`CourseName`, `CourseCode`, `BookPrize`, `ForClass`, `Note`) VALUES
('English', 'eng-101', '1000', '3', 'oxford'),
('Math', 'mat-102', '1200', '2', 'oxford US'),
('Science', 'Sic-103', '990', '4', 'OXFORD'),
('Computer', 'com-104', '1500', '4', 'oxford computing '),
('Urdu', 'urdu-105', '700', '6', 'Ghalib'),
('pakstudy', 'PAK-187', '678', '5', 'quaid-e-azam'),
('Drawing', 'DRAW-298', '56', '7', 'MAD'),
('islamiyat', 'ISLAM-987', '98', '5', 'islamic'),
('physics', 'PHY-103', '700', '6', 'techniques'),
('Chemistry', 'CHEM-107', '800', '5', 'Chemist'),
('Sindhi', 'SIN-165', '90', '7', 'Sindh'),
('Biology', 'BIO-183', '900', '9', 'science');

-- --------------------------------------------------------

--
-- Table structure for table `feesubmitrecord`
--

CREATE TABLE `feesubmitrecord` (
  `Date` varchar(50) NOT NULL,
  `StdId` int(50) NOT NULL,
  `StdName` varchar(60) NOT NULL,
  `StdFname` varchar(60) NOT NULL,
  `Class` varchar(60) NOT NULL,
  `Phone` int(100) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Convence` varchar(50) NOT NULL,
  `SchoolFee` varchar(50) NOT NULL,
  `BusFee` varchar(50) NOT NULL,
  `Paid/Unpaid` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feesubmitrecord`
--

INSERT INTO `feesubmitrecord` (`Date`, `StdId`, `StdName`, `StdFname`, `Class`, `Phone`, `Address`, `Convence`, `SchoolFee`, `BusFee`, `Paid/Unpaid`) VALUES
('June/29/2022', 13, 'Hassan', 'Saleem', '8', 75976888, '5/1367', 'Personal', '1800', '-', 'Paid'),
('June/29/2022', 4, 'Jeiya Kumari', 'Ramesh Kumar', '7', 8576, 'Sanghar', 'Bus', '1800', '800', 'Paid'),
('June/30/2022', 1, 'yash', 'raj', '10', 3456732, 'karachi', 'Personal', '2500', '-', 'Paid'),
('June/30/2022', 2, 'Owais', 'saeed', '9', 6799876, 'karachi', 'Bus', '2500', '1200', 'Unpaid'),
('June/30/2022', 3, 'maqsood', 'ahmad', '9', 4567892, 'sanghar', 'Personal', '2500', '1200', 'Paid');

-- --------------------------------------------------------

--
-- Table structure for table `studentdata`
--

CREATE TABLE `studentdata` (
  `Firstname` varchar(50) NOT NULL,
  `Lastname` varchar(50) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Phone` int(255) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Class` varchar(50) NOT NULL,
  `Id` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentdata`
--

INSERT INTO `studentdata` (`Firstname`, `Lastname`, `Gender`, `Phone`, `Address`, `Class`, `Id`) VALUES
('yash', 'raj', 'Male', 7532457, 'karachi', '10', 1),
('Owais', 'Saeed', 'Male', 123, 'SFC', '9', 2),
('maqsood', 'ahmad', 'Male', 782923, 'Maqsood@gmail.com', '8', 3),
('yousuf', 'ahmad', 'Male', 781238, 'sanghar', '8', 4),
('manesh', 'kumar', 'Male', 864533, 'sanghar', '10', 5),
('Hassan', 'Saleem', 'Male', 5646, '1367', '2', 12),
('Jeiya ', 'Kumari', 'Female', 334232, 'sanghar', '9', 53);

-- --------------------------------------------------------

--
-- Table structure for table `teacherdata`
--

CREATE TABLE `teacherdata` (
  `Firstname` varchar(30) NOT NULL,
  `Lastname` varchar(30) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Phone` int(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Degree` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacherdata`
--

INSERT INTO `teacherdata` (`Firstname`, `Lastname`, `Gender`, `Phone`, `Email`, `Degree`, `Address`, `Id`) VALUES
('Tasheen ', 'siddiqi', 'male', 334537, 'tahseen@gmail.com', 'BSCS', 'karachi', 4),
('sibitain', 'paatni', 'male', 674578, 'sibtain@gmail.com', 'BSCS', 'karachi', 7),
('Muhammad', 'Hannan', 'male', 98765432, 'hannan@gmail.com', 'BSCS', 'karachi', 8),
('Hassan', 'Saleem', 'male', 3244, 'hassan@gmail.com', 'BSCs', '1367', 13),
('Jeiya', 'Khatri', 'female', 33439440, 'jeiya@gmail.com', 'bscs', 'sanghar', 32),
('muhammad', 'ali', 'male', 5432189, 'ali@gmail.com', 'bscs', 'iudfnifm', 45),
('aliza', 'dahri', 'female', 875435, 'alizay@gmail.com', 'BS-ENG', 'sanghar', 87),
('jhdjh', 'hannan', 'male', 673993, 'jeita@gma.com', 'bscs', 'mdk', 444);

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

CREATE TABLE `user_login` (
  `id` int(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`id`, `username`, `password`) VALUES
(1, 'admin', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studentdata`
--
ALTER TABLE `studentdata`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `teacherdata`
--
ALTER TABLE `teacherdata`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Email` (`Email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
