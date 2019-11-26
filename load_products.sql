--
-- Base de datos: `gondola`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos_distribuidora`
--

CREATE TABLE `productos_distribuidora` (
  `bar_code` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `lista` varchar(30) COLLATE latin1_spanish_ci NOT NULL,
  `product` varchar(100) COLLATE latin1_spanish_ci DEFAULT NULL,
  `briefing` varchar(300) COLLATE latin1_spanish_ci DEFAULT NULL,
  `precio` varchar(30) COLLATE latin1_spanish_ci DEFAULT NULL,
  `imagen` varchar(500) COLLATE latin1_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
--
-- Indices de la tabla `productos_distribuidora`
--
ALTER TABLE `productos_distribuidora`
  ADD PRIMARY KEY (`bar_code`,`lista`);
COMMIT;

