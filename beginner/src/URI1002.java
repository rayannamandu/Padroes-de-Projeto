import java.util.Scanner;

public class URI1002 {

    public static void main(String[] args) {
        double n = 3.14159;
        double raio;
        Scanner scan = new Scanner(System.in);
        raio = scan.nextDouble();

        double area = n * (raio * raio);

        System.out.println(String.format("A = %.4f", area));
    }
}
