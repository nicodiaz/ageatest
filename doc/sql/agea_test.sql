-- phpMyAdmin SQL Dump
-- version 3.5.8.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 12, 2014 at 08:42 PM
-- Server version: 5.5.32-log
-- PHP Version: 5.4.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `agea_test`
--

-- --------------------------------------------------------

--
-- Table structure for table `T_SISTEMA`
--

CREATE TABLE IF NOT EXISTS `T_SISTEMA` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `descripcion` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

--
-- Dumping data for table `T_SISTEMA`
--

INSERT INTO `T_SISTEMA` (`id`, `nombre`, `descripcion`) VALUES
(1, 'Add', 'Adds an object to the end of the List<T>.'),
(2, 'AddRange', 'Adds the elements of the specified collection to the end of the List<T>.'),
(3, 'AsReadOnly', 'Returns a read-only IList<T> wrapper for the current collection.'),
(4, 'BinarySearch(T)', 'Searches the entire sorted List<T> for an element using the default comparer and returns the zero-based index of the element. '),
(5, 'BinarySearch(T, IComparer<T>)', 'Searches the entire sorted List<T> for an element using the specified comparer and returns the zero-based index of the element. '),
(6, 'BinarySearch(Int32, Int32, T, IComparer<T>)', 'Searches a range of elements in the sorted List<T> for an element using the specified comparer and returns the zero-based index of the element. '),
(7, 'Clear', 'Removes all elements from the List<T>. '),
(8, 'Contains', 'Determines whether an element is in the List<T>. ');
