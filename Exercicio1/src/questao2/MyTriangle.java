package questao2;

public class MyTriangle {

	private MyPoint v1; 
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle(int x1 , int y1 , int x2 ,int y2,int x3,int y3) {
		v1 = new MyPoint(x1,y1);
		v2 = new MyPoint(x2,y2);
		v3 = new MyPoint(x3,y3);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public double getPerimeter() {
		return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
	}
	
	public String toString() {
		
		String aux="kk";
		double d1p2 = Math.ceil(v1.distance(v2));
		double d2p3 = Math.ceil(v2.distance(v3));
		double d3p1 = Math.ceil(v3.distance(v1));
		
		if(d1p2 == d2p3 & d1p2 == d3p1 || d2p3 == d3p1 & d2p3 == d1p2 || d1p2 == d3p1 & d2p3 == d1p2 ) {
			aux = "Equilátero";
		}
		else if((d1p2 == d2p3 && d3p1 != d1p2) || (d2p3 == d3p1 && d1p2 != d2p3) ||
				(d1p2 == d3p1 && d2p3 != d1p2)) {
			aux = "Isóceles";
		}
		else 
			aux = "Escaleno";
		
		return "MyTriangle "+ aux +"@("+v1.getX()+","+v1.getY()+") " + 
		"("+v2.getX()+","+v2.getY()+") " + "("+v3.getX()+","+v3.getY()+")";
				
	}
	
	public boolean equals(MyTriangle triangulo) {
		if(this.v1.equals(triangulo.v1) && this.v2.equals(triangulo.v2)
				&& this.v3.equals(triangulo.v3)) {
			return true;
		}
		else
			return false;
		
	}

}
