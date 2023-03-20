import java.io.*;
import java.util.Scanner;

public class February2023Bronze3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long K = scanner.nextLong();

        long theNumber = ((long) K + 1) * 2 - K;

        long chain = 1;
        long totalCost = 0;
        boolean lastOneWasPartOfAChain = false;


        long lastDay = scanner.nextLong();
        for (int i = 1; i < N; i++) {
            long day = scanner.nextLong();
            long distance = day - lastDay;

            if (distance <= theNumber - 1) {
                chain += distance;
                lastOneWasPartOfAChain = true;
            } else {
                if (chain > 1) {
                    totalCost += chain + K;
                    chain = 1;
                    lastOneWasPartOfAChain = false;
                }
            }
            if (!lastOneWasPartOfAChain) {
                totalCost += K + 1;
            }
            lastDay = day;
        }

        if (chain > 1) {
            totalCost += chain + K;
        }
        if (!lastOneWasPartOfAChain) {
            totalCost += K + 1;
        }

        System.out.println(totalCost);

    }

}
