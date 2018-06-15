package com.cenfotec.examen.logica;

public class Repartidor {
private Naipe elnaipe=new Naipe();
private int cartaActual;

public Repartidor() {
	this.cartaActual=0;
	elnaipe.crearNaipe();
}
	



	public Naipe getElnaipe() {
	return elnaipe;
}




public void setElnaipe(Naipe elnaipe) {
	this.elnaipe = elnaipe;
}




public int getCartaActual() {
	return cartaActual;
}




public void setCartaActual(int cartaActual) {
	this.cartaActual = cartaActual;
}




	public Carta darCarta() {
	
		int cantCartas=elnaipe.getCantidadnaipe();
		if (cartaActual < elnaipe.getMisCartas().length) {
			cantCartas--;
			elnaipe.setCantidadNaipe(cantCartas);
			 return elnaipe.getMisCartas()[cartaActual++];
	}
		 return null;	
	
	
}
	

}
