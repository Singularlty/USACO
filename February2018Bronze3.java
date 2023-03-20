
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class February2018Bronze3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("taming.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("taming.out")));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int confirmed = 0;
        int unconfirmed = 0;

        for (int i = N-1; i > -1; i--) {
            int current = arr[i];
            if (current != -1 && current != -2) {
                confirmed++;
                for (int j = i; j > i-current-1; j--) {
                    arr[j] = -2;
                }
            }
        }
        if (arr[0] == -1) {
            arr[0] = -2;
            confirmed++;
        }
        for (int i = N-1; i > -1; i--) {
            if (arr[i] == -1) {
                unconfirmed++;
            }
        }

        pw.println(confirmed + " " + (confirmed + unconfirmed));

        pw.close();

        // test case 1
        //        1 0 0 0 1 0 0 1 1 0 0 0 0 0 1
        //        0 1 2 3 0 1 2 0 0 1 2 3 4 5 0

        //        X X X 3 X X 2 X X X X X X 5 0
        //        0 1 2 3 4 5 6 7 8 9 0 1 2 3 4


    }
}
