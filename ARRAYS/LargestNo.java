public class LargestNo {
    public static void largestNumber(int numbers[]) {
        int Largest = Integer.MIN_VALUE; // - infinity
        for (int i = 0; i < numbers.length; i++) {
            if (Largest < numbers[i]) {
                Largest = numbers[i];
            }
        }
        System.out.println("largest no is = " + Largest);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 3, 6, 5, 8 , 12   };
        largestNumber(numbers);

    }

}
