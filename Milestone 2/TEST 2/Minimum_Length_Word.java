/*
 Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
 */

 
public class Solution {

	public static String minLengthWord(String str) {
		
		int spaceIndex=0;
		int startIndex=0;
		int endIndex=0;
		int minLength=Integer.MAX_VALUE;
		for(int i=0;i<=str.length();i++) {
			
			if(i==str.length() || str.charAt(i)==' ' ) {
				int length= i-spaceIndex;
				if(minLength > length) {
					minLength=length;
					startIndex=spaceIndex;
					endIndex=i;
				}
				spaceIndex=i+1;
			}
        }
		return str.substring(startIndex,endIndex);
    }
		
	}