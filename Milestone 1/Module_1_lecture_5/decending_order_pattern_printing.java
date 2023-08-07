import java.util.Scanner;

public class decending_order_pattern_printing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for (int i = number; i >= 1; i--) {
            for (int j = number; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
