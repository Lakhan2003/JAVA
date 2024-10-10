public class SearchIndexNo {
    public static int LinearNumbers(int Numbers[], int key) {
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int Numbers[] = { 2, 3, 4, 5, 6, 7, 8 };
        int key = 4;
        int index = LinearNumbers(Numbers, key);
        if (index == -1) {
            System.out.println("  wrong no ");
        } else {
            System.out.println("index no is = " + index);
        }
    }
}