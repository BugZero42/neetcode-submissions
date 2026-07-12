class Solution {
    public ListNode reverseList(ListNode head) {

        // 'prev' will eventually become the new head of the reversed list
        // starts as null since the original head's next should point to nothing
        ListNode prev = null;

        // 'curr' tracks the node we're currently processing
        // starts at the original head of the list
        ListNode curr = head;

        // keep looping until we've processed every node
        while (curr != null) {

            // save the next node before we overwrite curr.next
            // (otherwise we'd lose the rest of the list)
            ListNode next = curr.next;

            // reverse the pointer: make current node point back
            // to the previous node instead of forward
            curr.next = prev;

            // move 'prev' forward to the current node,
            // since curr is now the last reversed node
            prev = curr;

            // move 'curr' forward to the next node we saved earlier,
            // continuing the traversal
            curr = next;
        }

        // once curr is null, the loop ends —
        // 'prev' now points to the new head of the reversed list
        return prev;
    }
}