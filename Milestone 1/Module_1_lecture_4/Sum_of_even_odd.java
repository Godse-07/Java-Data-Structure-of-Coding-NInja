import java.util.Scanner;

public class Sum_of_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int even=0,odd=0;
        while (number !=0) {
            int rem=number%10;
            if (rem%2==0) {
                even+=rem;
            } else {
                odd+=rem;
            }
            number=number/10;
        }
        System.out.println(even+" "+odd);
    }
}
