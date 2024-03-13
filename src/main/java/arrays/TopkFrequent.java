package arrays;

import java.util.HashMap;
import java.util.Map;

public class TopkFrequent {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> hs1 = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i =0; i<nums.length;i++){
            if(hs1.containsKey(nums[i])){
                count = hs1.get(nums[i]);
                hs1.put(nums[i], ++count);

            }else{
                hs1.put(nums[i],1);
            }
        }
        return null;
    }
}
