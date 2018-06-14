package com.cenfotec.examen.logica;

import java.util.ArrayList;

public class Jugador {

private String nombre;
private ArrayList<Carta> mano;

public Jugador() {
	
	mano=new ArrayList<>();
	
	
	
}
	
	public boolean crearJugador(String nuevoNombre) {
		
		
		
		return true;
	}
	
	public boolean obtenerCarta(Carta nueva) {
		
		mano.add(nueva);
		return true;
	}
}
