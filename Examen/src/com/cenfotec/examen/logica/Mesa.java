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

	public boolean agregarjugador(String[] nuevo) throws Exception {

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
		}else {
			throw new Exception("too many parameters");
			
		}

//		return false;
	}

	public int iniciarMesa() {

		return this.cantJugadores;
	}

	public boolean empezarAJugar21() {
		boolean valido = true;
		for (int i = 0; i <  elRepartidor.getElnaipe().CantidadNaipe; i++) {

			if (losjugadores.get(0).getMano().size() !=2 &&
					   losjugadores.get(1).getMano().size() !=2 && 
					   losjugadores.get(2).getMano().size() !=2 &&
					   losjugadores.get(3).getMano().size() !=2) {
				losjugadores.get(0).obtenerCarta(elRepartidor.darCarta());
				losjugadores.get(1).obtenerCarta(elRepartidor.darCarta());
				losjugadores.get(2).obtenerCarta(elRepartidor.darCarta());
				losjugadores.get(3).obtenerCarta(elRepartidor.darCarta());
			}
		}

		valido = validarEmpezar21();

		return valido;
	}

	private boolean validarEmpezar21() {
		if (losjugadores.get(0).getMano().size() == 2 && 
			losjugadores.get(1).getMano().size() == 2 && 
			losjugadores.get(2).getMano().size() == 2 && 
			losjugadores.get(3).getMano().size() == 2) {
			return true;}
		return false;
	}

	public String[] gana21() {
		
		int [] valorMayor=contarValores();
		String ganador[]=new String[valorMayor.length];
		int i=0;
for(int j=0;j<losjugadores.size();j++) {
	if(valorMayor[i]==losjugadores.get(j).getValorTotalCartas()) {
		ganador[i] =losjugadores.get(j).getNombre();
		i++;
	}}
    return ganador;
	}

	private int[] contarValores() {
    int []manos=lengthManos();
    int j1=0,j2=0,j3=0,j4=0;

		for(int i=0;i<manos[0];i++) {
			j1+=losjugadores.get(0).getMano().get(i).getValor();			
		}
		losjugadores.get(0).setValorTotalCartas(j1);
		for(int j=0;j<manos[1];j++) {
			j2+=losjugadores.get(1).getMano().get(j).getValor();
		}
		losjugadores.get(1).setValorTotalCartas(j2);
		for(int y=0;y<manos[2];y++) {
			j3+=losjugadores.get(2).getMano().get(y).getValor();	
		}
		losjugadores.get(2).setValorTotalCartas(j3);
		for(int x=0;x<manos[3];x++) {
			j4+=losjugadores.get(3).getMano().get(x).getValor();		
		}
		losjugadores.get(3).setValorTotalCartas(j4);
		int []valoresdelasmanos= {j1,j2,j3,j4};
		
		
		
		int [] jugadoresGanaron = indices(valoresdelasmanos, 0);
		return jugadoresGanaron;
		
		
	}

	private int[] indices(int[] valoresdelasmanos, int jugadoresGanaron) {
		int indicesjugadores[]=new int[jugadoresGanaron];
		for(int v=0;v<valoresdelasmanos.length;v++){
			
			if(valoresdelasmanos[v]==21||valoresdelasmanos[v]>=21||
					valoresdelasmanos[1]==21||valoresdelasmanos[1]>=21||
					valoresdelasmanos[2]==21||valoresdelasmanos[2]>=21||
					valoresdelasmanos[2]==21||valoresdelasmanos[2]>=21) {
				 jugadoresGanaron+=1;
			}
				
		}
		for(int x=0;x<valoresdelasmanos.length;x++){
			if(valoresdelasmanos[x]==21||valoresdelasmanos[x]>=21) {
		 indicesjugadores=new int[jugadoresGanaron];
		 indicesjugadores[x]=valoresdelasmanos[x];
		}}
		return indicesjugadores;
	}

	private int[] lengthManos() {

		int[] todasManos = {losjugadores.get(0).getMano().size(),
							losjugadores.get(1).getMano().size(),
							losjugadores.get(2).getMano().size(), 
							losjugadores.get(3).getMano().size()};

		return todasManos;
	}
	
	public boolean empezarPartidaRon() {
		
		for (int i = 0; i < elRepartidor.getElnaipe().CantidadNaipe; i++) {

			if (losjugadores.get(0).getMano().size() !=7 &&
					   losjugadores.get(1).getMano().size() !=7 && 
					   losjugadores.get(2).getMano().size() !=7 &&
					   losjugadores.get(3).getMano().size() !=7) {
				losjugadores.get(0).obtenerCarta(elRepartidor.darCarta());
				losjugadores.get(1).obtenerCarta(elRepartidor.darCarta());
				losjugadores.get(2).obtenerCarta(elRepartidor.darCarta());
				losjugadores.get(3).obtenerCarta(elRepartidor.darCarta());
				
				
			}}
		
		
		if(losjugadores.get(0).getMano().size() ==7 &&
		   losjugadores.get(1).getMano().size() ==7 && 
		   losjugadores.get(2).getMano().size() ==7 &&
		   losjugadores.get(3).getMano().size() ==7) {
			
			return true;
			
			
		}
		return false;
	}
	
	
	
	
	
	
	public boolean reset() {
		
		elRepartidor = new Repartidor();
		this.cantJugadores = 0;
		losjugadores = new ArrayList<>();
		
		
		
		return true;
	}

}


