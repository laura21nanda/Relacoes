package Relacoes.agregacao;

public class Carro {

	private String modelo;
	private Motor motor; //Agregação
	
	public Carro(String modelo, Motor motor) {
		this.modelo = modelo;
		this.motor = motor;
	}
	public void setModelo(String modelo) {
		this.modelo= modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
}
