// User function Template for Java

class Solution {
    // Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String s1, String s2) {   
        int n=s1.length()+1;
        int m=s2.length()+1;
        int arr[][]=new int[n][m];
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        int re=m-1+n-1-arr[n-1][m-1];
        return re;
    }
}