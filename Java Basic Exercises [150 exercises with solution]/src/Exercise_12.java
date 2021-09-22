import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        System.out.println("Média dos 3 valores: " + (a + b + c) / 3);
    }
}
