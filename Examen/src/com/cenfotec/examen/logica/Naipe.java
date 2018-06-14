package com.cenfotec.examen.logica;

public class Naipe {
	
	
	
private Carta misCartas[];
private int siguienteCarta;



public static final int CantidadNaipe=52;


public Naipe() {
	super();
	this.misCartas = new Carta[CantidadNaipe];
	this.siguienteCarta =0;
}

public boolean crearNaipe() {
	
	String []palos=Carta.PALO;
	int [] valor=Carta.LimiteValor;
	
	for(int i=0;i<misCartas.length;i++) {
	 misCartas[i] = new Carta( valor[i],Carta.NombreCarta[i % 13], palos[i/13]); 
		
	}
	
	
	for(int j=0;j<52;j++) {
	if(misCartas[j]==null) {
	return true;
	}
	}
return false;
};
}




