public class Bubble_sort {
    public static void main(String[] args) {
        int arr1[] = {7,4,9,3,23,5,1};
        bubble_sort(arr1);
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] <arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            } 
        }
    }
}
