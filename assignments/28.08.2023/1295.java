class Solution {
      static  int count;
    public int findNumbers(int[] nums) {
        count =0;
        for(int i=0;i<nums.length;i++){
            String s1 =""+nums[i];
            if(s1.length()%2==0){
                count++;
            }
           

        }
        return count;
       
    }
    
    }
    