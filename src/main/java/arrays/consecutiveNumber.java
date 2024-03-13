package arrays;

import java.util.Arrays;

public class consecutiveNumber {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int currentLongest = 1;
        if(nums.length>0){
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]+1 && nums[i]!=nums[i-1]){
                    count++;
                    currentLongest = count;
                }else{
                    count=0;
                }
            }
            if(currentLongest>count){
                return currentLongest;
            }
            return count;
        }
        return 0;

    }

    public static void main(String[] args){
        consecutiveNumber consecutiveNbr = new consecutiveNumber();
        consecutiveNbr.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
    }
}
