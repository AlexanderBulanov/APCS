import java.util.Scanner;

public class BubbleSort {
	public int[] nums;

	public static void populateArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) Math.ceil(Math.random()*nums.length);
		}
	}
	
	public static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	public static void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int temp = nums[i];
			if (nums[i] > nums[i + 1]) {
				nums[i] = nums[i+1];
				nums[i+1] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int elements = scan.nextInt();
		int[] array = new int[elements];
		populateArray(array);
		printArray(array);
	}

}
