import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> cranes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            cranes.add(sc.nextInt());
        }

        int M = sc.nextInt();
        List<Integer> boxes = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            boxes.add(sc.nextInt());
        }

        cranes.sort(Collections.reverseOrder());
        boxes.sort(Collections.reverseOrder());

        if (boxes.get(0) > cranes.get(0)) {
            System.out.println(-1);
            return;
        }

        int count = 0;

        while (!boxes.isEmpty()) {
            int boxIndex = 0;
            for (int i = 0; i < N; i++) {
                if (boxIndex >= boxes.size()) break;


                if (cranes.get(i) >= boxes.get(boxIndex)) {
                    boxes.remove(boxIndex);   
                } else {
                    boxIndex++;               
                    i--;                     
                }
            }
            count++;
        }

        System.out.println(count);
    }
}

