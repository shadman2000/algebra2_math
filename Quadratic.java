import java.util.Scanner;
import java.text.DecimalFormat;
public class Quadratic {
    public static void main(String args[]){
        Scanner ms = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat(".##");
        int a,b,c;
        System.out.println("Please enter your a, b, c (Provide space for each number :))");
        a = ms.nextInt();
        b = ms.nextInt();
        c = ms.nextInt();
        
        double D = (Math.pow(b,2))-(4*a*c);
        
        if(D == 0){
            double root = (-b+Math.sqrt(D))/(2*a);
            System.out.println("D = " + D + " it will only have one solution which is : " + df2.format(root));
        }
        if(D >= 1){
            double root1 = (-b+Math.sqrt(D))/(2*a);
            double root2 = (-b-Math.sqrt(D))/(2*a);
            System.out.println("D = " + D + " it will have two real solutions which are: " + df2.format(root1) + " and " + df2.format(root2));
        }
        if(D <= -1){
            String root1 = "("+(-b + " + or - " + df2.format(Math.sqrt(D*-1)) + "i" + ")" + "/" + 2*a);
            System.out.println("D = " + D + " it will have an unreal solution which is: " + root1);
        }
    }
}