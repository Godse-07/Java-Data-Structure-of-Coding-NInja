import java.util.Scanner;

public class interesting_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = 65;
        int num = a + number - 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                int p = num - i + j;
                System.out.print((char) (p));
                p++;
            }
            System.out.println();
        }
    }
}
