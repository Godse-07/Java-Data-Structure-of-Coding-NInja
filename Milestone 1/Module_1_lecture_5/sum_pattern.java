import java.util.Scanner;

public class sum_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(j);
                } else {
                    System.out.print("+" + j);
                }
            }
            System.out.print("=" + sum);
            System.out.println();
        }
    }
}
