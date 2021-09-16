import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dividendo, divisor;

        System.out.println("Insira o dividendo: ");
        dividendo = scan.nextInt();

        System.out.println("Insira o divisor: ");
        divisor = scan.nextInt();

        System.out.println("Resultado da divisão: " + (dividendo / divisor));

    }
}
