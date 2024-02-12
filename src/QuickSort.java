public class QuickSort {
    public static void main(String[] args) {
        System.out.println();
        int nums[] = {94,45,9,5,8,4,7,3,6,2,1,0};
        // int[] nums = {12, 4, 5, 6, 7, 3, 1, 15};

        quick_sort(nums, 0, nums.length-1);

        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }

    private static void quick_sort(int[] nums, int start, int end) {
        if(end <= start) return;

        int pivot = partition(nums, start, end);
        quick_sort(nums, start, pivot-1);
        quick_sort(nums, pivot+1, end);
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];

        int i= start-1;
        for (int j = start; j < end; j++) {
            if (nums[j]<pivot) {
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
