// unknown data structure

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class January2013Bronze3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("truth.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("truth.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        //fill first row with -1s
        for (int i = 0; i < N; i++) {
            arr[i][0] = -1;
        }
        //fill second row with 0s
        for (int i = 0; i < N; i++) {
            arr[i][1] = 0;
        }

        // row 0 is whether the cow is a truth teller or liar
        // row 1 is the loop that the cow is in (negative if NOT truth)
        int loops = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Character trueFalse = st.nextToken().charAt(0);


        }

        pw.close();
    }
}


//4 3
//1 4 L
//2 3 T
//4 1 T