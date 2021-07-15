import java.util.Scanner;

public class SampleClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number : ");
        int monthNumber = scanner.nextInt();
        String month = null;

        switch (monthNumber) {

            case 1 : month = "Quarter1" ;
            break;
            case 2 : month = "Quarter 2";
            break;
            case 3 : month = "Quarter 2";
            break;
            case 4 : month = "Quarter 2";
            break;
            default : month = "Unknown";
        }
        System.out.println(month);
    }
    
}
