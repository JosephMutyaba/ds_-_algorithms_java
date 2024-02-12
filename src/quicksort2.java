public class quicksort2 {
    public static void main(String[] args) {
        int nums[] = {94,45,9,5,8,4,7,3,6,2,1,0};
        quick_sort_algo(nums, 0, nums.length-1);

        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println();

    }

    private static void quick_sort_algo(int[] nums, int start, int end) {
        if (end <= start) return;

        int pivot = partition(nums, start, end); 
        quick_sort_algo(nums, start, pivot-1);
        quick_sort_algo(nums, pivot+1, end);
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];

        int i = start-1;
        for (int j = start; j < end; j++) {
            if(nums[j]<pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        i++;
        int temp = nums[i];
        nums[i] = nums[end];
        nums[end] = temp;

        return i;
    }
}
