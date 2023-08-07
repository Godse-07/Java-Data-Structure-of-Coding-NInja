import java.util.Scanner;

/**
 * Avarage_marks
 */
public class Avarage_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int d = (m1 + m2 + m3) / 3;
        System.out.println(s);
        System.out.print(d);
    }
}