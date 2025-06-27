// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int lar=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar;
    }
}