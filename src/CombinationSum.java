import java.util.*;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();

        if (candidates == null || candidates.length == 0) {
            return results;
        }

        Arrays.sort(candidates);

        List<Integer> combination = new ArrayList<>();
        toFindCombinationsToTarget(results, combination, candidates, target, 0);

        return results;
    }

    private void toFindCombinationsToTarget(List<List<Integer>> results, List<Integer> combination, int[] candidates, int target, int startIndex) {
        if (target == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }

            combination.add(candidates[i]);
            toFindCombinationsToTarget(results, combination, candidates, target - candidates[i], i);
            combination.remove(combination.size() - 1);
        }
    }


    public static void main(String[] args) {
        CombinationSum combosum = new CombinationSum();
        List<List<Integer>> result = combosum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        result.forEach(System.out::println);


    }
}
