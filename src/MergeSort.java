public class MergeSort {
    public static void main(String[] args) {
        int nums[] = {94,45,9,5,8,4,7,3,6,2,1,0};

        merge_sort(nums);

        for(int i: nums) {
            System.out.print(i+" ");
        }
        System.out.println("\n\n");
    }

   
    private static void merge_sort(int[] nums) {
        int lenth = nums.length;
        if (lenth<=1) {
            return;
        }
        int mid=lenth/2;
        int lleftSize = mid;
        int rightSize = lenth - mid;
        int leftArray[]=new int[lleftSize]; 
        int rightArray[]=new int[rightSize];
        int i=0; int j=0;
        for (; i < lenth; i++) {
            if(i<lleftSize){
                leftArray[i]=nums[i];
                //i++;
            }else{
                rightArray[j]=nums[i];
                j++;
            }
        }
        merge_sort(leftArray);
        merge_sort(rightArray);
        merge(leftArray, rightArray, nums);
        

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] nums) {
        int i=0, l=0, r=0;
        while(l<leftArray.length && r<rightArray.length) {
            if(leftArray[l]<rightArray[r]) {
                nums[i]=leftArray[l];
                l++;
            }else{
                nums[i]=rightArray[r];
                r++;
            }
            i++;
        }
        while(l<leftArray.length) {
            nums[i]=leftArray[l];
            l++;
            i++;
        }
        while(r<rightArray.length) {
            nums[i]=rightArray[r];
            r++;
            i++;
        }
    }

       
}
