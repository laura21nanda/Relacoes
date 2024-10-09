package Relacoes.agregacao;

public class Principal2 {

	public static void main(String[] args) {
 
		Empresa empresa = new Empresa("ex");
		
		Depatamento departamneto = new Departamento("Dep1");
		
		System.out.println("Empresa: " + empresa.getNome() + "Depatamento: " + departamneto.getNome());
		
		
	}

}
