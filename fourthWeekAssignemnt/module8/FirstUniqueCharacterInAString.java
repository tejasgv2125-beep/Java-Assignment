//First Unique Character in a String
package fourthWeekAssignemnt.module8;


import java.util.Scanner;
public class FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int result = firstUniqChar(s);
        System.out.println("Index of first non-repeating character: " + result);
        sc.close();
    }
}