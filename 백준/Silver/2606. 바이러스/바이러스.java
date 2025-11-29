import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = sc.nextInt();
        int n = sc.nextInt();


        for (int i = 0; i <= com; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new boolean[com + 1];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(1);
        System.out.println(count - 1);
    }

    static void dfs(int c) {
        visited[c] = true;
        count++;

        for (int next : graph.get(c)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}

