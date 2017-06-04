-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 04-Jun-2017 às 17:29
-- Versão do servidor: 5.7.14
-- PHP Version: 7.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trabalho_poo2`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `empresas`
--

CREATE TABLE `empresas` (
  `idEmpresa` int(11) NOT NULL,
  `nomeEmpresa` varchar(100) NOT NULL,
  `cnpjEmpresa` varchar(14) NOT NULL,
  `telEmpresa` varchar(10) NOT NULL,
  `logradouroEmpresa` varchar(30) NOT NULL,
  `bairroEmpresa` varchar(20) NOT NULL,
  `numeroLogradouroEmpresa` int(11) NOT NULL,
  `complementoEmpresa` varchar(10) NOT NULL,
  `cidadeEmpresa` varchar(20) NOT NULL,
  `estadoEmpresa` varchar(2) NOT NULL,
  `usuarioEmpresa` varchar(20) NOT NULL,
  `senhaEmpresa` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `idProduto` int(11) NOT NULL,
  `idEmpresa` int(11) NOT NULL,
  `nomeProduto` varchar(20) NOT NULL,
  `categoriaProduto` varchar(20) NOT NULL,
  `valorProduto` float NOT NULL,
  `estoqueProduto` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `relatorio`
--

CREATE TABLE `relatorio` (
  `idRelatorio` int(11) NOT NULL,
  `idProduto` int(11) NOT NULL,
  `idEmpresaCompra` int(11) NOT NULL,
  `idEmpresaVenda` int(11) NOT NULL,
  `qtdProduto` int(11) NOT NULL,
  `valorTotal` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `empresas`
--
ALTER TABLE `empresas`
  ADD PRIMARY KEY (`idEmpresa`);

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`idProduto`),
  ADD KEY `idEmpresa` (`idEmpresa`);

--
-- Indexes for table `relatorio`
--
ALTER TABLE `relatorio`
  ADD PRIMARY KEY (`idRelatorio`),
  ADD KEY `idProduto` (`idProduto`),
  ADD KEY `idEmpresaCompra` (`idEmpresaCompra`),
  ADD KEY `idEmpresaVenda` (`idEmpresaVenda`),
  ADD KEY `idEmpresaCompra_2` (`idEmpresaCompra`),
  ADD KEY `idProduto_2` (`idProduto`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `empresas`
--
ALTER TABLE `empresas`
  MODIFY `idEmpresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
  MODIFY `idProduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `relatorio`
--
ALTER TABLE `relatorio`
  MODIFY `idRelatorio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
