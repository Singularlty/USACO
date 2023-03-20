// solved 11/17

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class December2016Bronze3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("cowsignal.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M =  Integer.parseInt(st.nextToken());
        int N =  Integer.parseInt(st.nextToken());
        int K =  Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            char[] strArr = str.toCharArray();

            String output = "";
            for (int j = 0; j < N; j++){
                for (int l = 0; l < K; l++) {
                    output = output + strArr[j];
                }
            }

            for (int l = 0; l < K; l++){
                pw.println(output);
            }
        }
        pw.close();
    }
}