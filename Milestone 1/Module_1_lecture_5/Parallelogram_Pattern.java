import java.util.Scanner;

public class Parallelogram_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= number; j++) {
                System.out.print("*");
            }
            for (int j = i-1; j >= 1; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
