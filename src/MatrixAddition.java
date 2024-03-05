public class MatrixAddition {
    public static void main(String[] args) {
        int[][] rows = {{1,3,4},{2,4,3},{3,4,5}};
        int[][] columns = {{1,5,3},{3,4,2},{1,3,4}};

        int[][] sum = new int[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                sum[i][j] = rows[i][j] + columns[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
