// Middle of the linked list
package fourthWeekAssignemnt.module10;
import java.util.*;

class Listnode {
    int val;
    Listnode next;

    Listnode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class MiddleOfLinkedList {
    public static Listnode middleNode(Listnode head) {
        Listnode slow = head;
        Listnode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;       // move 1 step
            fast = fast.next.next;  // move 2 steps
        }
        return slow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Listnode head = null, temp = null;
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            Listnode newNode = new Listnode(x);
            if (head == null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }
        Listnode middle = middleNode(head);

        System.out.println("Middle element: " + middle.val);
    }
}