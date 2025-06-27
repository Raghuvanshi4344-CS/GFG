// User function Template for Java

class Solution {

    ArrayList<Integer> nthRowOfPascalTriangle(int a) {
        // code here
        ArrayList<Integer> row = new ArrayList<>();
        long value = 1;
        row.add(1); // First element is always 1

        for (int i = 1; i < a; i++) {
            value = value * (a - i);
            value = value / i;
            row.add((int) value);
        }

        return row;
    }
}