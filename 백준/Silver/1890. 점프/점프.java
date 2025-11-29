
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] game = new int[n][n];
        long[][] way = new long[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                game[i][j] = sc.nextInt();
            }
        }

        way[0][0] = 1;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){

                if (game[i][j] == 0) continue;

                if (i == n -1 && j == n -1) continue;

                int jump = game[i][j];

                if (j + jump < n){
                    way[i][j + jump] += way[i][j];
                }

                if (i + jump < n){
                    way[i + jump][j] += way[i][j];
                }
            }
        }

        System.out.println(way[n-1][n-1]);
    }
}
