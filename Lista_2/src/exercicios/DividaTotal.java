package exercicios;

public class DividaTotal {
	private float valorInicial;
	private float quantMeses;
	private float jurosMensais;
	
	//criando os getters e setters
	
	public float getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(float valorInicial) {
		this.valorInicial = valorInicial;
	}
	public float getQuantMeses() {
		return quantMeses;
	}
	public void setQuantMeses(float quantMeses) {
		this.quantMeses = quantMeses;
	}
	public float getJurosMensais() {
		return jurosMensais;
	}
	public void setJurosMensais(float jurosMensais) {
		this.jurosMensais = jurosMensais;
	}
	
	public float divda() {
		return  valorInicial * (1 + (quantMeses * (jurosMensais / 100) ) );
	}

}
