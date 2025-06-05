package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		findCombinations(0, target, candidates, res, new ArrayList<>());
		return res;
	}

	void findCombinations(int ind, int target, int[] candidates, List<List<Integer>> res, List<Integer> ds) {
		if (ind == candidates.length) {
			if (target == 0)
				res.add(new ArrayList<>(ds));
			return;
		}
		if (candidates[ind] <= target) {
			ds.add(candidates[ind]);
			findCombinations(ind, target - candidates[ind], candidates, res, ds);
			ds.remove(ds.size() - 1);
		}
		findCombinations(ind + 1, target, candidates, res, ds);

	}
}