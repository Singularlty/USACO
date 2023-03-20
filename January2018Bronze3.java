// unfinished 1/23

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;


public class January2018Bronze3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("outofplace.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("outofplace.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int bessie = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] < arr[i-1]) {
                bessie = i;
                break;
            }
            bessie = i;
        }

        for (int i = bessie; i > 0; i--){

        }

        pw.close();
    }
}



//SAMPLE INPUT:
//6
//2
//4
//7
//7
//9
//3
//SAMPLE OUTPUT:
//3