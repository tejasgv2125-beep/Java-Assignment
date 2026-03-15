//Add Two Numbers
package fourthWeekAssignemnt.module10;
import java.util.*;
class listnode {
    int val;
    listnode next;

    listnode() {}

    listnode(int val) {
        this.val = val;
    }

    listnode(int val, listnode next) {
        this.val = val;
        this.next = next;
    }
}
public class AddTwoNumbers {


    // Function to add two numbers
    public static listnode addTwoNumbers(listnode l1, listnode l2) {

        listnode dummy = new listnode(0);
        listnode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new listnode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }
    public static listnode createList(int n, Scanner sc) {
        listnode head = null, temp = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            listnode newNode = new listnode(val);

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }
        return head;
    }

    // Function to print linked list
    public static void printList(listnode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes in first list: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements:");
        listnode l1 = createList(n1, sc);

        System.out.print("Enter number of nodes in second list: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements:");
        listnode l2 = createList(n2, sc);

        listnode result = addTwoNumbers(l1, l2);

        System.out.println("Result:");
        printList(result);
    }
}