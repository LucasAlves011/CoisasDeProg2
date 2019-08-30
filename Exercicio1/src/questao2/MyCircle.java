package questao2;

public class MyCircle {

	private MyPoint center;
	private int radius = 1;
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public MyCircle(int x , int y, int radius) {
		this.center = new MyPoint(x,y);
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setCenterX(int k) {
		this.center.setX(k);
	}
	
	public void setCenterY(int k) {
		this.center.setY(k);
	}
	
	public void setCenterXY(int k , int k1) {
		this.center.setXY(k,k1);
	}
	
	public String toString() {
		return "Circle@ (" + center.getX()+","+center.getY() + ")\nRadius= " + radius
				+ ";Area="+getArea();
	}
	
	public double getArea() {
		return (Math.PI * Math.pow(radius,2));
	}
	
	public boolean equals(MyCircle p) {
		if(p == null) {
			return false;
		}
		else if(p.radius == radius && p.center.equals(this.center)) {
			return true;
		}
		else
			return false;
	}
	
}
