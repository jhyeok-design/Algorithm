import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int R, C, N;
    static char[][] map;
    static int[] row = {-1, 1, 0, 0};
    static int[] col = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new char[R][C];

        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        if (N == 1) {
            printMap(map);
            return;
        }

        if (N % 2 == 0) {
            printMap(full());
            return;
        }

        char[][] map3second = boom(map);

        char[][] map5second = boom(map3second);

        if (N % 4 == 3) {
            printMap(map3second);
        } else {
            printMap(map5second);
        }
    }

    static void printMap(char[][] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < R; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }

    static char[][] full() {
        char[][] fullBomb = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                fullBomb[i][j] = 'O';
            }
        }
        return fullBomb;
    }

    static char[][] boom(char[][] boomMap) {
        char[][] result = full();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (boomMap[i][j] == 'O') {
                    result[i][j] = '.';
                    for (int k = 0; k < 4; k++) {
                        int ir = i + row[k];
                        int jc = j + col[k];
                        if (ir >= 0 && ir < R && jc >= 0 && jc < C) {
                            result[ir][jc] = '.';
                        }
                    }
                }
            }
        }
        return result;
    }
}