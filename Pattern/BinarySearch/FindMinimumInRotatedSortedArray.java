package Pattern.BinarySearch;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;  // not mid - 1, because mid could be the min
            }
        }

        return nums[start]; // start == end here
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 0, 1, 2, 3};
        FindMinimumInRotatedSortedArray obj = new FindMinimumInRotatedSortedArray();
        System.out.println(obj.findMin(arr));  // Output: 0
    }
}
