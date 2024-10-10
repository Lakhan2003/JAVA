public class PairNo {
    public static void pairNumber(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("( " + current + "," + numbers[j] + " )");
                tp++;
            }
            System.out.println();
        }
    System.out.println("total pairs is = "+tp); //total no. of pairs also by AP formluae
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairNumber(numbers);

    }
}
