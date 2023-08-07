import java.util.Scanner;

public class Decimal_to_Binary {
    public static void getBinary(int number){
        int binary[]=new int[30];
        int index=0;
        while(number>0){
            binary[index++]=number%2;
            number/=2;
        }
        for (int i = index-1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        getBinary(n);
    }
}
