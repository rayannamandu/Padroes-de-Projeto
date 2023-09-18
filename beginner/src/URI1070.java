import java.util.Scanner;

public class URI1070 {

    public static void main(String[] args) {
        int X;
        int i = 1;
        Scanner scan = new Scanner(System.in);
        X = scan.nextInt();

        while(i <= X){
            if (i % 2 !=0) {
                System.out.println(i);
            }
        }
    }
}
