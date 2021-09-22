import java.util.Scanner;
import java.lang.Math;

public class Exercise_11 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double raio;
        raio = scan.nextDouble();

        System.out.println("Perimeter is = " + (2 * Math.PI * raio) );

        System.out.println("Area is = " + (Math.PI * Math.pow(raio, 2)));
    }
}
