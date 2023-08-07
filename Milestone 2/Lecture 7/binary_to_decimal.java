import java.util.Scanner;

public class binary_to_decimal {
    public static int getDecimal(int number){
        int decimal=0;
        int n=0;
        while (true) {
            if(number==0){
                break;
            }else{
                int temp=(number%10);
                decimal+=temp*Math.pow(2, n);
                number/=10;
                n++;
            }
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getDecimal(n));
    }
}
