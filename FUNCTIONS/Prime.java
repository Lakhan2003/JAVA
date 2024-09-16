import java.util.*;

public class Prime {
    public static String isPrime(int n) {
        String a = "notprime";
        String b = "prime";
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                ;
            return a;
        }
        return b  ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter no.");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

}
