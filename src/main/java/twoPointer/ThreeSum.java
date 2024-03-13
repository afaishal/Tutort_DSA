package twoPointer;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        List<Integer> ls1 = new ArrayList<Integer>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k = j+1; k<nums.length-1;k++){
                    if((nums[i] + nums[j] + nums[k]==0) && i!= j && i != k && j != k){
                        ls1.add(nums[i]);
                        ls1.add(nums[j]);
                        ls1.add(nums[k]);
                        ls.add(ls1);
                    }
                }
            }
        }
        return ls;
    }

    public static void main(String[] args){
        ThreeSum ts = new ThreeSum();
        ts.threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}
