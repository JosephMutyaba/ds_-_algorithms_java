public class mergeSortPrac2 {
    public static void main(String[] args) {

        System.out.println();
        int nums[] = {94,45,9,5,8,4,7,3,6,2,1,0};
        merge_Sort_algorithm(nums);
        
        for (int iterable : nums) {
            System.out.print(iterable + " ");
        }
        System.out.println("\n");
    }

    private static void merge_Sort_algorithm(int[] nums) {
        int length = nums.length;
        if (length<=1) {
            return;
        }
        int middle = length/2; 
        int leftSize = middle;
        int rightSize = length - middle;

        int leftsideArray[] = new int[leftSize];
        int rightsideArray[] = new int[rightSize];

        int i=0, j=0; // indices for left and right arrays respectively

        for (; i < length; i++) {
            if(i<leftSize){
                leftsideArray[i] = nums[i];
            }else{
                rightsideArray[j]= nums[i];
                j++;
            }
        }
        merge_Sort_algorithm(leftsideArray);
        merge_Sort_algorithm(rightsideArray);

        mergeHelper(leftsideArray, rightsideArray, nums);
    }

    private static void mergeHelper(int[] leftsideArray, int[] rightsideArray, int[] nums) {
        int l=0, r=0, i=0;

        while(l<leftsideArray.length && r<rightsideArray.length){
            if(leftsideArray[l] < rightsideArray[r]){
                nums[i] = leftsideArray[l];
                i++;
                l++;
            }else{
                nums[i] = rightsideArray[r];
                r++;
                i++;
            }
        }

        while(l<leftsideArray.length){
            nums[i] = leftsideArray[l];
            l++;
            i++;
        }

        while(r<rightsideArray.length){
            nums[i] = rightsideArray[r];
            r++;
            i++;
        }
    }
}
