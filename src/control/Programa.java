package control;

import model.Carro;
import model.Moto;

public class Programa {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Civic", "Honda");
		Moto moto = new Moto("125cc", "cb1000");
		
	
		System.out.println(carro.acelerar());
		System.out.println(moto.acelerar());
	}

}
