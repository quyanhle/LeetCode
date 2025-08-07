// Last updated: 8/7/2025, 6:18:59 PM
class Solution {
    
    public String largestNumber(int[] nums) {
        PriorityQueue<String> q = new PriorityQueue<>((a, b) -> comparator(a, b));

        for (int i = 0; i < nums.length; i++) {
            String str = Integer.toString(nums[i]);
            q.add(str);
        }
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()) {
            sb.append(q.poll());
        }
        return sb.toString().charAt(0) == '0' ? "0" : sb.toString();
    }

    private int comparator(String a, String b) {
        return (b+a).compareTo(a+b);
    }
}