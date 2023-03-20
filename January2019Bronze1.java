import java.io.*;

public class January2019Bronze1 {
    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
        int N = Integer.parseInt(in.readLine());
        int[] shells = {1, 2, 3};
        int[] solutions = {0, 0, 0};

        for (int i = 0; i < N; i++) {
            String str = in.readLine();
            String[] string = str.split(" ");

            int loc1 =Integer.parseInt(string[0])-1;
            int loc2 = Integer.parseInt(string[1])-1;
            int guess = Integer.parseInt(string[2]);

            //switch
            int temp = shells[loc1];
            shells[loc1] = shells[loc2];
            shells[loc2] = temp;

            solutions[shells[guess-1]-1]++;
        }

        //largest solution

        int greatestSolution = 0;
        for (int i = 0; i < 3; i++) {
            if (solutions[i] > greatestSolution) {
                greatestSolution = solutions[i];
            }
        }
        pw.println(greatestSolution);
        pw.close();
    }

}
