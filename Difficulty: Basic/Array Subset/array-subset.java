
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int  i=0;i<a.length;i++){
            hash.put(a[i],hash.getOrDefault(a[i], 0) + 1);
        }
        for(int i=0;i<b.length;i++){
            if(hash.containsKey(b[i]) && hash.get(b[i]) > 0){
                 hash.put(b[i], hash.get(b[i]) - 1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
