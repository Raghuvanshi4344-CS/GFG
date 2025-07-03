// User function Template for Java//User function Template for Java
class Solution {
    static void subset(int []arr,ArrayList <Integer>x,int i,int s){
        if(i==arr.length){
            x.add(s);
            return;
        }
        //include
        subset(arr,x,i+1,s+arr[i]);
        //exclude
        subset(arr,x,i+1,s);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> x=new ArrayList<>();
        subset(arr,x,0,0);
        return x;
    }
}