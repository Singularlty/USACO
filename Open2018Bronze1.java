import java.io.*;

public class Open2018Bronze1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("tttt.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tttt.out")));
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++){       // prep
            String str = in.readLine();
            for (int j = 0; j < 3; j++){
                board[i][j] = str.charAt(j);
            }
        }



    }

}
