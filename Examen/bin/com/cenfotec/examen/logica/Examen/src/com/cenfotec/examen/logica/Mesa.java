package com.cenfotec.examen.logica;

import java.util.ArrayList;

public class Mesa {

	private int cantJugadores;
	private ArrayList<Jugador> losjugadores;
	private Repartidor elRepartidor;

	public Mesa() {
		elRepartidor = new Repartidor();
		this.cantJugadores = 0;
		losjugadores = new ArrayList<>();

	}

	public int getCantJugadores() {
		return cantJugadores;
	}

	public void setCantJugadores(int cantJugadores) {
		this.cantJugadores = cantJugadores;
	}

	public ArrayList<Jugador> getLosjugadores() {
		return losjugadores;
	}

	public void setLosjugadores(ArrayList<Jugador> losjugadores) {
		this.losjugadores = losjugadores;
	}

	public Repartidor getElRepartidor() {
		return elRepartidor;
	}

	public void setElRepartidor(Repartidor elRepartidor) {
		this.elRepartidor = elRepartidor;
	}

	public boolean agregarjugador(String[] nuevo) {

		if (nuevo.length == 4) {

			Jugador miJugador = new Jugador(nuevo[0]);
			losjugadores.add(miJugador);
			Jugador miJugador1 = new Jugador(nuevo[1]);
			losjugadores.add(miJugador1);
			Jugador miJugador2 = new Jugador(nuevo[2]);
			losjugadores.add(miJugador2);
			Jugador miJugador3 = new Jugador(nuevo[3]);
			losjugadores.add(miJugador3);

			return true;
		}

		return false;
	}

	public int iniciarMesa() {

		return this.cantJugadores;
	}

	public boolean empezarAJugar21() {
		boolean valido=true;
		for (int i = 0; i < losjugadores.size(); i++) {

			if (losjugadores.get(i).getMano().size() != 2) {
				losjugadores.get(i).obtenerCarta(elRepartidor.darCarta());
			} 
			}
			
		

		 valido=validarEmpezar21();
		
		return  valido;
	}

	private boolean validarEmpezar21() {
		if(losjugadores.get(0).getMano().size()==2 &&
		    losjugadores.get(1).getMano().size()==2&&
		    losjugadores.get(2).getMano().size()==2&&
		    losjugadores.get(3).getMano().size()==2) {
				 return false;}
		return true;
	}

}
