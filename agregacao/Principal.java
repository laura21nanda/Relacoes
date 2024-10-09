package Relacoes.agregacao;

public class Principal {

	public static void main(String[] args) {

		Motor motor = new Motor("v8");
		Carro carro = new Carro("Mustang", motor);
		
		System.out.println("Carro é: " + carro.getModelo() + "\nMotor: " + motor.getTipo());
	}

}
