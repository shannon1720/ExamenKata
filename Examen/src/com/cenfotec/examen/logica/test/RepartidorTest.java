package com.cenfotec.examen.logica.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.examen.logica.Repartidor;

public class RepartidorTest {

	
	Repartidor mirepartidor=new Repartidor();
	@Test
	public void verificarDarCarta() {
		
		mirepartidor.darCarta();
		
		assertEquals(51,mirepartidor.getElnaipe().getCantidadnaipe());
		
		
	}

}
