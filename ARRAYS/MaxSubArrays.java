public class MaxSubArrays {
    public static void printSubArrays(int numbers[]) {
        int maxSub = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int curr = 0;
                for (int k = i; k <= j; k++) {
                    curr += numbers[k];
                }
                System.out.println(curr);
                if (maxSub < curr) {
                    maxSub = curr;
                }
            }
        }
        System.out.println("maximum subarray is = " + maxSub);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);

    }
}