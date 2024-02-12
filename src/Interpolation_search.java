public class Interpolation_search {
    //this is an improvement over binary search
    //They work very well with uniformly distributed datasets
    public static void main(String[] args) {
        // int arr1[] = {1,2,3,4,5,6,7,8};
        // int arr2[] = {2,4,6,8,10,12,14,16,18,20,22,24,25,26,28,30,31,32};
        int arr3[] = {12,24,28,30,31,32,36,37,39,41,43,44,47,48,70};

        // int [] arr4 = new int[1000000];
        // for (int i = 0; i < 1000000; i++) {
        //     // if (i%2==0) {
        //     //     arr4[i] = i;
        //     // }
        //     arr4[i] =i*2;
        // }
        // System.out.println(arr4);
        int index = interpolation_search(arr3,70);

        if (index == -1) {
            System.out.println("Element was not found");
        }else{
            System.out.println("Element found at index " + index);
        }
    }

    private static int interpolation_search(int[] arr, int value) {
        int low =0;
        int high = arr.length-1;

        while (value >=arr[low] && value <= arr[high] && low <= high) {
            int probe = low + (high - low) * (value - arr[low])/(arr[high] - arr[low]);
            System.out.println("probe: " + probe);
            if (arr[probe]==value) {
                return probe;
            } else if(arr[probe]<value) {
                low = probe+1;
            }else{
                high = probe-1;
            }
        }

        return -1;
    }
}
