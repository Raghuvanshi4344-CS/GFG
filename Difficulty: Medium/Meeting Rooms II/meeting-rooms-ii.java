
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        // if(start.length==0 || end.length==0) return 0;
        // int n = start.length;
        // int[][] arr = new int[n][2];
        // for (int i = 0; i < n; i++) {
        //     arr[i][0] = start[i];
        //     arr[i][1] = end[i];
        // }
        // Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.offer(arr[0][1]);

        // for (int i = 1; i < n; i++) {
        //     if (arr[i][0] >= pq.peek()) {
        //         pq.poll();
        //     }
        //     pq.offer(arr[i][1]);
        // }

        // return pq.size();
        
        
        if (start.length == 0) return 0;
        Arrays.sort(start);
        Arrays.sort(end);

        int rooms = 0;
        int maxRooms = 0;
        int i = 0, j = 0;

        while (i < start.length && j < end.length) {
            if (start[i] < end[j]) {
                rooms++;
                maxRooms = Math.max(maxRooms, rooms);
                i++;
            } else {
                rooms--;    
                j++;
            }
        }
        return maxRooms;
    }
}
