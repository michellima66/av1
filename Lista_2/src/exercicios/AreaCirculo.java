package exercicios;
import static java.lang.Math.PI;
public class AreaCirculo {
	private double raio = 5;
	private double area;
	
	//criando os getters e setters
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	//criar metodo
	
	public double area(){
		return area = PI * Math.pow(raio, 2);
	}
		
}
