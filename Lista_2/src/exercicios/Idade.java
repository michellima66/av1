package exercicios;

public class Idade {
	private int anoNascimento;
	private int anoAtual;
	
	//criacao do getters e setters
	
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getAnoAtual() {
		return anoAtual;
	}
	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	
	public int idade(){
		return anoAtual - anoNascimento;
	}
	
}
