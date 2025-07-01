class Solution {
    public void sortInWave(int arr[]) {
        // code here
        // for(int i=0;i<arr.length-1;i++){
        //     if (i > 0 && arr[i] < arr[i - 1]) {
        //         int temp = arr[i];
        //         arr[i] = arr[i - 1];
        //         arr[i - 1] = temp;
        //     }

        //     if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
        //         int temp = arr[i];
        //         arr[i] = arr[i + 1];
        //         arr[i + 1] = temp;
        //     }
        // }
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
