package questao2;

public class TestMyPoint {

	public static void main(String[] args) {
		
		//Testando os dois tipos de construtores
		MyPoint a1 = new MyPoint(1,2);
		MyPoint a2 = new MyPoint();
		
		//Testando os dois métodos toString
		System.out.println(a1);
		System.out.println(a2);
		
		//Testando o método set de X e Y ao mesmo tempo
		a2.setXY(1, 2);
		
		//Testando o métodos equals
		System.out.println(a1.equals(a2));
		
		//Testando o método setX
		a1.setX(3);
		
		//Testando novamente o equals
		System.out.println(a1.equals(a2)+"\n\nD E S A F I O:");
		
		//DESAFIO
		MyPoint[] array = new MyPoint[10];
		
		for(int x=0;x<10;x++) {
			array[x] = new MyPoint(x,x);
			System.out.println(array[x]);
		}	
		
		//Testando os métodos de calculo de distância
		MyPoint FF = new MyPoint(5, 5);				
		System.out.println(a2.distance(5, 5));
		System.out.println(a2.distance(FF));
		
		
	
	}

}
