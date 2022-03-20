class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> li = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    li.add(1);
                } else {
                    List<Integer> prev = list.get(i - 1);
                    li.add(prev.get(j) + prev.get(j - 1));
                }
            }
            list.add(li);
        }

        return list;
    }
}