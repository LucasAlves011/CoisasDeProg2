package questao2;

public class TestMyTriangle {

	public static void main(String[] args) {
	
		MyPoint a1 = new MyPoint(3,2);
		MyPoint a2 = new MyPoint(4,0);
		MyPoint a3 = new MyPoint(0,0);
		
		MyTriangle tri = new MyTriangle(a1, a2, a3);
		MyTriangle tri2 = new MyTriangle(3, 3, 0, 0, 5, 5);
		
		System.out.println(tri);
		
		tri.equals(tri2);
	
		
		
		
		
	}	
}
