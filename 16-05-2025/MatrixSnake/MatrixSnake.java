class MatrixSnake {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int n = matrix.length;
        int m = matrix[0].length;
        
        // Print all diagonals starting from top-left
        for (int sum = 0; sum < n + m - 1; sum++) {
            if (sum % 2 == 0) { // Even sum means moving down-left
                for (int i = Math.min(sum, n - 1); i >= 0 && sum - i < m; i--) {
                    System.out.print(matrix[i][sum - i] + " ");
                }
            } else { // Odd sum means moving up-right
                for (int i = Math.max(0, sum - m + 1); i <= Math.min(sum, n - 1); i++) {
                    System.out.print(matrix[i][sum - i] + " ");
                }
            }
        }
        
        System.out.println("\nEnd of the matrix snake traversal");
    }
}
