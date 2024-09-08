import java.util.*;

public class functionsSumOdd {
    public static int getsOddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a,b,c");
        int n = sc.nextInt();
        System.out.println("sum of odd numbers " + getsOddSum(n));
    }
}
