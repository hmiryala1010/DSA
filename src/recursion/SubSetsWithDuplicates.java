package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsWithDuplicates {

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		findSubSets(0, nums, new ArrayList<>(), res);
		return res;
	}

	void findSubSets(int ind, int[] nums, List<Integer> ds, List<List<Integer>> res) {
		res.add(new ArrayList<>(ds));
		for (int i = ind; i < nums.length; i++) {
			if (i != ind && nums[i] == nums[i - 1])
				continue;
			ds.add(nums[i]);
			findSubSets(i + 1, nums, ds, res);
			ds.remove(ds.size() - 1);

		}

	}
}