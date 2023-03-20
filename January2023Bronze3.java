// solved 10/10 1/29

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;


public class January2023Bronze3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int Q = scanner.nextInt();

        for (int i = 0; i < Q; i++){
            String str = scanner.next();
            char[] arr = str.toCharArray();
            int best = -1;

            // best
            // -1 = OMO - no solution
            // 0 = OOM - both wrong
            // 1 = MOM / OOO - 1 right, one wrong
            //2 = MOO - both right

            if (arr.length < 3) {
                System.out.println(-1);
                continue;
            }

            for (int j = 1; j < arr.length-1; j++){
                if (arr[j] == 'O'){
                    if (arr[j-1] == 'M' && arr[j+1] == 'O'){ // both right
                        best = 0; break;
                    }
                    else if (arr[j-1] == 'O' && arr[j+1] == 'M'){ // both wrong
                        if(best == -1) {best = 2;}
                    }
                    else { // 1 right, 1 wrong
                        if(best != 1) {best = 1;}
                    }
                }
            }

            if (best == -1) { // no solution
                System.out.println(-1);
                continue;
            }

            System.out.println(arr.length - 3 + best);
        }

    }
}