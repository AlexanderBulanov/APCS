//Alexander Bulanov, Adam Barszczak
import java.util.Scanner;

public class BubbleSort extends SortingTools{

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
		Scanner scan = new Scanner(System.in);
		int elements = scan.nextInt();
		int[] array = new int[elements];
		populateArray(array);
		printArray(array);
		System.out.println();
		bubbleSort(array);
		printArray(array);
	}

}
