// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        int n=s1.length()+1;
        int m=s2.length()+1;
        int arr[][]=new int[n][m];
        int ans=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                    ans=Math.max(ans,arr[i][j]);
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        return ans;
    }
}