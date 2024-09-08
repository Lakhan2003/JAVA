
// 
import java.util.*;

public class BinCoeff {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binoCoeff ( int n,int r){
        factorial(n);
        factorial(r);
        factorial(n-r);

        int binoCoeff = factorial(n)/(factorial(r)*factorial(n-r));

        return binoCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(binoCoeff(5, 2));

    }

}