/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    void lef(Node node,ArrayList<Integer> x){
        if(node==null || (node.left == null && node.right == null)) return;
        x.add(node.data);
        if (node.left != null) {
            lef(node.left, x);
        } else {
            lef(node.right, x);
        }
    }
    void righ(Node node,ArrayList<Integer> x){
        if(node==null || (node.left == null && node.right == null)) return;
        if (node.right != null) {
            righ(node.right, x);
        } else {
            righ(node.left, x);
        }
        x.add(node.data);
    }
    void lea(Node node,ArrayList<Integer> x){
        if(node==null) return;
        if(node.left==null && node.right==null ){
            x.add(node.data);
        }
        lea(node.left,x);
        lea(node.right,x);
    }
    ArrayList<Integer> boundaryTraversal(Node node) {
         ArrayList<Integer> x = new ArrayList<>();
        if (node == null) return x;
        x.add(node.data);
        lef(node.left, x);
        lea(node.left, x);
        lea(node.right, x);
        righ(node.right, x);

        return x;

    }
}