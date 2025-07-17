// User function Template for Java

class Solution {
    static int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n=val.length;
        int m=capacity;
        int arr[][]=new int [n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(wt[i-1]>j){
                    arr[i][j]=arr[i-1][j];
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-wt[i-1]]+val[i-1]);
                }
            }
        }
        return arr[n][m];
    }
}