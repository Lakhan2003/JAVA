import java.util.*;

public class FunctionsCircleCircumference {
    public static Double getsCircumference(Double r) {
        return 2 * 3.14 * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        Double r = sc.nextDouble();
        System.out.println("circumference of the circle " + getsCircumference(r));
    }
}
