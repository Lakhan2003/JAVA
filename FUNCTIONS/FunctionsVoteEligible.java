import java.util.*;

public class FunctionsVoteEligible {
    public static boolean getsVoteEligible(int age) { // boolean kyuki return m true false krr rhe h
        if (age > 18) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter age");
        int age = sc.nextInt();
        System.out.println(getsVoteEligible(age));

    }

}
