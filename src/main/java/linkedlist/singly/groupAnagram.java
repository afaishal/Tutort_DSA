package linkedlist.singly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class groupAnagram {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> ls1 = new ArrayList<>();
            for(int i=0;i<strs.length;i++){

                List<String> ls2 = new ArrayList<>();
                char[] arr1 = strs[i].toCharArray();
                Arrays.sort(arr1);

                ls2.add(strs[i]);

                for(int j=i+1;j<strs.length;j++){

                    char[] arr2 = strs[j].toCharArray();
                    Arrays.sort(arr2);

                    if(Arrays.equals(arr1,arr2)){
                        ls2.add(strs[j]);
                    }
                }
                ls1.add(ls2);

            }
            return ls1;

        }
        public static void main(String[] args){
            groupAnagram anagram = new groupAnagram();
            anagram.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        }
}
