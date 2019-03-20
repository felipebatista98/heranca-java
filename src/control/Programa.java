package control;

import model.CarroVoador;
import model.Moto;

public class Programa {

	public static void main(String[] args) {
		
		//Carro carro = new Carro(); classe abstrata
	    CarroVoador carro = new CarroVoador();
	    Moto moto = new Moto();
		
		System.out.println(carro.acelerar());
		System.out.println(moto.acelerar());
	}
}
