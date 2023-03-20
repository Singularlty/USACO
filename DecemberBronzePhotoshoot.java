import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DecemberBronzePhotoshoot {

    public static void main(String[]args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        char[] cows = in.readLine().toCharArray();

        int reversals = 0;
        for (int j = N - 2; j >= 0; j -= 2) {
            if (cows[j] != cows[j + 1] && (cows[j] == 'G') == (reversals % 2 == 0)) {
                reversals++;
            }
        }
        System.out.println(reversals);

    }



}
