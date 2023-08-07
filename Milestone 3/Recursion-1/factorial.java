/**
 * factorial
 */
public class factorial {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int small=fact(n-1);
        int output=n*small;
        return output;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}