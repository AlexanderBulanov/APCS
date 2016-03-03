//Alexander Bulanov, Adam Barszczak
import java.util.Scanner;

public class SortingTools {
	
	public static int[] buildIntArray(int nums) {
		int[] array = new int[nums];
		populateArray(array);
		return array;
	}

	public static void populateArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) Math.ceil(Math.random()*nums.length);
		}
	}

	public static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	public static boolean isSorted(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i+1]) {
				return false;
			}
		}
		return true;
	}
	
}
