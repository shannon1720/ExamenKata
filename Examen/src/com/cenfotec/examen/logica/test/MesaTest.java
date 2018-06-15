package com.cenfotec.examen.logica.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cenfotec.examen.logica.Jugador;
import com.cenfotec.examen.logica.Mesa;

class MesaTest {

	
	Mesa mimesa =new Mesa();
	
	
	@Test
	public void iniciarMesa() {
		
		assertEquals(0,mimesa.iniciarMesa());
	}
	
	@Test
	public void addJugadorError() {
			
		
	String []nombres= {"Daniela ","Paula ","Steven ","Daniel","Giordano"};
		
	assertFalse(mimesa.agregarjugador(nombres));
		
	}

	
	@Test
	public void addJugadorBueno() {
			
		
	String []nombres= {"Daniela ","Paula ","Steven ","Daniel"};
		
	assertTrue(mimesa.agregarjugador(nombres));
		
	}
	
	
}
