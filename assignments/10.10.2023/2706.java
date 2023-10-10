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
    public int buyChoco(int[] prices, int money) {
     
    divide(prices,0,prices.length-1);
        int paisa = money;
        int count=0;
        if(prices[0]<=money){
            money = money-prices[0];
            count++;
        }
        if(prices[1]<=money){
            money = money-prices[1];
            count++;
        }
        if(count==2&&money>=0){
            return money;
        }
        else{
           return paisa;
        }
    }
}