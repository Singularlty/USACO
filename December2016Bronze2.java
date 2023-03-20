import java.io.*;

public class December2016Bronze2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("blocks.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
        int N = Integer.parseInt(in.readLine());
        String[] blocks = new String[N];

        for (int i = 0; i < N; i++) {
            blocks[i] = in.readLine();
        }
        System.out.println();
        for (int i = 0; i < 26; i++){ //for each letter
            char character  =  Character.toLowerCase((char)('A' + i));
            int total = 0;

            for (int j = 0; j < N; j++){ //for each block add total amount of letter needed
                int sum1 = 0;
                int sum2 = 0;

                for (int k = 0; k < 3; k++){  // add 1 for each time character appears in first word
                    if (blocks[j].charAt(k) == character){
                        sum1++;
                    }
                }

                for (int k = 4; k < 7; k++){  // add 1 for each time character appears in second word
                    if (blocks[j].charAt(k) == character){
                        sum2++;
                    }
                }

                total += Math.max(sum1, sum2);
            }
            pw.println(total);
        }
    pw.close();
    }

}
