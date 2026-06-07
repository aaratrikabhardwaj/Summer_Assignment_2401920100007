class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int lr = 0, ur = matrix.length - 1;
        int lc = 0, uc = matrix[0].length - 1;

        while (lr <= ur && lc <= uc) {

            for (int j = lc; j <= uc; j++) {
                list.add(matrix[lr][j]);
            }
            lr++;
            for (int i = lr; i <= ur; i++) {
                list.add(matrix[i][uc]);
            }
            uc--;
            if (lr <= ur) {
                for (int j = uc; j >= lc; j--) {
                    list.add(matrix[ur][j]);
                }
                ur--;
            }
            if (lc <= uc) {
                for (int i = ur; i >= lr; i--) {
                    list.add(matrix[i][lc]);
                }
                lc++;
            }
        }

        return list;
    }
}
