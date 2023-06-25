import java.util.Scanner;

public class Third {
    public static double CalcFunc(int x, int y, String operation) {
        double z = 0;
        switch (operation) {
            case "+" -> z = x+y;
            case "-" -> z = x-y;
            case "*" -> z = x*y;
            case "/" -> z = x/y;
        }
        return z;
    }
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = iScanner.nextInt();
        System.out.println("Input second number: ");
        int num2 = iScanner.nextInt();
        System.out.println("Input operation type (+, -, *, /): ");
        String operation = iScanner.next();
        System.out.println(CalcFunc(num1, num2, operation));
        iScanner.close();
        
    }
}
