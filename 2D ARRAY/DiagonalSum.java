package Arrays;

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]) {
        int Sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    Sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    Sum += matrix[i][j];
                }
            }
        }
        return Sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(diagonalSum(matrix));
    }
}