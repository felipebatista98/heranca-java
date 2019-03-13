package model;

public class Veiculo {

	private String modelo, marca;
	


	public Veiculo(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}




	public String acelerar() {
		return "acelerando veiculo";
		
	}
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
	
}
