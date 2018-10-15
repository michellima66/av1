package teste;

import java.util.Scanner;

import exercicios.AreaCirculo;
import exercicios.Comissao;
import exercicios.DividaTotal;
import exercicios.Eleitor;
import exercicios.Emprestimo;
import exercicios.Funcionario;
import exercicios.Idade;
import exercicios.Media;
import exercicios.QuantHomemMulher;
import exercicios.SituacaoAluno;
import exercicios.SituacaoAluno2;
import exercicios.VerificaIdade;

public class Teste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma opcao: ");
		System.out.println("questao 1 ");
		System.out.println("questao 2 ");
		System.out.println("questao 3 ");
		System.out.println("questao 4 ");
		System.out.println("questao 5 ");
		System.out.println("questao 6 ");
		System.out.println("questao 7 ");
		System.out.println("questao 8 ");
		System.out.println("questao 9 ");
		System.out.println("questao 10 ");
		System.out.println("questao 11 ");
		System.out.println("questao 12 ");
		//System.out.println("questao 13 ");
		//System.out.println("questao 14 ");
		//System.out.println("questao 15 ");
		
		int opc;
		opc = teclado.nextInt();
		
		switch(opc){
		case 1:
			Idade id = new Idade();
			System.out.println("Informe o ano de nascimento:");
			id.setAnoNascimento(teclado.nextInt());
			System.out.println("Informe o ano atual:");
			id.setAnoAtual(teclado.nextInt());
			System.out.println("A idade do aluno eh: " + id.idade());
			teclado.close();
			break;
			
		case 2:
			Funcionario f1 = new Funcionario();
			System.out.println("Informe o salario do funcionario:");
			f1.setSalario(teclado.nextFloat());
			System.out.println("Informe o salario minimo:");
			f1.setSalarioMinimo(teclado.nextFloat());
			System.out.println("A quant de salarios minimos eh: " + f1.quantSalarioMinimo());
			teclado.close();
			break;
		
		case 3:
			QuantHomemMulher percent = new QuantHomemMulher();
			System.out.println("Informe a quantdade  de alunos homens:");
			percent.setQuantH(teclado.nextFloat());
			System.out.println("Informe a quantdade  de alunas mulheres:");
			percent.setQuantM(teclado.nextFloat());
			System.out.println("O percentual de homens eh: " + percent.percentH());
			System.out.println("O percentual de mulheres eh: " + percent.percentM());
			teclado.close();
			break;
		
		case 4:
			Media med = new Media();
			System.out.println("Informe a primera nota  do aluno:");
			med.setNota1(teclado.nextFloat());
			System.out.println("Informe a primera nota  do aluno:");
			med.setNota2(teclado.nextFloat());
			System.out.println("Informe a primera nota  do aluno:");
			med.setNota3(teclado.nextFloat());
			System.out.println("Informe a primera nota  do aluno:");
			med.setNota4(teclado.nextFloat());
			System.out.println("A media aritimetica do aluno eh: " + med.media());
			teclado.close();
			break;
			
		case 5:
			DividaTotal dvTotal = new DividaTotal();
			System.out.println("Informe o valor inicial:");
			dvTotal.setValorInicial(teclado.nextFloat());
			System.out.println("Informe a quantidade de meses:");
			dvTotal.setQuantMeses(teclado.nextFloat());
			System.out.println("Informe a taxa de juros:");
			dvTotal.setJurosMensais(teclado.nextFloat());
			System.out.println("O valor final da divida eh: " + dvTotal.divda());
			teclado.close();
			break;
			
		case 6:
			AreaCirculo area = new AreaCirculo();
			System.out.println("O raio mede " + area.getRaio());
			area.area();
			System.out.println("A area do circolo eh: " + area.getArea());
			break;
			
		case 7:
			Comissao garcon = new Comissao();
			System.out.println("Informe o valor da despesa do cliente:");
			garcon.setValorConsumo(teclado.nextFloat());
			System.out.println("O percentual do garcon eh: " + garcon.percent() +  " reais:");
			System.out.println("O valor tatal da despesa eh " + garcon.total() + " reais:");
			teclado.close();
			break;
			
		case 8:
			VerificaIdade idade = new VerificaIdade();
			System.out.println("Informe a idade do usuario:");
			idade.setIdade(teclado.nextInt());
			if(idade.getIdade() >= 18) {
				System.out.println("O usuario eh de maior! " + idade.getIdade() + " anos.");
			}else
				if(idade.getIdade() < 18) {
					System.out.println("O usuario eh de menor! " + idade.getIdade() + " anos.");
				}
			teclado.close();
			break;
			
		case 9:
			Emprestimo cliente = new Emprestimo();
			System.out.println("Informe o salario bruto do cliente:");
			cliente.setSalarioBruto(teclado.nextDouble());
			System.out.println("Informe os descontos do cliente:");
			cliente.setDescontos(teclado.nextDouble());
			System.out.println("Informe o emprestimo que o cliente deseja adquirir:");
			cliente.setEmprestimo(teclado.nextDouble());
			if(cliente.getEmprestimo() > cliente.emprestimos()) {
				System.out.println("O cliente nao podera fazer o emprestimo!");
			}
			if(cliente.getEmprestimo() <= cliente.emprestimos()) {
					System.out.println("O cliente podera fazer o emprestimo!");
			}
			System.out.println("O valor do Salario Bruto: " + cliente.getSalarioBruto());
			System.out.println("O valor dos Descontos:" + cliente.getDescontos());
			System.out.println("O valor do Salario Liquido:" + cliente.descont());
			System.out.println("O valor  que o cliente quer de Emprestimo:" + cliente.getEmprestimo());
			System.out.println("O valor permitido:" + cliente.emprestimos());
			teclado.close();
			break;
			
		case 10:
			Eleitor e1 = new Eleitor();
			System.out.println("Informe a idade do eletor:");
			e1.setIdade(teclado.nextInt());
			if(e1.getIdade() < 16) {
				System.out.println("O menor nao pode vota! ");	
				}else
					if((e1.getIdade() >= 16) && (e1.getIdade() <= 64)){
						System.out.println("O eleitor eh obrigado a votar! ");
					}else						
						if(e1.getIdade() > 65) {
							System.out.println("O voto eh facultativo! ");
							teclado.close();
						}		
			break;
			
		case 11:
			SituacaoAluno aluno = new SituacaoAluno();
			System.out.println("Informe as tres notas do aluno:");
			aluno.setNota1(teclado.nextFloat());
			aluno.setNota2(teclado.nextFloat());
			aluno.setNota3(teclado.nextFloat());
			if(aluno.media() >=7.0) {
				System.out.println("Aluno aprovado! " + aluno.media());
			}else
				if(aluno.media() >=5.0) {
					System.out.println("Aluno esta de recuperacao! " +aluno.media() );
				}else
					if(aluno.media() <5.0) {
						System.out.println("Aluno reprovado! " + aluno.media());
					}
			teclado.close();
			break;
			
		case 12:
			SituacaoAluno2 aluno2 = new SituacaoAluno2();
			System.out.println("Informe as tres notas do aluno:");
			aluno2.setNota1(teclado.nextFloat());
			aluno2.setNota2(teclado.nextFloat());
			aluno2.setNota3(teclado.nextFloat());
			if(aluno2.media() >=7.0) {
				System.out.println("Aluno aprovado! " + aluno2.media());
			}else
				if(aluno2.media() >=5.0) {
					System.out.println("Aluno de recuperacao! " + aluno2.media() );
					if(aluno2.media() >=5.0) {
						System.out.println("Informe a nota final do aluno!");
						aluno2.setNotafinal(teclado.nextFloat());
						if(aluno2.getNotafinal() >=5.0) {
							System.out.println("Aluno aprovado! " + aluno2.media2());
						}else
							if(aluno2.getNotafinal() < 5.0) {
								System.out.println("Aluno reprovado! " + aluno2.media2());
							}
					}
				}else
					if(aluno2.media() <5.0) {
						System.out.println("Aluno reprovado! " + aluno2.media());
					}
			teclado.close();
			break;
		
		default:
			System.out.println("Opcao invalida!");
		}

	}

}
