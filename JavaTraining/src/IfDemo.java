import java.util.Scanner;

public class IfDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int x = scanner.nextInt();

        if (x == 5) {
            System.out.println("X in 5. Yay");
        }

        else {
            System.out.println(" X is not 5. Hate you");
            System.out.println(" Please enter 5");
        }
    }
}
