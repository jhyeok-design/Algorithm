import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n == 0){
            System.out.println(0);
            return;
        }

        if (n == 1){
            System.out.println(1);
            return;
        }

        long[] fb = new long[n + 1];
        fb[0] = 0;
        fb[1] = 1;
        for (int i = 2; i <= n; i++){
            fb[i] = fb[i-1] + fb[i-2];
        }

        System.out.println(fb[n]);
    }
}
