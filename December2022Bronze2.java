import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class December2022Bronze2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTestCases = scanner.nextInt();

        for (int t = 0; t < numTestCases; t++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String cows = scanner.next();
            char[] arr = cows.toCharArray();

            // create an array to store the patches
            char[] patches = new char[n];
            Arrays.fill(patches, '.');

            int count = 0;

            //g pass

            for (int j = 0 ; j < n; j++){
                if (arr[j] == 'G') {
                    if (j+k+1 >= arr.length) {
                        patches[arr.length-1] = 'G';
                        count++;
                        break;
                    } else {
                        patches[j + k] = 'G';
                        j += 2 * k;
                    }
                    count++;
                }
            }

            //h pass

            for (int j = 0 ; j < n; j++){
                if (arr[j] == 'H') {
                    if (j + k + 1>= arr.length) {
                        if (patches[arr.length - 1] == 'G'){
                            patches[arr.length-2] = 'H';
                        }else {
                            patches[arr.length - 1] = 'H';
                        }
                        count++;
                        break;
                    }
                    if (patches[j + k] == 'G') {
                        patches[j + k - 1] = 'H';
                        j += 2 * k - 1;
                    } else {
                        patches[j + k] = 'H';
                        j += 2 * k;
                    }
                    count++;
                }
            }

            System.out.println(count);
            System.out.println(patches);


        }

    }
}

