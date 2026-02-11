import java.util.Scanner;
public class AreaCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int l=sc.nextInt();
        int b=sc.nextInt();
        int ba=sc.nextInt();
        int h=sc.nextInt();
        double carea=Math.PI*r*r;
        double rarea=l*b;
        double tarea=0.5*ba*h;
        System.out.println(String.format("%.2f",carea));
        System.out.println(String.format("%.2f",rarea));
        System.out.println(String.format("%.2f",tarea));
    }
}
