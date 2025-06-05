package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetSum1 {

    public List<Integer> SubSetSum(int[] arr) {
        List<Integer> res = new ArrayList<>();
        findSubSetSum(0, 0, arr, arr.length, res);
        Collections.sort(res);  
        return res;
    }

    private void findSubSetSum(int ind, int sum, int[] arr, int n, List<Integer> res) {
        if (ind == n) {
            res.add(sum);
            return;
        }
        findSubSetSum(ind + 1, sum + arr[ind], arr, n, res);  
        findSubSetSum(ind + 1, sum, arr, n, res);           
    }

    public static void main(String[] args) {
        SubSetSum1 obj = new SubSetSum1();
        int[] arr = {1, 2, 3};
        List<Integer> result = obj.SubSetSum(arr);
        System.out.println(result);       }
}
