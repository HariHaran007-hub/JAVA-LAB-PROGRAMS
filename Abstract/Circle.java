
import java.lang.*;
public class Circle extends Shape{
		private double a;
		private double area;
		public Circle(int a){
			this.a = a;
		}

		double area(){

			area = this.a*this.a*(Math.PI);
			return area;
		}



}