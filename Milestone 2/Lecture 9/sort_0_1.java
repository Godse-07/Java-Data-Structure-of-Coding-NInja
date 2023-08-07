import java.util.*;
public class sort_0_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int arr[]=new int[11];
	    for (int i=0;i<arr.length;i++ ){
	        arr[i]=sc.nextInt();
	    }
	    int nextZeros = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp = arr[nextZeros];
                arr[nextZeros] = arr[i];
                arr[i] = temp;
                nextZeros++;
            }
        }
        for (int t=0;t<arr.length ;t++ ) 
        System.out.print(arr[t]);
    }
}
