/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
        Node s=head;
        Node f=head;
        int c=0;
        int ff=0;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                ff=1;
                c++;
                s=s.next;
                break;
            }
        }
        while(ff==1 && f!=s){
            c++;
            s=s.next;
        }
        return c;
    }
}