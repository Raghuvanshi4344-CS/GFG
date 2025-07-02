// User function Template for Java

class Solution {
    static int su(int arr[],int i){
        if(i>=arr.length) return 0;
        return arr[i]+su(arr,i+1);
    }
    int arraySum(int arr[]) {
        // code here
        return su(arr,0);
    }
}
