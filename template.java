// template for USACO programs

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;


public class template {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("template.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("template.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());



        int N = Integer.parseInt(st.nextToken());

        pw.close();
    }



    // Scanner

    public static void main2(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();



        System.out.println(N);
    }


}

