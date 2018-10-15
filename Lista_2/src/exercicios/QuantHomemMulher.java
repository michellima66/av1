package exercicios;

public class QuantHomemMulher {
	private float quantH;
	private float quantM;
	
	//criando os getters e setters
	
	public float getQuantH() {
		return quantH;
	}
	public void setQuantH(float quantH) {
		this.quantH = quantH;
	}
	public float getQuantM() {
		return quantM;
	}
	public void setQuantM(float quantM) {
		this.quantM = quantM;
	}
	
	//criando o metodo
	
	public float percentH() {
		return quantH / (quantH + quantM) * 100;
	}
	
	public float percentM() {
		return quantM / (quantH + quantM) * 100;
	}
	
}
