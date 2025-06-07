package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutations1 {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		boolean[] freq = new boolean[nums.length];
		findPermutations(nums, ds, ans, freq);
		return ans;
	}

	void findPermutations(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
		if (ds.size() == nums.length) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!freq[i]) {
				freq[i] = true;
				ds.add(nums[i]);
				findPermutations(nums, ds, ans, freq);
				ds.remove(ds.size() - 1);
				freq[i] = false;
			}
		}
	}
}