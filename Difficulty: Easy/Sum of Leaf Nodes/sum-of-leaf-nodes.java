/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    static void helper(Node root,int []s){
        if (root==null) return;
        if(root.left==null && root.right==null) {
            s[0]+=root.data;
        }
        helper(root.left,s);
        helper(root.right,s);
    }
    // Function to return sum of all nodes of a binary tree
    static int leafSum(Node root) {
        // Your code here
        int s[]=new int[1];
        helper(root,s);
        return s[0];
    }
}