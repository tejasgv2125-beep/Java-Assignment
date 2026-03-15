//Number Of One Bits
package fourthWeekAssignemnt.module8;

import java.util.Scanner;
public class NumberOf1Bits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("Number of set bits: " + count);
        sc.close();
    }
}