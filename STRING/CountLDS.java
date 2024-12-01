import java.util.*;

public class CountLDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = sc.nextLine();
        int letter = 0, symbol = 0, digit = 0;
        for (int i = 0; i < str.length(); i++) {
            int r = (int) str.charAt(i);
            if ((r >= 65 && r <= 90) || (r >= 97 && r <= 122)) {
                letter++;
            } else if (r >= 48 && r <= 57) {
                digit++;
            } else {
                symbol++;
            }
        }
        System.out.println(letter);
        System.out.println(symbol);
        System.out.println(digit);
    }
}
