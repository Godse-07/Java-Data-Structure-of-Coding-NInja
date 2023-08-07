import java.util.Scanner;

public class alphabet_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                char jth=(char) ('A'+j-1);
                System.out.print(jth);
            }
            System.out.println();
        }
    }
}
