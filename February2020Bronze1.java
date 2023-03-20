// finished 1/1/23 10/10 test cases

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;


public class February2020Bronze1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("triangles.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("triangles.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int maxArea = 0;
        for (int i = 0; i < N; i++){
            int x = arr[i][0];
            int y = arr[i][1];

            int maxXDifference = 0;
            int maxYDifference = 0;

            for (int j = 0; j < N; j++){
                if (Math.abs(arr[j][0] - x) > maxXDifference && arr[j][1] == y){
                    maxXDifference = Math.abs(arr[j][0] - x);
                }
                if (Math.abs(arr[j][1] - y) > maxYDifference && arr[j][0] == x){
                    maxYDifference = Math.abs(arr[j][1] - y);
                }
            }
            if (maxXDifference * maxYDifference > maxArea){
                maxArea = maxXDifference * maxYDifference;
            }
        }

        pw.println(maxArea);
        pw.close();
    }
}

