class Solution {
    static void join(int[] arr, int st, int mid, int end) {
        int merged[] = new int[end - st + 1];
        int ind1 = st;
        int ind2 = mid + 1;
        int x = 0;
        while (ind1 <= mid && ind2 <= end) {
            if (arr[ind1] <= arr[ind2]) {
                merged[x++] = arr[ind1++];

            } else {
                merged[x++] = arr[ind2++];
            }

        }
        while (ind1 <= mid) {
            merged[x++] = arr[ind1++];
        }
        while (ind2 <= end) {
            merged[x++] = arr[ind2++];
        }
        for (int i = 0, j = st; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

     static void divide(int[] arr, int st, int end) {
        if (st >= end) {
            return;
        }
        int mid = (st + end) / 2;
        divide(arr, st, mid);
        divide(arr, mid + 1, end);
        join(arr, st, mid, end);
    }
    public int heightChecker(int[] heights) {
    int [] arr = new int[heights.length];
        for(int i=0;i<heights.length;i++){
         arr[i] = heights[i];
        }
       divide(arr,0,arr.length-1);
        int count =0 ;
        for(int i=0;i<arr.length;i++){
          if(arr[i]!=heights[i]){
              count++;
          }
        }
        return count;
    }
}