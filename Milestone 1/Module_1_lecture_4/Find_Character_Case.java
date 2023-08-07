import java.util.Scanner;

/**
 * Find_Character_Case
 */
public class Find_Character_Case {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char num = sc.next().charAt(0);
        if(num>='A' && num<='Z'){
            System.out.println(1);
        }
        else if(num>='a' && num<='z'){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }
    }
}