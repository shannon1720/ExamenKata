package com.cenfotec.examen.logica;

public class Carta {
private String nombre;
private String palo;
private int valor;


public int crearCarta(int valor,String nombre,String palo) throws Exception {
	int numero=0;
	
	if(valor <1 || valor>10 ) {	
	
		throw new Exception("No es un valor valido.");
		
	}
	
	if(nombre=="AS"||nombre=="Dos"||nombre=="Tres"||nombre=="Cuatro"||nombre=="Cinco"||nombre=="Seis"||nombre=="Siete"||nombre=="Ocho"||nombre=="Nueve"||nombre=="Jota"||nombre=="Quina"||nombre=="Ka") {
		
		numero=1;
	}
	
if(palo=="Escudos"|| palo=="Flores"||palo=="Estrellas"||palo=="Gotas") {
	
	numero=1;
	
}else {
	
	throw new Exception("No es un valor valido.");
}


	return numero;
}

}
