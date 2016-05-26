import java.text.DecimalFormat;
import java.util.Scanner;

public class BubbleSort extends SortingTools {
	public int[] nums;

	public static void swap(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int temp = nums[i];
			if (nums[i] > nums[i + 1]) {
				nums[i] = nums[i+1];
				nums[i+1] = temp;
			}
		}
	}

	public static void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			swap(nums);
		}
	}

	public static void main(String[] args) {
		DecimalFormat numberFormat = new DecimalFormat("#.000000");
		Scanner scan = new Scanner(System.in);
		int elements = scan.nextInt();
		int[] array = buildIntArray(elements);
		printArray(array);
		long startTime = System.nanoTime();
		bubbleSort(array);
		long endTime = System.nanoTime();
		double elapsedTime = (endTime - startTime)/1000000000.0;
		printArray(array);
		System.out.println("Sorting took " + numberFormat.format(elapsedTime) + " s"); //elapsedTime rounded for display purposes
		System.out.println();
	}

}
