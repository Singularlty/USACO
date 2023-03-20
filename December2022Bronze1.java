//// solved 12/18
//
//import java.io.*;
//import java.util.Collections;
//import java.util.StringTokenizer;
//import java.util.Arrays;
//
//public class December2022Bronze1 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//
//        int N =  Integer.parseInt(in.readLine());
//        StringTokenizer st = new StringTokenizer(in.readLine());
//
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        Arrays.sort(arr);
//        //reverse array
//        for (int i = 0; i < N / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[N - i - 1];
//            arr[N - i - 1] = temp;
//        }
//
//        int tuition = 0;
//        int money = 0;
//        for (int i = 0; i < N; i++) {
//            int gain = (i+1)*arr[i];
//
//            if (gain >= money){
//                money = gain;
//                tuition = arr[i];
//            }
//
//
//        }
//        //6 6 4 1
//
//        System.out.println(money + " " + tuition);
//
//    }
//}

import java.util.Arrays;
import java.util.Scanner;

public class December2022Bronze1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        Arrays.sort(c);

        long maxMoney = 0;
        int optimalTuition = 0;

        for (int i = 0; i < n; i++) {
            long money = (long) c[i] * (n - i);

            if (money > maxMoney) {
                maxMoney = money;
                optimalTuition = c[i];
            }
        }

        System.out.println(maxMoney + " " + optimalTuition);
    }
}
