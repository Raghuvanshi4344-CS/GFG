/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    void helper(Node root,int s[]){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s[0]+=1;
        }
        helper(root.left,s);
        helper(root.right,s);
    }
    int countLeaves(Node node) {
        // Your code
        int s[]=new int[1];
        helper(node,s);
        return s[0];
    }
}