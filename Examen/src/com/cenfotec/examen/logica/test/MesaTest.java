package com.cenfotec.examen.logica.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;
import org.junit.jupiter.api.Test;

import com.cenfotec.examen.logica.Mesa;

class MesaTest {

	
	Mesa mimesa =new Mesa();
	
	
	@Test
	public void iniciarMesa() {
		
		assertEquals(0,mimesa.iniciarMesa());
	}
	
	@Test
	public void addJugadorError() throws Exception {
			
		
	String []nombres= {"Daniela ","Paula ","Steven ","Daniel","Giordano"};
		
	assertTrue(mimesa.agregarjugador(nombres));
		
	}

	
	@Test
	public void addJugadorBueno() throws Exception {
			
		
	String []nombres= {"Daniela ","Paula ","Steven ","Daniel"};
		
	assertTrue(mimesa.agregarjugador(nombres));
		
	}
	

	@Test
	public void contarJugadores() throws Exception {				
	String []nombres= {"Daniela","Paula ","Steven ","Daniel"};
	mimesa.agregarjugador(nombres);
	assertEquals(4,mimesa.getLosjugadores().size());
		
	}
	
	
	@Test
	public void verificaEmpezarAJugar21() throws Exception {
		String []nombres= {"Daniela","Paula ","Steven ","Daniel"};
		mimesa.agregarjugador(nombres);
	assertTrue(mimesa.empezarAJugar21());	
		
		
	}
	
	@Test
	public void ganador21() throws Exception {
		String []nombres= {"Daniel","Paula ","Daniela ","Steven"};
		mimesa.agregarjugador(nombres);
		System.out.print(mimesa.gana21());
		assertEquals("Steven",mimesa.gana21());
		
	}
	
	
	@Test	
	public void testEmpezarPartidaRon() throws Exception {
		String []nombres= {"Daniel","Paula ","Daniela ","Steven"};
		mimesa.agregarjugador(nombres);
	
	assertTrue(mimesa.empezarPartidaRon());	
		
		
	}
	
	
	
	@Test
	public void resetearmesa() {		
		assertTrue(mimesa.reset());
	}
	
	
	
	
	
}
