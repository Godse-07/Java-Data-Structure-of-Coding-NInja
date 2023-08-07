import java.util.Scanner;

/**
 * Fahrenheit_to_Celsius_Table
 */
public class Fahrenheit_to_Celsius_Table {

    public static void printFahrenheitTable(int start, int end, int step) {
        for (int i = start; i <=end; i=i+step) {
            System.out.println(i+"\t"+((5/9)*(i-32)));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();
        printFahrenheitTable(s, e, w);
    }
}