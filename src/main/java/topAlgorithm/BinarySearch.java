package topAlgorithm;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        int mid = (start+end)/2;

        if(target==nums[mid]){
            return mid;
        }
        else if()

    }
    public static void main(String[] args){
        BinarySearch binarySearch = new BinarySearch();
        int num = binarySearch.search(new int[]{-1,0,3,5,9,12},9 );
    }
}
