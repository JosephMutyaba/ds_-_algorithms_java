public class linear_search {
    public static void main(String[] args) {
        int[] array1 = {45,23,55,435,22,64,1,5};

        int index= linear_search_algorithm(array1, 435);

        if (index == -1) {
            System.out.println("The value was not found");
            
        } else {
            System.out.println("Index: " + index);
        }

    }

    private static int linear_search_algorithm(int[] array, int target) {
        for (int j = 0; j < array.length; j++){
            if (array[j] == target) return j;
        }
        return -1;
    }
    
}
