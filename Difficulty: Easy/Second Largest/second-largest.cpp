
class Solution {
  public:
    int getSecondLargest(vector<int> &arr) {
        // code here
        int y=-1;
        int x=-1;
        for(int i=0;i<arr.size();i++){
            if(arr[i]>y){
                x=y;
                y=arr[i];
            }
            else if(arr[i]>x && arr[i]!=y){
                x=arr[i];
            }
        }
        return x;
    }
};