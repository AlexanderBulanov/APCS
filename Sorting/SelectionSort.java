// Adam Barszczak and Alexander Bulanov

public class SelectionSort extends SortingTools{
	
	public static int select(int[] nums, int j){
		int temp = 0;
		for (int i = 1; i <= j; i++){
			if (nums[temp] < nums[i]){
				temp = i;
			}
		}
		return temp;
	}
	
	public static void selectionSort(int[] nums){
		for (int i = nums.length-1; i >= 0; i--){
			int position = select(nums, i);
			int temp = nums[i];
			nums[i] = nums[position];
			nums[position] = temp;
		}
	}
	
	public static void main (String[] args){
		int[] x;
		x = buildIntArray(10000);
		printArray(x);
		//System.out.println(select(x, 5));
		selectionSort(x);
		printArray(x);
		System.out.println(isSorted(x));
	}
}

