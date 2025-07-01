/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node rev(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node a=head;
        Node b=head.next;
        a.next=null;
        while(b!=null){
            Node temp=b.next;
            b.next=a;
            a=b;
            b=temp;
        }
        return a;
    }
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        num1=rev(num1);
        num2=rev(num2);
        Node head=new Node(0);
        Node temp=head;
        int carry=0;
        while(num1!=null || num2!=null || carry!=0){
            int s=0;
            if(num1!=null){
                s=s+num1.data;
                num1=num1.next;
            }
            if(num2!=null){
                s=s+num2.data;
                num2=num2.next;
            }
            s=s+carry;
            Node x=new Node(s%10);
            carry=s/10;
            temp.next=x;
            temp=temp.next;
        }
        Node result=rev(head.next);
        if(result.data==0 && result.next!=null) return result.next;
        return result;
    }
}