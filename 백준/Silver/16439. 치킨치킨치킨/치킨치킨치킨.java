import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] likeChick = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                likeChick[i][j] = sc.nextInt();
            }
        }

        int result = 0;

        for (int a = 0; a < m; a++) {
            for (int b = a + 1; b < m; b++) {
                for (int c = b + 1; c < m; c++) {

                    int sum = 0;
                    for (int d = 0; d < n; d++) {
                        int best = Math.max(likeChick[d][a], Math.max(likeChick[d][b], likeChick[d][c]));
                        sum += best;
                    }

                    result = Math.max(result, sum);
                }
            }
        }
        System.out.println(result);
    }
}
