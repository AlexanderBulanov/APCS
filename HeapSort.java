//Alexander Bulanov, Adam Barszczak
import java.util.Scanner;

public class HeapSort extends SortingTools {
	int[] array;

	public static void buildHeap(int[] nums) {
		
	}

	public static void sortHeap(int[] nums) {
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int[] array = buildIntArray(input);
		buildHeap(array);
		sortHeap(array);
	}

}
