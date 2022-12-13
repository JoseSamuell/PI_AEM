-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 26-Nov-2022 às 00:36
-- Versão do servidor: 10.4.25-MariaDB
-- versão do PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `aem_db`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `idAluno` int(11) NOT NULL,
  `Nome` varchar(45) NOT NULL,
  `Data_Nascimento` varchar(45) NOT NULL,
  `Cpf` varchar(45) NOT NULL,
  `Endereco` varchar(50) DEFAULT NULL,
  `Email` varchar(45) NOT NULL,
  `Responsavel` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`idAluno`, `Nome`, `Data_Nascimento`, `Cpf`, `Endereco`, `Email`, `Responsavel`) VALUES
(1, 'teste', 'sadsad', '23343', 'edasdsd', 'AASD', 'SADD'),
(2, 'nbshvhwj', '1432517rteqa', '111111111', '', '', 'maria'),
(3, 'mariaa', '04/09/2003', '123456', '', '', 'adfag'),
(4, 'pedro', '23/5/97', '5423432', '', '', 'xs'),
(5, 'Joaoo da silva', '04/07/2002', '1234567', 'rua aghfs', '', 'maraiss'),
(6, 'fssdwyd', '25585', '5447', '44', 'dgqw', 'dhhyh');

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

CREATE TABLE `disciplina` (
  `idDisciplina` int(11) NOT NULL,
  `Serie` varchar(45) NOT NULL,
  `turno` varchar(45) DEFAULT NULL,
  `Turma` varchar(45) NOT NULL,
  `idProfessor` int(11) NOT NULL,
  `AlunoID` int(11) DEFAULT NULL,
  `escolaID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`idDisciplina`, `Serie`, `turno`, `Turma`, `idProfessor`, `AlunoID`, `escolaID`) VALUES
(2, '7', 'manha', 'a', 1, 1, 1),
(3, 'Português', 'Manha', '4', 1, 3, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `escola`
--

CREATE TABLE `escola` (
  `Inep` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Endereco` varchar(45) DEFAULT NULL,
  `Cnpj` varchar(45) NOT NULL,
  `AlunoId` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `escola`
--

INSERT INTO `escola` (`Inep`, `Nome`, `Endereco`, `Cnpj`, `AlunoId`) VALUES
(1, 'maria', 'praca', '5555', '1'),
(2, 'Josefa Adelina da Silva', 'Pindobinha', '1224536', '1'),
(3, 'ETE José Humberto de Moura Cavalcanti', 'rua Travessa', '674381223791', '2');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `idProfessor` int(11) NOT NULL,
  `Nome` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `Formacao` varchar(45) DEFAULT NULL,
  `Ch` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  `idaluno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`idProfessor`, `Nome`, `cpf`, `Formacao`, `Ch`, `email`, `endereco`, `idaluno`) VALUES
(1, 'asdsad', '21321', 'asd', '22', 'asdsa', 'asd', 1),
(2, 'Emerson', '458796587', 'Computação', '80', 'emerson@gmail', 'rua da alegria', 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`idAluno`);

--
-- Índices para tabela `disciplina`
--
ALTER TABLE `disciplina`
  ADD PRIMARY KEY (`idDisciplina`),
  ADD KEY `fk_idaluno` (`AlunoID`),
  ADD KEY `fk_escola` (`escolaID`),
  ADD KEY `fk_professor` (`idProfessor`);

--
-- Índices para tabela `escola`
--
ALTER TABLE `escola`
  ADD PRIMARY KEY (`Inep`);

--
-- Índices para tabela `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`idProfessor`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `aluno`
--
ALTER TABLE `aluno`
  MODIFY `idAluno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `disciplina`
--
ALTER TABLE `disciplina`
  MODIFY `idDisciplina` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `escola`
--
ALTER TABLE `escola`
  MODIFY `Inep` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `professor`
--
ALTER TABLE `professor`
  MODIFY `idProfessor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `disciplina`
--
ALTER TABLE `disciplina`
  ADD CONSTRAINT `fk_escola` FOREIGN KEY (`escolaID`) REFERENCES `escola` (`Inep`),
  ADD CONSTRAINT `fk_idaluno` FOREIGN KEY (`AlunoID`) REFERENCES `aluno` (`idAluno`),
  ADD CONSTRAINT `fk_professor` FOREIGN KEY (`idProfessor`) REFERENCES `professor` (`idProfessor`);

--
-- Limitadores para a tabela `escola`
--
ALTER TABLE `escola`
  ADD CONSTRAINT `Alunoid` FOREIGN KEY (`Inep`) REFERENCES `aluno` (`idAluno`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
