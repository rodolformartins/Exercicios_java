import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Input first number: ");
        a = scan.nextInt();

        System.out.println("Input second number: ");
        b = scan.nextInt();

        System.out.println(a + " x " + b + " = " + (a * b));

    }
}
