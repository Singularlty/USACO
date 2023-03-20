// template for USACO programs

import java.io.*;
import java.util.*;
public class January2017Bronze3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("cowtip.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowtip.out")));

        int n = Integer.parseInt(br.readLine());

        char[][] grid = new char[n][n];


        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }

        int count = 0;
        for(int i = n-1; i >= 0; i--) {
            for(int j = n-1; j >= 0; j--) {
                if(grid[i][j] == '1') {
                    count++;
                    for(int a = 0; a <= i; a++) {
                        for(int b = 0; b <= j; b++) {
                            if(grid[a][b] == '1') {
                                grid[a][b] = '0';
                            }
                            else {
                                grid[a][b] = '1';
                            }
                        }
                    }
                }
            }
        }

        // print the answer
        pw.println(count);

        // close the file
        pw.close();
    }
}