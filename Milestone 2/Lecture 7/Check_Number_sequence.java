import java.util.*;
public class Check_Number_sequence {
public static void main(String[] args) {    

    Scanner s = new Scanner(System.in);
    int t = s.nextInt(),i,count=0;
    int n1 = s.nextInt(),n2 = s.nextInt(),n3;  
    for(i=0;i<t-2;i++){
      n3 = s.nextInt();
      if((n1>n2)&&(n2<n3))
        count++;
      else if((n1<n2)&&(n2>n3))
        count++;
      n1 = n2;
      n2 = n3;
      
    }
    if(count>1)
      System.out.print("false");
    else
      System.out.print("true");}
}
