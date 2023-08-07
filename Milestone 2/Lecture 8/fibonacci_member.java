import java.util.*;
public class fibonacci_member {
	
	public static boolean checkMember(int n){
				
		if (n == 0 || n == 1) {
        return true;
    }
    int a = 0, b = 1, c = 0;
    while (c < n) {
        c = a + b;
        a = b;
        b = c;
    }
    return c == n;

	}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	checkMember(N);
}

}
