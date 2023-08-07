import java.util.Scanner;

public class sum_or_product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int sum=0;
        int pro=1;
        if(c==1){
            for (int i = 0; i <= n; i++) {
                sum+=i;
            }
            System.out.print(sum);
        }
        else if (c==2) {
            for (int i = 1; i <= n; i++) {
                pro*=i;
            }
            System.out.print(pro);
        }
        else{
            System.out.print(-1);
        }
    }
}
