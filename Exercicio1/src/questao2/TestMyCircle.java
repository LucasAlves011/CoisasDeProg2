package questao2;

public class TestMyCircle {
	public static void main(String[] args) {
		MyPoint suporte = new MyPoint(0,0);
		
		
		//Teste dos construtores
		MyCircle circulo1 = new MyCircle(0,0, 5);
		MyCircle circulo2 = new MyCircle(suporte, 5);
		
		//Teste do equals e dos Metodos set's
		System.out.println(circulo1.equals(circulo2));
		circulo1.setCenterX(4);
		circulo2.setCenterXY(0,4);
				
		//Teste dos get's
		System.out.println("Circulo1 gets(centro/raio):"+circulo1.getCenter() +" " + circulo1.getRadius());
		
		//Teste toString
		System.out.println(circulo1.toString());		
		
		//Teste equals
		System.out.println(circulo1.equals(circulo2));
	}
}
