-- phpMyAdmin SQL Dump
-- version 3.5.8.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 13, 2014 at 08:45 PM
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
(1, 'Adenda', ' Elaboración presupuestaria del subsector administrativo de carácter limitativo (Estados financieros de Organismos autónomos, Personal, Inversiones y proyectos, Beneficios fiscales, Flujo documental y Memorias presupuestarias) '),
(2, 'ATENEA', 'Aplicación para la tramitación electrónica normalizada de expedientes de modificaciones presupuestarias de la Administración '),
(3, 'AUDInet', ' Sistema de información y seguimiento de las actuaciones del plan nacional de control financiero de la IGAE. '),
(4, 'BÁSICAL', 'Sistema de información contable para las Entidades locales a las que resulta de aplicación el modelo básico previsto en la correspondiente Instrucción de Contabilidad para la Administración local. '),
(5, 'BDNS', ' Base de datos nacional de subvenciones. '),
(6, 'BESTA', 'Sistema para la gestión de la Cuenta de la Administración General del Estado y su posterior remisión al Tribunal de Cuentas, de acuerdo con lo regulado en la Orden EHA/3067/2011 por la que se aprueba la Instrucción de Contabilidad para la Administración General del Estado. '),
(7, 'CANOA Centralizado', 'Sistema de Contabilidad Analítica Normalizada para Organizaciones Administrativas (Centros Gestores y Organismos de la Administración General del Estado). '),
(8, 'CANOA Descentralizado', 'Sistema de Contabilidad Analítica Normalizada para Organizaciones Administrativas (Universidades). '),
(9, 'CIBI', 'Central de Información del inventario general de bienes y derechos de la Administración General del Estado y OO.AA. '),
(10, 'CICEP.red', ' Sistema para remisión a la IGAE de las Cuentas anuales y demás información que las entidades del Sector público estatal de naturaleza empresarial y fundacional han de rendir al Tribunal de Cuentas, en virtud de la Ley 47/2003 General Presupuestaria, y de la Orden EHA/2043/2010, y para su posterior remisión por la IGAE al Tribunal de Cuentas, así como para la gestión de la información establecida en la Ley 4/2007 de Transparencia, según los modelos y procedimientos regulados en el RD 1759/2007 ');
