import java.util.Scanner;
public class AreaCalculator{

	static void calculatearea(float radius){
		double carea=Math.PI*radius*radius;
		System.out.println(String.format("%.2f",carea));
	}
	static void calculatearea(float length,float breadth){
		double rarea=length*breadth;
		System.out.println(String.format("%.2f",rarea));
	}
	static void calculatearea(double base,double height){
		double tarea=0.5*base*height;
		System.out.println(String.format("%.2f",tarea));
	}
    	public static void main(String[] args){
        	Scanner sc=new Scanner(System.in);
        	float r=sc.nextFloat();
        	float l=sc.nextFloat();
        	float b=sc.nextFloat();
        	double ba=sc.nextDouble();
        	double h=sc.nextDouble();

		calculatearea(r);
		calculatearea(l,b);
		calculatearea(ba,h);
		
       	}
}
