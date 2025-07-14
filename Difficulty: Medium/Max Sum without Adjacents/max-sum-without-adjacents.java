// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
        // code here
        int ar[]=new int[arr.length];
        ar[0]=arr[0];
        ar[1]=Math.max(ar[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            ar[i]=Math.max(ar[i-1],arr[i]+ar[i-2]);
        }
        return ar[arr.length-1];
    }
}