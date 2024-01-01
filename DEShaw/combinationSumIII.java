class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        rec(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    public void rec(int i, int k, int n, List<Integer> curr, List<List<Integer>> ans){
        if(n == 0 && k == 0){
            ans.add(curr);
            return;
        }
        if(i > 9) return;
        if(n < 0 || k < 0) return;

        List<Integer> temp = new ArrayList<>(curr);
        temp.add(i);
        rec(i + 1, k - 1, n - i, temp, ans);

        rec(i + 1, k, n, curr, ans);
    }
}
