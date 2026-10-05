import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        Scanner myObj = new Scanner(System.in);

//            System.out.println("Enter size:     ");
//            int size = myObj.nextInt();
            int size = Integer.parseInt(args[0]);

            for (int i = 1; i <= size; i+=2) {
                for (int j = 0; j <= (size - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");

            }
        }

}