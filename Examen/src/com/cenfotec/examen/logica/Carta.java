package com.cenfotec.examen.logica;

import org.junit.Assert;

public class Carta extends Assert {
	private String nombre;
	private String palo;
	private int valor;
	public static final String[] PALO = { "Escudos", "Flores", "Estrellas", "Gotas" };
	public static final int[] LimiteValor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	public static final String NombreCarta[] = { "AS", "Dos", "Tres", 
											"Cuatro", "Cinco", "Seis",
											"Siete", "Ocho", "Nueve", 
											"Diez","Jota","Quina", "Ka" };
	
	
	
	
	public Carta(int valor, String palo, String nombre) {
		super();
		this.nombre = nombre;
		this.palo = palo;
		this.valor = valor;
	}

	
	public Carta() {
		super();
	
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPalo1() {
		return palo;
	}


	public void setPalo(String palo) {
		this.palo = palo;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public static String[] getPalo() {
		return PALO;
	}


	public static int[] getLimitevalor() {
		return LimiteValor;
	}


	public static String[] getNombrecarta() {
		return NombreCarta;
	}


	public int crearCarta(int valor, String nombre, String palo) throws Exception {
		int numero = 0;

		validarValorCarta(valor);
		numero = validarnombre(nombre, numero);
		numero = validarPalo(palo, numero);

		return numero;
	}

	private int validarPalo(String palo, int numero) throws Exception {

		for (int i = 0; i < PALO.length; i++) {
			if (PALO[i] == palo) {
				numero = 1;
			}
		}
		return numero;
	}

	private int validarnombre(String nombre, int numero) {
		for (int i = 0; i < NombreCarta.length; i++) {
			if (NombreCarta[i] == nombre) {
				numero = 1;
			}
		}
		return numero;
	}

	private void validarValorCarta(int valor) throws Exception {
		if (valor < 1 || valor > 10) {
			throw new Exception("No es un valor valido.");
		}
	}
	
	
	
	 @Override
	    public boolean equals(Object carta) {
	        // Verifica que el objeto no este nulo.
	        if (carta == null) {
	            return false;
	        }
	 
	        // Verifica que el tipo de objeto es igual al objeto carta.
	        if (getClass() != carta.getClass()) {
	            return false;
	        }
	 
	        //Valida si el valor es el mismo 
	        final Carta other = (Carta) carta;
	        if (this.valor != other.valor) {
	            return false;
	        }
	 
	        return true;
	    }



}
