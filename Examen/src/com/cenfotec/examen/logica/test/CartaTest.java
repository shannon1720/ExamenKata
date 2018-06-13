package com.cenfotec.examen.logica.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.cenfotec.examen.logica.Carta;

public class CartaTest {
	Carta micarta = new Carta();

	@Test(expected = Exception.class)
	public void valorCarta() throws Exception {
		
		assertEquals("No es un valor valido.",micarta.crearCarta(11,"As","Escudos"));
	}
	
	@Test
public void nombreCarta() throws Exception {
		
		assertEquals(1,micarta.crearCarta(11,"As","Escudos"));
	}

}
