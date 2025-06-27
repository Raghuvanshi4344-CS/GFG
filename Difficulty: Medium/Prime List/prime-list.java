// User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

class Solution {
    boolean isPrime(int n){
        if(n<2 )return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    int near(int  n){
        if(isPrime(n)) return n;
        int left=n-1;
        int right=n+1;
        while(true){
            if(left>=2 && isPrime(left)) return left;
            if(isPrime(right)) return right;
            left--;
            right++;
        }
    }
    Node primeList(Node head) {
        // code here
        Node temp=head;
        while(temp!=null){
            temp.val=near(temp.val);
            temp=temp.next;
        }
        return head;
    }
}