import java.util.Scanner;

public class character_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i = 0; i < N; i++) {
            char c=(char)('A'+i);
            for (int j = 0; j < i; j++) {
                char c1=(char)(c+j-1);
                System.out.print((c1));
            }
            System.out.println();
        }
    }
}
