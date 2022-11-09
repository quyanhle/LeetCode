class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[arr.length - 1] = -1;
            return arr;
        }
        for (int i =0 ; i< arr.length-1; i++) {
            arr[i] = arr[i+1];
            for (int j=i+1; j< arr.length; j++) {
                if (arr[j] > arr[i]) {
                    arr[i] = arr[j];
                }
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}