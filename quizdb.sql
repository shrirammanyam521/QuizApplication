-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 07, 2016 at 07:38 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quizdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `subject` varchar(25) NOT NULL,
  `qname` varchar(512) NOT NULL,
  `option1` varchar(512) NOT NULL,
  `option2` varchar(512) NOT NULL,
  `option3` varchar(512) NOT NULL,
  `option4` varchar(512) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`subject`, `qname`, `option1`, `option2`, `option3`, `option4`) VALUES
('C', 'Q 1?- What is the output of the following code snippet?', 'Compile  Error', 'Hi', 'Hello Hi ', 'Compile Warning'),
('C', 'Q 2?- What is the output of the following program?', 'No Output', 'Error as a Function Not Called', 'Error, as a function defined without declaration', 'Error , as main() function is left empty'),
('C', 'Q 3?- Identify the incorrect file opening mode from the following.', 'r', 'w', 'x', 'a'),
('C', 'Q 4?- Which of the following is used in mode string to open the file in binary mode?', 'a', 'b', 'B', 'bin'),
('C', 'Q 5?- What is the output of the following statement?', '0', '1', 'fasle', 'TRUE'),
('C', 'Q 6?- How to round-off a value ?5.77? to 6.0?', 'ceil(5.77)', 'round-off(5.77)', 'round-up(5.77)', 'floor(5.77)'),
('C', 'Q 7?- In the given below code, if a?short int?value is 5 byte long, then how many times the?while?loop will get executed?', 'unlimited times', '0 times', '300 times', '5 times'),
('C', 'Q 8?- Choose the correct statement that is a combination of these two statements,', 'No Output', 'w', 'x', 'a'),
('C', 'Q 9?- Which files will get closed through the?fclose()?in the following program?', 'r', 'b', 'B', 'bin'),
('C', 'Q 10?- Which statement can print \\n on the screen?', 'a', '2', 'fasle', 'TRUE');

-- --------------------------------------------------------

--
-- Table structure for table `subject_thumbnails`
--

CREATE TABLE `subject_thumbnails` (
  `image_id` int(10) NOT NULL,
  `image_url` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `subject_thumbnails`
--

INSERT INTO `subject_thumbnails` (`image_id`, `image_url`) VALUES
(1, 'http://10.0.2.2/quizapplication/images/cobol.png'),
(2, 'http://10.0.2.2/quizapplication/images/cplusplus.png'),
(3, 'http://10.0.2.2/quizapplication/images/Cprogramming.png'),
(4, 'http://10.0.2.2/quizapplication/images/csharp.png'),
(5, 'http://10.0.2.2/quizapplication/images/java.png'),
(6, 'http://10.0.2.2/quizapplication/images/javascript.png'),
(7, 'http://10.0.2.2/quizapplication/images/objc.png'),
(8, 'http://10.0.2.2/quizapplication/images/perllogo.png'),
(9, 'http://10.0.2.2/quizapplication/images/php.png'),
(10, 'http://10.0.2.2/quizapplication/images/python.png'),
(11, 'http://10.0.2.2/quizapplication/images/ruby.png'),
(12, 'http://10.0.2.2/quizapplication/images/sql.png'),
(13, 'http://10.0.2.2/quizapplication/images/swift.png');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users`
--

CREATE TABLE `tbl_users` (
  `uid` bigint(6) NOT NULL,
  `fname` varchar(25) NOT NULL,
  `mname` varchar(25) NOT NULL,
  `lname` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `pass_key` varchar(255) NOT NULL,
  `iv` varchar(255) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `mno` varchar(10) NOT NULL,
  `status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_users`
--

INSERT INTO `tbl_users` (`uid`, `fname`, `mname`, `lname`, `email`, `password`, `pass_key`, `iv`, `gender`, `mno`, `status`) VALUES
(23, 'Sudheer', 'Naga', 'Doguparthi', 'dnsudhir@gmail.com', '¬·ÜÀ´%0ÎÈð’[êÞg)Å0ò‹£u7S', 'e10adc3949ba59abbe56e057f20f883e', 'ÞüpOÜ\nl“‡ÑaÇÙÔtfœ×k[4xRãÞ', 'Male', '8099269432', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `subject_thumbnails`
--
ALTER TABLE `subject_thumbnails`
  ADD PRIMARY KEY (`image_id`);

--
-- Indexes for table `tbl_users`
--
ALTER TABLE `tbl_users`
  ADD PRIMARY KEY (`email`),
  ADD UNIQUE KEY `uid` (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `subject_thumbnails`
--
ALTER TABLE `subject_thumbnails`
  MODIFY `image_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `uid` bigint(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
