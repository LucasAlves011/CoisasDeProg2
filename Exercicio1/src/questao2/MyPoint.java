package questao2;

public class MyPoint {

	private int x;
	private int y;
	
	public MyPoint() {
		
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "MyPoint("+x+","+y+")";
	}
	
	public boolean equals(MyPoint k) {
		if( k==null) {
			return false;
		}
		else if(x == k.x && y==k.y) {
			return true;
		}
		return false;
	}
	
	public double distance(int x , int y) {
		
			return Math.abs(Math.sqrt(Math.pow(this.x - x,2)+Math.pow(this.y-y,2)));
		
		}
	
	public double distance(MyPoint ponto) {
		return Math.abs(Math.sqrt(Math.pow(this.x - ponto.x,2)+Math.pow(this.y-ponto.y,2)));
	}
	
	public static double frac (double d) {
		if (d >= 0.0) {
			return d - Math.floor (d);
		} else {
			return d - Math.ceil (d);
		}
	}

}
