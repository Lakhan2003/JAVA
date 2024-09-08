import java.util.*;

public class functionMultiply {
    public static int calculateProduct(int a, int b)

    {
        return a * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers a & b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("product of a and b is " + calculateProduct(a, b));

    }

}
