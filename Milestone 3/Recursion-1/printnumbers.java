public class printnumbers {
    public static void print(int n) {
       if (n <= 0) { // base case: stop recursion when n is 0 or negative
          return;
       }
       print(n-1); // recursive call with the next number
       System.out.println(n); // print the current number
    }
    
    public static void main(String[] args) {
       int n = 10; // print numbers till 10
       print(n);
    }
 }
 