import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Entre com valor de A: ");
        a = scan.nextInt();
        System.out.println("Entre com valor de B: ");
        b = scan.nextInt();

        System.out.println("Resultado da soma: " + (a + b));
    }
}
