// User function Template for Java//User function Template for Java
class Solution {
    static void Re(int []arr,ArrayList<Integer>res,int i,int currentsum){
        if(i==arr.length){
            res.add(currentsum);
            return;
        }
        //include
        Re(arr,res,i+1,currentsum+arr[i]);
        //exclude
        Re(arr,res,i+1,currentsum);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList <Integer> a=new ArrayList<>();
        Re(arr,a,0,0);
        return a;
    }
}