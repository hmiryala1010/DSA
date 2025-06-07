package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutations2 {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		findPermutations(0, nums, ans);
		return ans;
	}

	void findPermutations(int index, int[] nums, List<List<Integer>> ans) {
		if (index == nums.length) {
			List<Integer> ds = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				ds.add(nums[i]);
			}
			ans.add(ds);
			return;
		}
		for (int i = index; i < nums.length; i++) {
			swap(index, i, nums);
			findPermutations(index + 1, nums, ans);
			swap(index, i, nums);
		}
	}

	void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}