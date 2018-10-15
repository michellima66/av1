package exercicios;

public class Funcionario {
	private float salario;
	private float salarioMinimo;
	
	//criacao dos getters e setters
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(float salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	
	public float quantSalarioMinimo(){
		return salario/salarioMinimo;
	}
	
}
