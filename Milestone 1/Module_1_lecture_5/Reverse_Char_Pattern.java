import java.util.Scanner;

public class Reverse_Char_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            char c1 = (char) ('A' + N);

            for (int j = 1; j <= i; j++) {

                System.out.print((char) (c1 - j));

            }
            System.out.println();
        }
    }
}
