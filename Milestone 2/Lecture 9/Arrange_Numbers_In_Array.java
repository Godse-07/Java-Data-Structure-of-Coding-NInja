import java.util.Scanner;

public class Arrange_Numbers_In_Array {

    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int idx=0;
        //System.out.print(arr.length + " ");
        for (int i=1;i<=n;i=i+2)
        {
            arr[idx]=i;
            //System.out.print(arr[idx]+ " ");
            idx=idx+1;
            
        }
        int i=0;
        
        if (n%2==0)
        {
            i=n;
        }
        else
        {
            i=n-1;
        }
        
        for (;i>=2;i=i-2)
        {
            arr[idx]=i;
            //System.out.print(arr[idx]+ " ");
            idx=idx+1;
            
        }
        //System.out.println("");
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        arrange(arr1, n);
    }
}
