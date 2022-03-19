class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0, down = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        int action = 0;

        while (top <= down && left <= right) {
            if (action == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                action++;
                top++;
            } else if (action == 1) {
                for (int i = top; i <= down; i++) {
                    list.add(matrix[i][right]);
                }
                action++;
                right--;
            } else if (action == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[down][i]);
                }
                action++;
                down--;
            } else if (action == 3) {
                for (int i = down; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                action++;
                left++;
            }
            action %= 4;
        }

        return list;
    }
}