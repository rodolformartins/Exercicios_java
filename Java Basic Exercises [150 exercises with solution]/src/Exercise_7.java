import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
