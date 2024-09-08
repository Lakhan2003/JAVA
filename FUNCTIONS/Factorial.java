
import java.util.*;

public class Factorial {

    public static int solution(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter factorial n ");
        int n = sc.nextInt();
        System.out.println("factrial of " + n  " is " + solution(n));

    }

}
