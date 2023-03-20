//finished 11/20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class February2022Bronze1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(in.readLine());
            String str = in.readLine();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(String.valueOf(str.charAt(j*2)));
                arr[j] = num;
            }

            int check = 0;
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                check = temp;
                check = check + arr[j]; // check = 1
                temp = check;
                int modifications = 0; // mod = 0

                for (int k = 0; k < arr.length; k++){ // k = 1
                    if (arr[k] != check) {
                        modifications++;
                    }
                    check -= arr[k];

                    if (check < 0){
                        break;
                    } else if (check == 0) {
                        check = temp;
                    }
                }
                if (check == temp){
                    System.out.println(modifications);
                    break;
                }

            }

        }


    }
}