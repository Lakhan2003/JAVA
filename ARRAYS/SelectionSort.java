
public class SelectionSort {
    public static void selectionSort(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int minpos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minpos] > nums[j]) {
                    minpos = j ;
                }
            }
            int temp = nums[minpos];
             nums[minpos] = nums[i];
             nums[i]=temp;

        }
       
    }

    public static void main(String[] args) {
        int nums[] = { 3, 5, 2, 4, 1 };
        selectionSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");

        }
    }
}
