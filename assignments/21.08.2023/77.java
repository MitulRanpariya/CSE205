class Solution {
   public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();
        combination(1, n, k, result, new ArrayList<>());
        return result;
    }

    static void combination(int b, int n, int k, List<List<Integer>> result, ArrayList<Integer> l) {
        if (l.size() == k) {
            result.add(new ArrayList<>(l));
            return;
        } else {

            for (int a = b; a <= n; a++) {
                l.add(a);
                combination(b + 1, n, k, result, l);
                l.remove(l.size() - 1);

            }
        }

    }

    
}