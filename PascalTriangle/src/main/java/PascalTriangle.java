public class PascalTriangle {
	public static int getPascalNumberAtColumnAndRow(int c, int r) {
		if (c < 0 || c > r) {
			return -1;
		}
		int[][] pascalTriangle = new int[r + 1][r + 1];
		for (int i = 0; i <= r; i++) {
			pascalTriangle[i][0] = 1;
			pascalTriangle[i][i] = 1;
		}
		for (int i = 2; i <= r; i++) {
			for (int j = 1; j < i; j++) {
				pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
			}
		}
		return pascalTriangle[r][c];
	}

	public static void main(String[] args) {

		System.out.println(getPascalNumberAtColumnAndRow(1, 3));
	}
}
