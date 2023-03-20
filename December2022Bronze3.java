
import java.io.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class December2022Bronze3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        int T =  scanner.nextInt();
        for (int i = 0; i < T; i++) {

            int N = scanner.nextInt();
            int K =  scanner.nextInt();

            int[][] arr1 = new int[K][N+1];
            //fill array with int 2
            for (int k = 0; k < K; k++) {
                String inputOutput = scanner.next();
                for (int l = 0; l < N; l++) {
                    arr1[k][l] = inputOutput.charAt(l) - '0';
                }
                arr1[k][N] = scanner.nextInt();
            }

            int[][] arr2 = new int[2][N];
            String[][] trueFalse = new String[2][N];
            for (int k = 0; k < N; k++) { //for each column

                for (int l = 0; l < K; l++) { //for each row
                    if (arr1[l][k] == 0){
                        if (arr1[l][N] == 0) {
                            arr2[0][k] += 17;
                        } else {
                            arr2[0][k] += 13;
                        }
                    } else{
                        if (arr1[l][N] == 0) {
                            arr2[1][k] += 13;
                        } else {
                            arr2[1][k] += 17;
                        }
                    }
                }

                if (arr2[0][k]%17 == 0 || arr2[0][k]%13 == 0 ){
                    trueFalse[0][k] = "T";
                } else {
                    trueFalse[0][k] = "F";
                }
                if (arr2[1][k]%17 == 0 || arr2[1][k]%13 == 0){
                    trueFalse[1][k] = "T";
                } else {
                    trueFalse[1][k] = "F";
                }
                if (arr2[0][k] == 0){
                    trueFalse[0][k] = "F";
                }
                if (arr2[1][k] == 0){
                    trueFalse[1][k] = "F";
                }
            }
            boolean pass = true;
            for (int k = 0; k < N; k++) {
                if (trueFalse[0][k].equals("F") && trueFalse[1][k].equals("F")){
                    pass = false;
                }
            }

            int repeat = -1;
            int check = -1;
            for (int k = 0; k < K; k++) {
                for (int l = 0; l < N; l++) {
                    if ((arr1[k][l] == 0 && trueFalse[0][l].equals("F")) ||(arr1 [k][l] == 1 && trueFalse[0][l].equals("T"))){
                        repeat = 1;
                    } else {
                        repeat = 0;
                        break;
                    }
                }
                if (repeat == 1){
                    if (check == -1){
                        check = arr1[k][N];
                    } else if (arr1[k][N] != check) {
                        pass = false;
                    }
                }
            }

           if (pass){
                    System.out.println("OK");
                } else {
                    System.out.println("LIE");
                }


        }


    }
}
//1
//
//4 4
//0000 0
//1111 1
//0101 1
//0101 0