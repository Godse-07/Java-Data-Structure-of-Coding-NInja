/*
 For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
Input Format:
The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
Note:
All the characters in the input strings would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

You are not required to print anything. It has already been taken care of. Just implement the function. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
Sample Input 2:
abc
cbd
Sample Output 2:
false
 */

 
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		 if (str1.length() != str2.length()) {
        return false;
    }

    // Create an array to store the frequency of each character in the first string
    int[] freq = new int[26];
    for (int i = 0; i < str1.length(); i++) {
        freq[str1.charAt(i) - 'a']++;
    }

    // Check if the second string has the same frequency of characters as the first string
    for (int i = 0; i < str2.length(); i++) {
        int index = str2.charAt(i) - 'a';
        freq[index]--;
        if (freq[index] < 0) {
            return false;
        }
    }

    // If we have reached here, it means that the second string has the same frequency of characters as the first string
    return true;
	}

}