// solved 1/2/23 10/10 test cases

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;


public class February2017Bronze2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("circlecross.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("circlecross.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        char[] circle = str.toCharArray();

        int count = 0;

        for (int i = 0; i < circle.length; i++) {
            int[] alphabet = new int[26];
            // 0 = not seen
            // 1 = open line
            // 2 = closed line
            // -1 = already finished checking over

            int currentCheck = i+1;
            int openLines = 0;
            if (currentCheck == 52) {
                currentCheck = 0;
            }
            while (circle[currentCheck] != circle[i]){
                int characterNum = (int) circle[currentCheck] - 65;

                if (alphabet[characterNum] == 0) {
                    openLines++;
                    alphabet[characterNum] = 1;
                } else if (alphabet[characterNum] == 1) {
                    openLines--;
                    alphabet[characterNum] = 2;
                }
                currentCheck++;
                if (currentCheck == 52) {
                    currentCheck = 0;
                }
            }
            count += openLines;
        }
        count /= 4;
        pw.println(count);
        pw.close();

    }
}
