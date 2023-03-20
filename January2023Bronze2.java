// unsolved 1/28

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class January2023Bronze2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] barn = new int[101];

        for (int i = 0; i < N; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int amount = scanner.nextInt();
            for (int j = start; j < end; j++) {
                barn[j] += amount;
            }
        }


        int[][] conditioners = new int[M][4];  // conditioners [ start, end , power, cost]
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 4; j++) {
                conditioners[i][j] = scanner.nextInt();
            }
        }

        int minimumCost = Integer.MAX_VALUE;

        minimumCost = Math.min(callWorksOnCombinations(conditioners, barn, minimumCost), minimumCost);

        System.out.println(minimumCost);
    }

    public static int works(int[][] combination, int[] barn) {
        int[] barnCopy = Arrays.copyOf(barn, barn.length);
        int cost = 0;
        for (int i = 0; i < combination.length; i++) {
            cost += combination[i][3];
            for (int j = combination[i][0]; j < combination[i][1]; j++) {
                barnCopy[j] -= combination[i][2];
            }
        }
        boolean works = true;
        for (int i = 0; i < barnCopy.length; i++) {
            if (barnCopy[i] > 0) {
                works = false;
            }
        }
        if (works) {
            return cost;
        }
        return Integer.MAX_VALUE;
    }

    public static int callWorksOnCombinations(int[][] arr, int[] barn, int minimumCost) {
        // Generate all possible combinations
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(arr, new ArrayList<>(), combinations, 0);

        // Call the works() method on each combination
        for (List<Integer> combination : combinations) {
            int[][] subArray = new int[combination.size()][4];
            for (int i = 0; i < combination.size(); i++) {
                int index = combination.get(i);
                System.arraycopy(arr[index], 0, subArray[i], 0, 4);
            }
            minimumCost = Math.min(works(subArray, barn), minimumCost);
        }

        return minimumCost;
    }

    private static void generateCombinations(int[][] arr, List<Integer> combination, List<List<Integer>> combinations, int start) {
        combinations.add(new ArrayList<>(combination));
        for (int i = start; i < arr.length; i++) {
            combination.add(i);
            generateCombinations(arr, combination, combinations, i + 1);
            combination.remove(combination.size() - 1);
        }
    }

}
