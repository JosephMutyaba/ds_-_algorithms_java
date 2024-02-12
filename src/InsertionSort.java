public class InsertionSort {
    public static void main(String[] args) {
        int randNums[] = {99,45,43, 41,12,13,1,4,19};
        insertion_sort(randNums);

        for (int i : randNums) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void insertion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j =i-1;

            while (j>=0 && arr[j] >temp) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;

            // for (int j = i-1; j >= 0; j--) {
            //     if (arr[j] > temp) {
            //         arr[j+1] = arr[j];
            //     } else {
            //         arr[j+1] = temp;
            //         break;
            //     }              
            // }
            
        }
    }
}
