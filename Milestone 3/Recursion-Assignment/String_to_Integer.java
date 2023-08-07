/*
 Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string S (string, Eg. "1234")
Output format :
Corresponding integer N (int, Eg. 1234)
Constraints :
0 < |S| <= 9
where |S| represents length of string S.
Sample Input 1 :
00001231
Sample Output 1 :
1231
Sample Input 2 :
12567
Sample Output 2 :
12567
 */

 
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
		 if (input.isEmpty()) {
            return 0;
        } else {
            int digit = Character.getNumericValue(input.charAt(input.length() - 1));
            String remaining = input.substring(0, input.length() - 1);
            int result = convertStringToInt(remaining);
            return result * 10 + digit;
        }
	}
}
