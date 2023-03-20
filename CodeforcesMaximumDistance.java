
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;


public class CodeforcesMaximumDistance {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];

        int max = 0;

        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            y[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                max =  Math.max(max, (int)(Math.pow(Math.pow(Math.abs(x[i] - x[j]),2) + Math.pow(Math.abs(y[i] - y[j]),2),0.5)));
            }
        }

        System.out.println(max);

    }

}
