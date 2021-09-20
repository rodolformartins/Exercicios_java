import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        int a, b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        a = scan.nextInt();

        System.out.println("Entre com o segundo número: ");
        b = scan.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

    }
}
