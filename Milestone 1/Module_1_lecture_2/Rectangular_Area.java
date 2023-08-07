import java.util.Scanner;

public class Rectangular_Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int area=((x2-x1)*(y2-y1));
        System.out.println(area);
    }
}
