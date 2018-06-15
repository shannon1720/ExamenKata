package com.cenfotec.examen.logica;

import java.util.ArrayList;

public class Mesa {

private int cantJugadores;
private ArrayList<Jugador>losjugadores;
private Repartidor elRepartidor;
public Mesa() {
	elRepartidor=new Repartidor();
	this.cantJugadores=0;
	losjugadores=new ArrayList<>();
	
}
	
	public boolean agregarjugador(String [] nuevo) {
		for(int i=0;i<nuevo.length;i++) {
		if(cantJugadores!=4 && nuevo.length==4) {
			
			Jugador miJugador=new Jugador(nuevo[i]);
			losjugadores.add(miJugador);
			cantJugadores++;
			return true;}
		}
		
		return false;
	}
	
	
}
