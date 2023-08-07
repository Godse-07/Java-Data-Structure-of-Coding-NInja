import java.util.Scanner;

public class Alpha_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A'+i-1));
                //char jth=(char)('A'+j-1);
            }
            System.out.println();
        }
    }
}
