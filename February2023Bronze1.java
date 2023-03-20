// template for USACO programs

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;


public class February2023Bronze1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int lastDay = scanner.nextInt();
        int deliveryBales = scanner.nextInt();

        int currentBales = 0;
        int totalHaybales = 0;
        int eatenBales = 0;

        if (N == 1) {
             currentBales = deliveryBales;
             totalHaybales = deliveryBales;
        }

        for(int i = 1; i < N; i++) {
            int currentDay = scanner.nextInt();
            totalHaybales += deliveryBales;

            //eating bales
            int balesBeforeEating = currentBales + deliveryBales;

            if (i == 1) {
                eatenBales = currentDay - lastDay + 1;
            } else {
                eatenBales = currentDay - lastDay;
            }

            currentBales = balesBeforeEating - eatenBales;
            if (currentBales < 0) {
                currentBales = 0;
            }

            lastDay = currentDay;
            if (currentDay >= T) {
                break;
            }

            deliveryBales = scanner.nextInt();
        }

        currentBales -= T - lastDay;
        if (currentBales < 0) {
            currentBales = 0;
        }
        totalHaybales -= currentBales;

        System.out.println(totalHaybales);
    }

}

