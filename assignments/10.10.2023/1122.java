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
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] arr = new int[arr1.length];
        int index=0;
        boolean[] mark = new boolean[arr1.length];
        int count =0;
        for(int i=0;i<arr2.length;i++){
             int element  = arr2[i];
             for(int j=0;j<arr1.length;j++){
                 if(element==arr1[j]){
                     arr[index] = element;
                     index++;
                     count++;
                     mark[j] = true;
                 }

             }
        }
        int ind = 0;
        int[] remain = new int[arr1.length-count];
        for(int i=0;i<arr1.length;i++){
            if(mark[i]!=true){
                remain[ind] = arr1[i];
                ind++;
            }
        }
       divide(remain,0,remain.length-1);
        for(int i=0;i<remain.length;i++){
            arr[index] = remain[i];
            index++;
        }
        return arr;
    }
}