package exercicios;

public class SituacaoAluno2 {
	private float nota1;
	private float nota2;
	private float nota3;
	private float notafinal;
	
	//criando os getters e setters
	
	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public float getNotafinal() {
		return notafinal;
	}

	public void setNotafinal(float notafinal) {
		this.notafinal = notafinal;
	}

	//criando metodo
	
	public float media() {
		return (nota1 + nota2 + nota3) / 3;
	}
	public float media2() {
		return (nota1 + nota2 + nota3 + notafinal) / 4;
	}

}
