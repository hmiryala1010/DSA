package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(candidates);
		findCombinations(0, candidates, target, res, new ArrayList<>());
		return res;
	}

	private void findCombinations(int ind, int[] candidates, int target, List<List<Integer>> res, List<Integer> ds) {
		if (target == 0) {
			res.add(new ArrayList<>(ds));
			return;
		}

		for (int i = ind; i < candidates.length; i++) {
			if (i > ind && candidates[i] == candidates[i - 1])
				continue;
			if (candidates[i] > target)
				break;

			ds.add(candidates[i]);
			findCombinations(i + 1, candidates, target - candidates[i], res, ds);
			ds.remove(ds.size() - 1);
		}
	}
}
