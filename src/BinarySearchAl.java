public class BinarySearchAl {
    public static void main(String[] args) {
        int [] array2 = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            array2[i] = i;
        }

        int arr3[] = {12,24,28,30,31,32,36,37,39,41,43,44,47,48};

        int index = bin_search(arr3, 77777);

        if (index == -1) {
            System.out.println("Item could not be found in the array");
            
        }else{
            System.out.println("Item found at index: " + index);
        }
    }

    public static int bin_search(int[] array, int target) {
        int low=0;
        int high= (array.length)-1;
        // int mid =0;
        while (low <= high) {
            int mid= low + (high-low) / 2;

            System.out.println("Middle Value: "+mid);

            if (array[mid]==target) {
                return mid;
            } else if(array[mid]<target) {
                // high = mid;
                low = mid+1;
            }else{
                // low = mid;
                high = mid-1;
            }
        }

        return -1;

    }


}
