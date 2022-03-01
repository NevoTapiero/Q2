import java.util.Scanner;

public class LocalActions2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = 0;
        System.out.println("give me two numbers between 1 - 9 pls");
        int a = s.nextInt();
        int b = s.nextInt();
        while (a > 0) {
            number = numbers(a, b);
            a--;
            print(number);
        }
    }
    public static int numbers(int a, int b){
        int y = 0,z = 1;
        while (a > 0){
            a--;
            y = y + (b*z);
            z = z*10;
        }
        return y;
    }
    public static void print(int num){
        System.out.println(num);
    }
}
