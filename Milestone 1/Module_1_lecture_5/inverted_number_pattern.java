import java.util.Scanner;

/**
 * inverted_number_pattern
 */
public class inverted_number_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int n=number;
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print(n);
            }
            System.out.println();
            n--;
        }
    }
}