import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(calc());
    }

    public static String calc() {
        String in = new Scanner(System.in).nextLine();
        String[] ints = in.split(" ");
        int num1 = Integer.parseInt(ints[0]);
        int num2 = Integer.parseInt(ints[2]);
        if (ints.length > 3) {
            throw new ArithmeticException();
        }
        if (num1 < 1 || num2 < 1) {
            throw new ArithmeticException();
        }
        if (num1 > 10 || num2 > 10) throw new ArithmeticException();
        int sign = ints[1].charAt(0);                   // 42  *; 43 = +; 45 = -;47 = /;
        if (sign == 42) {
            return String.valueOf(num1 * num2);
        } else if (sign == 43) {
            return String.valueOf(num1 + num2);
        } else if (sign == 45) {
            return String.valueOf(num1 - num2);
        } else if (sign == 47) {
            return String.valueOf(num1 / num2);
        } else {
            throw new ArithmeticException();
        }
    }
}