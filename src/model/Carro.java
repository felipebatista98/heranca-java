package model;

public abstract class Carro implements Veiculo{

    public String acelerar() {
        
        return "Acelerando o veiculo";
	}
    
    public abstract String frear();
    
}
