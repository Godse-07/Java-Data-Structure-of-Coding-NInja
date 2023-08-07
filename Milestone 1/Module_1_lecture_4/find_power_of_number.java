import java.util.Scanner;

public class find_power_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        int total=1;
        for (int i = 1; i <= pow; i++) {
            total=total*num;

        }
        System.out.println(total);
    }
}
