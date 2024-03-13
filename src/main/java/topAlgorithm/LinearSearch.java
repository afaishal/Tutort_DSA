package topAlgorithm;

public class LinearSearch {
    public int linearSearch(int nums[], int target){
        int count =0;
        while(count< nums.length){
            if(target ==nums[count]){
                return count;
            }
            count++;
        }
        return -1;
    }
    public static void main(String args[]){
        LinearSearch ls = new LinearSearch();
        int index = ls.linearSearch(new int[]{2,3,5,7,9}, 7);
        if(index!=-1){
            System.out.print("The index found is :"+index);
        } else{
            System.out.print("The index found is not found");
        }
    }
}
