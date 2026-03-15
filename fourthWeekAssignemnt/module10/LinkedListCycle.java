// Linked List Cycle
package fourthWeekAssignemnt.module10;

class ListNode {
    int val;
    listNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycle {

    public static boolean hasCycle(listNode head) {

        listNode slow = head;
        listNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;           // cycle found
            }
        }

        return false;                  // no cycle
    }

    public static void main(String[] args) {

        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next = new listNode(4);

        // create cycle
        head.next.next.next.next = head.next;

        if (hasCycle(head))
            System.out.println("Cycle detected");
        else
            System.out.println("No cycle");
    }
}