public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={4,2,7,5,19,14,3, 1};

        selection_sort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // public static void selection_sort(int[] arr) {
    //     for(int i=0 ; i<arr.length-1 ; i++) {
    //         int min=0;
    //         int index;
    //         for (int j = i; j < arr.length; j++) {
                
    //             if(arr[j] < min){
    //                 min = arr[j];
    //                 index = j;
                    
    //             }
                
    //         }
            
    //     }
    // }


    // public static void selection_sort(int[] arr) {
    //     for(int i=0 ; i<arr.length-1 ; i++) {
    //         int min=i;
            
    //         for (int j = i+1; j < arr.length; j++) {
                
    //             if(arr[min] > arr[j]){
    //                 min = j;
                    
    //             }
                
    //         }

    //         int temp = arr[i];
    //         arr[i] = arr[min];
    //         arr[min] = temp;
            
    //     }
    // }
}
