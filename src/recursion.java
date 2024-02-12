public class recursion {
    public static void main(String[] args) {
        // walk(10);
        // recursive_walk(5);
        // System.out.println(power_recursive(5, 4));
        // System.out.println(factorial(5));
        System.out.println(sumOfDigitsInANumber(129)); 
    }

    // private static void walk(int i) {
    //     for (int index = 0; index < i; index++) {
    //         System.out.println("Walking " + index );
    //     }
    // }

    public static void recursive_walk(int num){
        if(num<1) return;
        System.out.println("Walking " + num );
        recursive_walk(num-1);
    }

    public static int power_recursive(int base, int power) {
        if(power==0) return 1;
        return base * power_recursive(base, power-1);
    }

    public static int factorial(int num) {
        if(num==0) return 1;
        return num * factorial(num-1);
    }

    public static int sumOfDigitsInANumber(int num) {
        if(num<10) return num;
        return num%10 + sumOfDigitsInANumber(num/10);

    }
}
