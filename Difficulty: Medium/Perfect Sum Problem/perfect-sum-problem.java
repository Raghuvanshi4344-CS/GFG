class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n=nums.length;
        int m=target;
        int arr[][]=new int[n+1][target+1];
        // for(int i=0;i<=n;i++){
        //     arr[i][0]=1;
        // }
        arr[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(nums[i-1]>j){
                    arr[i][j]=arr[i-1][j];
                }
                else{
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-nums[i-1]];
                }
            }
        }
        return arr[n][m];
    }
}