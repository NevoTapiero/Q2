import java.util.Scanner;
public class LocalActions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, m = 0;
        System.out.println("enter two numbers pls");
        a = s.nextDouble();
        b = s.nextDouble();
        average(a, b, m);
        System.out.println("the average of " + a + " and " + b + " is " + m);
    }
    public static double average(double a, double b, double m){
        m = (a + b)/2;
        return m;
    }
}
