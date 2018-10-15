package exercicios;

public class Emprestimo {
	private double salarioBruto;
	private double salarioLiquido;
	private double descontos;
	private double emprestimo;
	
	//criando os getters e setters
	
	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public double getDescontos() {
		return descontos;
	}

	public void setDescontos(double descontos) {
		this.descontos = descontos;
	}

	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	//criando os metodos
	
	public double descont() {
		return salarioLiquido = salarioBruto - descontos;
	}
	
	public double emprestimos() {
		return salarioLiquido * 30 / 100;
	}

}
