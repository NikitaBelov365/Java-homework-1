import java.util.Scanner;

public class First {

    public static int SumFunc(int n) {
        if (n == 1) {
            return 1;
        }
        return n + SumFunc(n - 1);
    }

    public static int FactorialFunc(int n) {
        if (n == 1) {
            return 1;
        }
        return n * SumFunc(n - 1);
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = iScanner.nextInt();
        System.out.println(String.format("Triangle sum from 0 to %d = %d, \nFactorial = %d", num, SumFunc(num), FactorialFunc(num)));
        iScanner.close();
    }
}