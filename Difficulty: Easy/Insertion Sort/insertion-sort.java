class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j;
            for(j=i-1;j>=0  && arr[j]>key;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=key;
        }
    }
} 