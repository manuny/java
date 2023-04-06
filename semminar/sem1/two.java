package semminar.sem1;

public class two {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 3, 2, 4, 3, 5, 3, 3 };
		int val = 3;

		for (int i = 0; i < nums.length - 1; ++i) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == val) {
					nums[i] = nums[j];
					nums[j] = val;
				}

			}
		}
		for (int i : nums) {
			System.out.printf("%d,", i);
		}
	}
}