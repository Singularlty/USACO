import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.HashMap;
import java.util.Scanner;

public class Open2022Bronze2 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int highest = 0;
        int lowest = 99999999;

        Integer[] cows = new Integer[N];
        for (int i = 0; i < N; i++) {

            String cow =  in.readLine();
            String[] split = cow.split(" ");

            String str = split[0];
            int num = Integer.parseInt(split[1]);

            if (str == "G"){
                cows[i] = num;
            } else {
                cows[i] = num * -1;
            }

            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }

        }

        Integer[] arr = new Integer[highest - lowest + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

    for(int i = 0; i < cows.length; i++) {  //3 5
        char dir; //L
        if (cows[i] > 0) {
            int num = cows[i];
            dir = 'G';

            for (int j = num-lowest; j < arr.length; j++) {
                arr[j]++;
            }
        } else {
            int num = cows[i] * -1; //5
            dir = 'L';

            for (int j = num-lowest; j > -1; j--) {
                arr[j]++;
            }
        }
    }
    int biggestOverlap = 0;
        for(int i = 0; i < arr.length; i++){

        if (arr[i] > biggestOverlap) {
            biggestOverlap = arr[i];
        }
    }

        System.out.println(N - biggestOverlap);

        // y > 3

        //        G 3
        //        L 5
        //        L 1
    //
    //        G 3
    //        G 4
    //        L 5
      //        L 10
    //
    //        G 3
    //        L 2
        //
    //

    }
}