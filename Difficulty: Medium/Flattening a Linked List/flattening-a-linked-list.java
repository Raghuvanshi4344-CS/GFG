class Solution {

    // Function to merge two sorted linked lists
    public Node func(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                temp.bottom = l1;
                l1 = l1.bottom;
            } else {
                temp.bottom = l2;
                l2 = l2.bottom;
            }
            temp = temp.bottom;
        }

        if (l1 != null) {
            temp.bottom = l1;
        } else {
            temp.bottom = l2;
        }

        return dummy.bottom;
    }

    // Function to flatten the linked list
    Node flatten(Node root) {
        if (root == null || root.next == null) {
            return root;
        }

        Node head = root;
        int count = 1;

        while (head != null) {
            head = head.next;
            count++;
        }

        if (count == 0) {
            return null;
        }

        Node temp = root;
        for (int i = 1; i < count - 1; i++) {
            temp = func(temp, temp.next);
            temp = temp.next;
        }

        return root;
    }
}
