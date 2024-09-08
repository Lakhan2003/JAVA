import java.util.*;
 public class Average
 {
    public static int getsAverage(int a, int b, int c) {
        int Average = (a + b + c) / 3;
        return Average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("avearge is " + getsAverage(2, 3, 6));
    }
}
