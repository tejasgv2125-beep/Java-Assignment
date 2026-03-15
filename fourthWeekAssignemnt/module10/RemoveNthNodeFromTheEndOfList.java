//Remove Nth Node From End of List
package fourthWeekAssignemnt.module10;

import java.util.Scanner;

class listNode {
    int val;
    listNode next;

    listNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class RemoveNthNodeFromTheEndOfList {
    public static listNode removeNthFromEnd(listNode head, int n) {
        listNode dummy = new listNode(0);
        dummy.next = head;
        listNode fast = dummy;
        listNode slow = dummy;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void printList(listNode head) {
        listNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        listNode head = null;
        listNode tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            listNode newNode = new listNode(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.print("Enter n (node to remove from end): ");
        int k = sc.nextInt();
        head = removeNthFromEnd(head, k);
        System.out.println("Updated List:");
        printList(head);
    }
}