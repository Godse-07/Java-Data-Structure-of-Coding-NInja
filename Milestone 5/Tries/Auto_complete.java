/* Given n number of words and an incomplete word w. You need to auto-complete that word w.
That means, find and print all the possible words which can be formed using the incomplete word w.
Note : Order of words does not matter.
Input Format :
The first line of input contains an integer, that denotes the value of n.
The following line contains n space separated words.
The following line contains the word w, that has to be auto-completed.
Output Format :
Print all possible words in separate lines.
Constraints:
Time Limit: 1 sec
Sample Input 1 :
7
do dont no not note notes den
no
Sample Output 1 :
no
not
note
notes
Sample Input 2 :
7
do dont no not note notes den
de
Sample Output 2 :
den
Sample Input 3 :
7
do dont no not note notes den
nom
Sample Output 3 :
(Empty) There is no word which starts with "nom" */

import java.util.ArrayList;

class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class Trie {
    private TrieNode root;
    public int count;

    public Trie() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    public void add(String word) {
        add(root, word);
    }

    public static void print(TrieNode root, String output) {
        if (root == null)
            return;
        output += root.data;
        if (root.isTerminating)
            System.out.println(output);
        for (int i = 0; i < 26; i++) {
            print(root.children[i], output);
        }
    }

    public void autoComplete(ArrayList<String> input, String word) {

        for (int i = 0; i < input.size(); i++) {
            add(input.get(i));
        }

        int flag = 0;
        TrieNode temp = root;
        int index = 0;
        TrieNode outer = root;
        for (int i = 0; i < word.length(); i++) {
            index = word.charAt(i) - 'a';
            if (temp.children[index] != null) {
                outer = temp;
                temp = temp.children[index];
            } else {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            return;
        index = word.charAt(0) - 'a';
        print(temp, word.substring(0, word.length() - 1));

    }

}