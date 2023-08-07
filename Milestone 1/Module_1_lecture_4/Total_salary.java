import java.util.Scanner;

public class Total_salary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //System.out.print("Enter basic salary: ");
    int basic = sc.nextInt();

    //System.out.print("Enter grade (A, B, C): ");
    char grade = sc.next().charAt(0);

    int allow;
    if (grade == 'A') {
      allow = 1700;
    } else if (grade == 'B') {
      allow = 1500;
    } else {
      allow = 1300;
    }

    double hra = basic * 0.20;
    double da = basic * 0.50;
    double pf = basic * 0.11;

    double totalsalary = basic + hra + da + allow - pf;
    int output = (int) Math.round(totalsalary);

    System.out.println("Total Salary: " + output);
  }
}
