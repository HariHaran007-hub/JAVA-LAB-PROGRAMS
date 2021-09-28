public class Rectangle extends Shape{
	private double a,b;
	private double area;
	public Rectangle(double a, double b){
		this.a = a;
		this.b = b;
	}

	double area(){

		area = this.a*this.b;
		return area;
	}



}