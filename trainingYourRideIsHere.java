
/*
ID: maxpeng1
LANG: JAVA
PROG: ride
*/
import java.io.*;

class ride {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

        String ufo = f.readLine();
        String group = f.readLine();

        int one = 1;
        int two = 1;

        for (int i = 0; i < ufo.length(); i++){
            one *= ufo.charAt(i) - 'a' + 33;
        }
        for (int i = 0; i < group.length(); i++){
            two *= group.charAt(i) - 'a' + 33;
        }
        if (one%47 == two%47){
            out.println("GO");
        } else {
            out.println("STAY");
        }

        out.close();
    }
}
