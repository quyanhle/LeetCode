class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[letters.length - 1] <= target) {
            return letters[0];
        }
        int bSearch = binarySearch(letters, target, 0, letters.length - 1);
       
        return letters[bSearch];
    }

    private int binarySearch(char[] letters, char target, int left, int right) {
        if (left > right) {
            return left;
        }
        int mid = (left+right) / 2;
        if (letters[mid] > target) {
            return binarySearch(letters, target, left, mid - 1);
        } else {
            return binarySearch(letters, target, mid+1, right);
        }
    }
}