package com.cenfotec.examen.logica;

import java.util.Random;

public class Naipe {
	
	
	
private Carta misCartas[];
private int siguienteCarta;
private Random numerosAleatorios;


public  int CantidadNaipe=52;



public Carta[] getMisCartas() {
	return misCartas;
}





public void setMisCartas(Carta[] misCartas) {
	this.misCartas = misCartas;
}





public  int getCantidadnaipe() {
	return CantidadNaipe;
}


public void setCantidadNaipe(int cantidadNaipe) {
	CantidadNaipe = cantidadNaipe;
}





public  Naipe() {
	final String[] PALO = { "Escudos", "Flores", "Estrellas", "Gotas" };
	final int[] LimiteValor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	 final String NombreCarta[] = { "AS", "Dos", "Tres", 
											"Cuatro", "Cinco", "Seis",
											"Siete", "Ocho", "Nueve", 
											"Diez","Jota","Quina", "Ka" };
//	String []palos=Carta.PALO;
//	String []nombre=Carta.NombreCarta;
	int [] valor=Carta.LimiteValor;
	misCartas = new Carta[CantidadNaipe];
	numerosAleatorios = new Random();
	int j=9;
	for(int i=0;i<misCartas.length;i++) {
	 if(j==0) {
		 j=9;
	 }else { misCartas[i] = new Carta( valor[j--],NombreCarta[i % 13],PALO[i/13]);
		}}
	}
	
	



public int crearNaipe()
{   
	
	
for ( int i = 0; i < misCartas.length; i++ ) {

int segunda = numerosAleatorios.nextInt(CantidadNaipe);

Carta temp = misCartas[i];

misCartas[i] = misCartas[segunda];
misCartas[segunda] = temp;

}  

return verificarMaso();
}





private int verificarMaso() {
	for(int j=0 ;j<misCartas.length;j++) {
		if(misCartas[j]!=null) {
			
			return misCartas.length;
		}
	}
	
	return 52;
}




 


}


