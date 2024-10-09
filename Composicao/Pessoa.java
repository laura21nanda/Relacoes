package Relacoes.Composicao;

public class Pessoa {

	private String nome;
	private Coracao coracao;
	
	public Pessoa(String nome, int coracao) {
		this.nome = nome;
		this.coracao = new Coracao(coracao);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCoracao() {
		return coracao.getBatimento(){
		}
	}
}
