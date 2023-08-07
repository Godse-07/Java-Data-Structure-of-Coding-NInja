import java.util.*;
public class All_Prime_Numbers {
    static void prime_n(int N){
        int x,y,flag;
        for (x = 2; x <= N; x++) {
            flag=1;
            for(y=2;y*y<=x;y++){
                if(x%y==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime_n(n);
    }
}
