/*
ID: maxpeng1
LANG: JAVA
PROG: friday
*/
import java.io.*;
import java.util.*;

class friday {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

        int N = Integer.parseInt(f.readLine());
        StringBuilder output = new StringBuilder();

        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] days = {0,0,0,0,0,0,0};
        int date = 0;

        for(int i = 0; i < N; i++){ // for each year
            if (i%400 == 0) {
                months[2] = 29;
            } else if (i%100 == 0) {
                months[2] = 28;
            } else if (i%4 == 0) {
                months[2] = 29;
            }else{
                months[2] = 28;
            }
            for (int j = 0; j < 12; j++){ //for each month
                for (int k = 0; k < months[j]; k++){ //for each day
                    if (k == 12){
                        days[date]++;
                    }
                    date++;
                    if (date == 7){date = 0;}
                }
            }
        }
        out.println(days[5] + " " + days[6] + " " + days[0] + " " + days[1] + " " + days[2] + " " + days[3] + " " + days[4]);
        out.close();
    }

}

