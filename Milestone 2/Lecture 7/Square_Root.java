import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {

        int i = 1, result = 1;

        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        while (result <= N) {

            i++;

            result = i * i;

        }

        System.out.println(i - 1);
    }
}
