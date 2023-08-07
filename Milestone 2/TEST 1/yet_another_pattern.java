import java.util.Scanner;

/**
 * yet_another_pattern
 */
public class yet_another_pattern {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            for (int i= n; i>= 1; i--)
            {
                for (int j=n; j>i;j--)
                {
                    System.out.print(" ");
                }
                for (int k=1;k<=i;k++)
                {
                    System.out.print("*");
                } 
                    System.out.println("");
            }
        }
    }
}