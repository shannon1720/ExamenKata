package com.cenfotec.examen.logica;

import java.util.ArrayList;

public class Jugador {

private String nombre;
private ArrayList<Carta> mano;

public Jugador() {
	
	mano=new ArrayList<>();
	
	
	
}
	
	public Jugador(String string) {
	this.nombre=string;
	mano=new ArrayList<>();
}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Carta> getMano() {
		return mano;
	}

	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}

	public boolean crearJugador(String nuevoNombre) {
		
		
		
		return true;
	}
	
	public boolean obtenerCarta(Carta nueva) {
		
		mano.add(nueva);
		return true;
	}
}
