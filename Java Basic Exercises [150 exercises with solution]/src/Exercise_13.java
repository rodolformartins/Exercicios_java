import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        double alturaTriangulo, larguraTriangulo;

        Scanner scan = new Scanner(System.in);

        alturaTriangulo = scan.nextDouble();

        larguraTriangulo = scan.nextDouble();

        double areaTriangulo = larguraTriangulo * alturaTriangulo;

        double perimetroTriangulo = 2 * (larguraTriangulo  + alturaTriangulo);

        System.out.println("Area do triangulo é: " + areaTriangulo);

        System.out.println("Perimetro do triangulo é: " + perimetroTriangulo);
    }
}
