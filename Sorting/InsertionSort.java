//Adam Barszczak and Alexander Bulanov

public class InsertionSort extends SortingTools{
	public static void insertionSort(int[] nums){
		for(int i = 1; i < nums.length; i++){
			for(int j = i; j > 0; j--){
				if(nums[j] < nums[j-1]){
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}
	}
	
	public static void main (String[] args){
		int[] x = buildIntArray(100);
		printArray(x);
		insertionSort(x);
		printArray(x);
		System.out.println(isSorted(x));
	}
}
