// User function Template for Java

class Solution {
    static int sum(int arr[],int i){
        if(i>=arr.length) return 0;
        return arr[i]+sum(arr,i+1);
    }
    int arraySum(int arr[]) {
        // code here
        int s=sum(arr,0);
        return s;
    }
}
