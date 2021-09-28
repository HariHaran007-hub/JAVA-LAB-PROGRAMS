public class Triangle extends Shape{
	private double a,b;
	private double area;
	public Triangle(double a, double b){
		this.a = a;
		this.b = b;
	}

	double area(){

		area = this.a*this.b * 0.5;
		return area;
	}



}