package exercicios;

public class Comissao {
	private double valorConsumo;
	private double comissao = 0.10;
	
	//criando os getters e setters
	
	public double getValorConsumo() {
		return valorConsumo;
	}
	public void setValorConsumo(double valorConsumo) {
		this.valorConsumo = valorConsumo;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	//criar metodo
	
	public double percent() {
		return comissao * valorConsumo;
	}
	
	public double total() {
		return (comissao * valorConsumo) + valorConsumo;
	}
	

}
