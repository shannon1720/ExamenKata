package com.cenfotec.examen.logica;

public class Carta {
	private String nombre;
	private String palo;
	private int valor;

	public int crearCarta(int valor, String nombre, String palo) throws Exception {
		int numero = 0;

		validarValorCarta(valor);

		numero = validarnombre(nombre, numero);

		numero = validarPalo(palo, numero);

		return numero;
	}

	private int validarPalo(String palo, int numero) throws Exception {
		
		String nombresPalo[]= {"Escudos","Flores","Estrellas","Gotas"};
		
		for(int i=0;i<nombresPalo.length;i++) {
		if (nombresPalo[i]==palo) {

			numero = 1;

		} 
		}
		return numero;
	}

	private int validarnombre(String nombre, int numero) {
		
		String nombreCarta[]= {"AS","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Jota","Quina","Ka"};
		for(int i=0;i<nombreCarta.length;i++) {
		if (nombreCarta[i]==nombre ) {

			numero = 1;
		}}
		return numero;
	}
		

	private void validarValorCarta(int valor) throws Exception {
		if (valor < 1 || valor > 10) {

			throw new Exception("No es un valor valido.");

		}
	}

}
