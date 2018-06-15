package com.cenfotec.examen.logica.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.examen.logica.Naipe;

public class NaipeTest {

	
	Naipe mibaraja= new Naipe();
	
	
	
	
	
	@Test
	public void creabaraja() {
	
		
		assertEquals(52,mibaraja.crearNaipe());
		
	}

}
