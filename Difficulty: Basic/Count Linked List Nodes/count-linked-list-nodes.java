/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        Node curr=head;
        int c=0;
        while(curr!=null){
            // System.out.print(curr.data);
            curr=curr.next;
            c++;
        }
        return c;
    }
}