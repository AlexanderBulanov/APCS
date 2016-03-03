//Alexander Bulanov;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RandomSort extends SortingTools{
	int[] array;
	static double totalTime = 0;
	static double avgTime;

	public static void randomSwap(int[] nums) {
		int rand1 = (int) (Math.random() * nums.length);
		int rand2 = (int) (Math.random() * nums.length);
		int temp = nums[rand1];
		nums[rand1] = nums[rand2];
		nums[rand2] = temp;
	}	

	public static void randomSort(int[] nums) {
		while (!isSorted(nums)) {
			randomSwap(nums);
		}
	}

	public static void preSort(int[] nums) {
		System.out.println("preSort");
	}

	public static void main(String[] args) {
		DecimalFormat numberFormat = new DecimalFormat("#.000000");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the desired size of the array");
		int size = s.nextInt();
		System.out.println("How many arrays of the above size do you want to be sorted?");
		int runs = s.nextInt();
		if (runs <= 10 && size <= 10) {
			System.out.println("Using maximum detail mode...");
			System.out.println();
			for (int i = 0; i < runs; i++) { //Maximum details, good for displaying info for small number of runs
				System.out.println("Array #" + (i+1));
				int[] array = buildIntArray(size);
				printArray(array);
				long startTime = System.nanoTime();
				randomSort(array);
				long endTime = System.nanoTime();
				double elapsedTime = (endTime - startTime)/1000000000.0; //Unrounded elapsedTime
				totalTime = totalTime + elapsedTime;
				printArray(array);
				System.out.println("Sorting took " + numberFormat.format(elapsedTime) + " s"); //elapsedTime rounded for display purposes
				System.out.println();
			}
		} else {
			System.out.println("Using minimal detail mode...");
			System.out.println();
			for (int i = 0; i < runs; i++) { //Minimal details, good for displaying average sorting time
				int[] array = buildIntArray(size);
				long startTime = System.nanoTime();
				randomSort(array);
				long endTime = System.nanoTime();
				double elapsedTime = (endTime - startTime)/1000000000.0; //Unrounded elapsedTime
				totalTime = totalTime + elapsedTime;
			}
		}
		avgTime = totalTime/(double) runs;
		System.out.println("On average, sorting took " + numberFormat.format(avgTime) + " s"); //elapsedTime rounded for display purposes
	}

}
