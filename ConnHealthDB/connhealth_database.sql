-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 18, 2019 at 12:05 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `connhealth database`
--

-- --------------------------------------------------------

--
-- Table structure for table `angajati`
--

CREATE TABLE `angajati` (
  `ID` int(11) NOT NULL,
  `nume` varchar(40) NOT NULL,
  `data_nastere` date NOT NULL,
  `adresa_fizica` varchar(70) NOT NULL,
  `telefon` varchar(20) NOT NULL,
  `adresa_mail` varchar(40) NOT NULL,
  `nr_contract` int(11) NOT NULL,
  `tip_angajat` int(40) NOT NULL,
  `salariu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `angajati_tipmedic_specializarimedicale_competentemedicale`
--

CREATE TABLE `angajati_tipmedic_specializarimedicale_competentemedicale` (
  `ID` int(11) NOT NULL,
  `AngajatID` int(11) NOT NULL,
  `tip_medic` int(11) NOT NULL,
  `specializareMedicalaID` int(11) NOT NULL,
  `competenteMedicaleID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `angajat_tipasistent_tipspecializareasistent`
--

CREATE TABLE `angajat_tipasistent_tipspecializareasistent` (
  `ID` int(11) NOT NULL,
  `ID_AST` int(11) NOT NULL,
  `ID_SPC` int(11) NOT NULL,
  `AngajatID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `competente_medicale`
--

CREATE TABLE `competente_medicale` (
  `ID` int(11) NOT NULL,
  `nume` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `competente_medicale`
--

INSERT INTO `competente_medicale` (`ID`, `nume`) VALUES
(1, 'anestezie-terapie intensiva'),
(8, 'aparate gipsate'),
(10, 'competente generale'),
(16, 'computer tomograf'),
(5, 'diabet si dietetica'),
(13, 'dializa pediatrica'),
(3, 'explorari functionale'),
(18, 'igiena alimentara'),
(6, 'instrumentara (sala de operatie)'),
(7, 'medicina muncii din intreprinderi'),
(14, 'medicina nucleara'),
(11, 'neonatologie'),
(12, 'planificare familiala'),
(17, 'radiologie dentara'),
(15, 'rezonanta magnetica nucleara'),
(9, 'stomaterapie'),
(4, 'terapie toxicomani'),
(2, 'urgente medico-chirurgicale');

-- --------------------------------------------------------

--
-- Table structure for table `contract`
--

CREATE TABLE `contract` (
  `ID` int(11) NOT NULL,
  `tipContractID` int(11) NOT NULL,
  `dataSemnare` date NOT NULL,
  `dataExpirare` date NOT NULL,
  `numeParte1` varchar(70) NOT NULL,
  `numePart2` varchar(70) NOT NULL,
  `specificatii` varchar(10000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `istoric_parcare`
--

CREATE TABLE `istoric_parcare` (
  `ID` int(11) NOT NULL,
  `masinaID` int(11) NOT NULL,
  `timpStationat` int(11) NOT NULL,
  `taxa` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `istoric_programari`
--

CREATE TABLE `istoric_programari` (
  `ID` int(11) NOT NULL,
  `pacientID` int(11) NOT NULL,
  `serviciuID` int(11) NOT NULL,
  `data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `judete`
--

CREATE TABLE `judete` (
  `ID` int(11) NOT NULL,
  `denumire` varchar(30) NOT NULL,
  `prescurtare` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `masini`
--

CREATE TABLE `masini` (
  `ID` int(11) NOT NULL,
  `judetID` int(11) NOT NULL,
  `cod` varchar(10) NOT NULL,
  `numar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `masters`
--

CREATE TABLE `masters` (
  `username` varchar(34) NOT NULL,
  `code` varchar(34) NOT NULL,
  `style` varchar(30) NOT NULL DEFAULT 'DEFAULT'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `masters`
--

INSERT INTO `masters` (`username`, `code`, `style`) VALUES
('MateiAndrei', 'Avenger01', 'DEFAULT'),
('WackoBeast61', 'WackoBeast60', 'DEFAULT');

-- --------------------------------------------------------

--
-- Table structure for table `pacienti`
--

CREATE TABLE `pacienti` (
  `ID` int(11) NOT NULL,
  `nume` varchar(30) NOT NULL,
  `adresa_fizica` varchar(70) NOT NULL,
  `telefon` varchar(20) NOT NULL,
  `adresa_mail` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `programare_angajatmedical`
--

CREATE TABLE `programare_angajatmedical` (
  `ID` int(11) NOT NULL,
  `programareID` int(11) NOT NULL,
  `angajatID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `programari`
--

CREATE TABLE `programari` (
  `ID` int(11) NOT NULL,
  `pacientID` int(11) NOT NULL,
  `serviciuID` int(11) NOT NULL,
  `data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `servicii_medicale`
--

CREATE TABLE `servicii_medicale` (
  `ID` int(11) NOT NULL,
  `nume` varchar(60) NOT NULL,
  `pret` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `specializari_medicale`
--

CREATE TABLE `specializari_medicale` (
  `ID` int(11) NOT NULL,
  `nume` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `specializari_medicale`
--

INSERT INTO `specializari_medicale` (`ID`, `nume`) VALUES
(14, 'Anatomie patologica'),
(7, 'Asistenta comunitara'),
(6, 'Circulatie extracorporeala, renala si cardiovasculara'),
(10, 'Fiziokinetoterapie'),
(3, 'Geriatrie si gerontologie '),
(15, 'Igiena si sanatate publica'),
(13, 'Laborator clinic'),
(18, 'Laborator farmaceutic'),
(8, 'Medicina generala'),
(12, 'Nutritie si dietetica'),
(1, 'Obstetrica-ginecologie'),
(21, 'Ortoptica'),
(2, 'Pediatrie'),
(19, 'Protetica dentara'),
(20, 'Protezare oculara'),
(5, 'Psihiatrie'),
(9, 'Puericultura'),
(16, 'Radioimunodozari'),
(17, 'Radioterapie'),
(11, 'Recuperare medicala (masaj)');

-- --------------------------------------------------------

--
-- Table structure for table `stoc`
--

CREATE TABLE `stoc` (
  `ID` int(11) NOT NULL,
  `nume` int(11) NOT NULL,
  `cantitate` int(11) NOT NULL,
  `unitateMasuraID` int(11) NOT NULL,
  `pret` double NOT NULL,
  `contractID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tipuri_medici`
--

CREATE TABLE `tipuri_medici` (
  `ID` int(11) NOT NULL,
  `nume` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipuri_medici`
--

INSERT INTO `tipuri_medici` (`ID`, `nume`) VALUES
(21, 'Doctor in stiinte medicale'),
(20, 'Medic primar dermato-venerologie'),
(26, 'Medic primar geriatrie-gerontologie'),
(23, 'Medic primar medicina de familie'),
(14, 'Medic primar medicina sportiva'),
(17, 'Medic primar obstetrica-ginecologie'),
(11, 'Medic primar recuperare medicala'),
(2, 'Medic specialist alergologie si imunologie clinica'),
(19, 'Medic specialist cardiologie'),
(22, 'Medic specialist diabet-nutritie'),
(24, 'Medic specialist endocrinologie'),
(25, 'Medic Specialist gastroenterologie'),
(27, 'Medic specialist medicina de familie'),
(28, 'Medic specialist medicina interna'),
(29, 'Medic specialist medicina muncii'),
(30, 'Medic specialist neorologie'),
(18, 'Medic specialist obstetrica-ginecologie'),
(4, 'Medic specialist oftalmologie'),
(3, 'Medic specialist oncologie'),
(5, 'Medic specialist ORL'),
(6, 'Medic specialist ortopedie'),
(7, 'Medic specialist pediatrie'),
(8, 'Medic specialist psihiatrie'),
(9, 'Medic specialist psihiatrie pediatrica'),
(12, 'Medic specialist recuperare medicala'),
(15, 'Medic specialist reumatologie'),
(16, 'Medic specialist urologie'),
(13, 'Medicina fizica si balneologie'),
(10, 'Psiholog');

-- --------------------------------------------------------

--
-- Table structure for table `tipuri_specialitati_asistenti`
--

CREATE TABLE `tipuri_specialitati_asistenti` (
  `ID` int(11) NOT NULL,
  `nume` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipuri_specialitati_asistenti`
--

INSERT INTO `tipuri_specialitati_asistenti` (`ID`, `nume`) VALUES
(4, 'Asistent medical de balneofizioterapie'),
(6, 'Asistent medical de comunitate'),
(9, 'Asistent medical de farmacie'),
(5, 'Asistent medical de igiena si sanatate publica'),
(7, 'Asistent medical de laborator'),
(11, 'Asistent medical de nutritie si dietetica'),
(2, 'Asistent medical de obstetrica-ginecologie'),
(3, 'Asistent medical de pediatrie'),
(8, 'Asistent medical de radiologie'),
(1, 'Asistent medical generalist'),
(10, 'Asistent medico-social'),
(14, 'Tehnician de aparatura medicala'),
(13, 'Tehnician de optica medicala'),
(12, 'Tehnician dentar');

-- --------------------------------------------------------

--
-- Table structure for table `tip_angajat`
--

CREATE TABLE `tip_angajat` (
  `ID` int(11) NOT NULL,
  `nume` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tip_angajat`
--

INSERT INTO `tip_angajat` (`ID`, `nume`) VALUES
(1, 'DOCTOR'),
(2, 'ASISTENT'),
(3, 'RELATII_CLIENTI'),
(4, 'ADMINISTRATOR');

-- --------------------------------------------------------

--
-- Table structure for table `tip_contract`
--

CREATE TABLE `tip_contract` (
  `ID` int(11) NOT NULL,
  `nume` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `unitati_masura`
--

CREATE TABLE `unitati_masura` (
  `ID` int(11) NOT NULL,
  `denumire` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `angajati`
--
ALTER TABLE `angajati`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `tip_angajat` (`tip_angajat`),
  ADD KEY `nr_contract` (`nr_contract`);

--
-- Indexes for table `angajati_tipmedic_specializarimedicale_competentemedicale`
--
ALTER TABLE `angajati_tipmedic_specializarimedicale_competentemedicale`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `competenteMedicaleID` (`competenteMedicaleID`,`specializareMedicalaID`,`AngajatID`),
  ADD KEY `specializareMedicalaID` (`specializareMedicalaID`),
  ADD KEY `AngajatID` (`AngajatID`),
  ADD KEY `tip_medic` (`tip_medic`);

--
-- Indexes for table `angajat_tipasistent_tipspecializareasistent`
--
ALTER TABLE `angajat_tipasistent_tipspecializareasistent`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_AST` (`ID_AST`,`ID_SPC`),
  ADD KEY `ID_SPC` (`ID_SPC`),
  ADD KEY `AngajatID` (`AngajatID`);

--
-- Indexes for table `competente_medicale`
--
ALTER TABLE `competente_medicale`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `nume` (`nume`);

--
-- Indexes for table `contract`
--
ALTER TABLE `contract`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `tipContractID` (`tipContractID`);

--
-- Indexes for table `istoric_parcare`
--
ALTER TABLE `istoric_parcare`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `masinaID` (`masinaID`);

--
-- Indexes for table `istoric_programari`
--
ALTER TABLE `istoric_programari`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `pacientID` (`pacientID`),
  ADD KEY `serviciuID` (`serviciuID`);

--
-- Indexes for table `judete`
--
ALTER TABLE `judete`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `masini`
--
ALTER TABLE `masini`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `judetID` (`judetID`);

--
-- Indexes for table `masters`
--
ALTER TABLE `masters`
  ADD PRIMARY KEY (`username`,`code`),
  ADD UNIQUE KEY `username` (`username`,`code`);

--
-- Indexes for table `pacienti`
--
ALTER TABLE `pacienti`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `programare_angajatmedical`
--
ALTER TABLE `programare_angajatmedical`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `angajatID` (`angajatID`),
  ADD KEY `programareID` (`programareID`) USING BTREE,
  ADD KEY `programareID_2` (`programareID`);

--
-- Indexes for table `programari`
--
ALTER TABLE `programari`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `pacientID` (`pacientID`),
  ADD KEY `serviciuID` (`serviciuID`);

--
-- Indexes for table `servicii_medicale`
--
ALTER TABLE `servicii_medicale`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `specializari_medicale`
--
ALTER TABLE `specializari_medicale`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `nume` (`nume`),
  ADD UNIQUE KEY `nume_2` (`nume`);

--
-- Indexes for table `stoc`
--
ALTER TABLE `stoc`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `nume` (`nume`),
  ADD KEY `unitateMasuraID` (`unitateMasuraID`),
  ADD KEY `contractID` (`contractID`);

--
-- Indexes for table `tipuri_medici`
--
ALTER TABLE `tipuri_medici`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `nume` (`nume`);

--
-- Indexes for table `tipuri_specialitati_asistenti`
--
ALTER TABLE `tipuri_specialitati_asistenti`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `nume` (`nume`);

--
-- Indexes for table `tip_angajat`
--
ALTER TABLE `tip_angajat`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tip_contract`
--
ALTER TABLE `tip_contract`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID` (`ID`);

--
-- Indexes for table `unitati_masura`
--
ALTER TABLE `unitati_masura`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `angajati`
--
ALTER TABLE `angajati`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `angajati_tipmedic_specializarimedicale_competentemedicale`
--
ALTER TABLE `angajati_tipmedic_specializarimedicale_competentemedicale`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `angajat_tipasistent_tipspecializareasistent`
--
ALTER TABLE `angajat_tipasistent_tipspecializareasistent`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `competente_medicale`
--
ALTER TABLE `competente_medicale`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `contract`
--
ALTER TABLE `contract`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `istoric_parcare`
--
ALTER TABLE `istoric_parcare`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `istoric_programari`
--
ALTER TABLE `istoric_programari`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `judete`
--
ALTER TABLE `judete`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `masini`
--
ALTER TABLE `masini`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pacienti`
--
ALTER TABLE `pacienti`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `programare_angajatmedical`
--
ALTER TABLE `programare_angajatmedical`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `programari`
--
ALTER TABLE `programari`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `servicii_medicale`
--
ALTER TABLE `servicii_medicale`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `specializari_medicale`
--
ALTER TABLE `specializari_medicale`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `stoc`
--
ALTER TABLE `stoc`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tipuri_medici`
--
ALTER TABLE `tipuri_medici`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `tipuri_specialitati_asistenti`
--
ALTER TABLE `tipuri_specialitati_asistenti`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `tip_angajat`
--
ALTER TABLE `tip_angajat`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tip_contract`
--
ALTER TABLE `tip_contract`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `unitati_masura`
--
ALTER TABLE `unitati_masura`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `angajati`
--
ALTER TABLE `angajati`
  ADD CONSTRAINT `angajati_ibfk_1` FOREIGN KEY (`tip_angajat`) REFERENCES `tip_angajat` (`ID`),
  ADD CONSTRAINT `angajati_ibfk_2` FOREIGN KEY (`nr_contract`) REFERENCES `contract` (`ID`);

--
-- Constraints for table `angajati_tipmedic_specializarimedicale_competentemedicale`
--
ALTER TABLE `angajati_tipmedic_specializarimedicale_competentemedicale`
  ADD CONSTRAINT `angajati_tipmedic_specializarimedicale_competentemedicale_ibfk_1` FOREIGN KEY (`specializareMedicalaID`) REFERENCES `specializari_medicale` (`ID`),
  ADD CONSTRAINT `angajati_tipmedic_specializarimedicale_competentemedicale_ibfk_2` FOREIGN KEY (`competenteMedicaleID`) REFERENCES `competente_medicale` (`ID`),
  ADD CONSTRAINT `angajati_tipmedic_specializarimedicale_competentemedicale_ibfk_3` FOREIGN KEY (`AngajatID`) REFERENCES `angajati` (`ID`),
  ADD CONSTRAINT `angajati_tipmedic_specializarimedicale_competentemedicale_ibfk_4` FOREIGN KEY (`tip_medic`) REFERENCES `tipuri_medici` (`ID`);

--
-- Constraints for table `angajat_tipasistent_tipspecializareasistent`
--
ALTER TABLE `angajat_tipasistent_tipspecializareasistent`
  ADD CONSTRAINT `angajat_tipasistent_tipspecializareasistent_ibfk_1` FOREIGN KEY (`ID_SPC`) REFERENCES `specializari_medicale` (`ID`),
  ADD CONSTRAINT `angajat_tipasistent_tipspecializareasistent_ibfk_2` FOREIGN KEY (`ID_AST`) REFERENCES `tipuri_specialitati_asistenti` (`ID`),
  ADD CONSTRAINT `angajat_tipasistent_tipspecializareasistent_ibfk_3` FOREIGN KEY (`AngajatID`) REFERENCES `angajati` (`ID`);

--
-- Constraints for table `contract`
--
ALTER TABLE `contract`
  ADD CONSTRAINT `contract_ibfk_1` FOREIGN KEY (`tipContractID`) REFERENCES `tip_contract` (`ID`);

--
-- Constraints for table `istoric_parcare`
--
ALTER TABLE `istoric_parcare`
  ADD CONSTRAINT `istoric_parcare_ibfk_1` FOREIGN KEY (`masinaID`) REFERENCES `masini` (`ID`);

--
-- Constraints for table `istoric_programari`
--
ALTER TABLE `istoric_programari`
  ADD CONSTRAINT `istoric_programari_ibfk_1` FOREIGN KEY (`pacientID`) REFERENCES `pacienti` (`ID`),
  ADD CONSTRAINT `istoric_programari_ibfk_2` FOREIGN KEY (`serviciuID`) REFERENCES `servicii_medicale` (`ID`);

--
-- Constraints for table `masini`
--
ALTER TABLE `masini`
  ADD CONSTRAINT `masini_ibfk_1` FOREIGN KEY (`judetID`) REFERENCES `judete` (`ID`);

--
-- Constraints for table `programare_angajatmedical`
--
ALTER TABLE `programare_angajatmedical`
  ADD CONSTRAINT `programare_angajatmedical_ibfk_1` FOREIGN KEY (`angajatID`) REFERENCES `angajati` (`ID`),
  ADD CONSTRAINT `programare_angajatmedical_ibfk_2` FOREIGN KEY (`programareID`) REFERENCES `istoric_programari` (`ID`);

--
-- Constraints for table `programari`
--
ALTER TABLE `programari`
  ADD CONSTRAINT `programari_ibfk_1` FOREIGN KEY (`pacientID`) REFERENCES `pacienti` (`ID`),
  ADD CONSTRAINT `programari_ibfk_2` FOREIGN KEY (`serviciuID`) REFERENCES `servicii_medicale` (`ID`);

--
-- Constraints for table `stoc`
--
ALTER TABLE `stoc`
  ADD CONSTRAINT `stoc_ibfk_1` FOREIGN KEY (`contractID`) REFERENCES `contract` (`ID`),
  ADD CONSTRAINT `stoc_ibfk_2` FOREIGN KEY (`unitateMasuraID`) REFERENCES `unitati_masura` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
