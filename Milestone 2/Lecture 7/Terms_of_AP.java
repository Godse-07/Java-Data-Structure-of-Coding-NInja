import java.util.Scanner;

public class Terms_of_AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int counter=0;
        int n=1;
        while (counter<x) {
            int temp=3*n+2;
            if(temp%4!=0){
                System.out.print(temp+" ");
                counter++;
            }
            n++;
        }
    }
}
