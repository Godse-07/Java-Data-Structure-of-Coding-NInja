import java.util.Scanner;

/**
 * return_array_sum
 */
public class return_array_sum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int sum=0;
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                sum+=arr[i];
            }
            System.out.println(sum);
        }
    }
}