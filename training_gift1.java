
/*
ID: maxpeng1
LANG: JAVA
PROG: gift1
*/
import java.io.*;
import java.util.HashMap;
import java.util.Map;

class gift1 {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        f.mark(10000000);

        int n = Integer.parseInt(f.readLine());
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        for(int i = 0; i < n; i++){
            people.put(f.readLine(), 0);
        }

        for (int i = 0; i < n; i++){
            String name = f.readLine();
            String[] line = f.readLine().split(" ");
            int money = Integer.parseInt(line[0]);
            int peopleToGive = Integer.parseInt(line[1]);
            if (peopleToGive != 0){
                people.put(name, people.get(name) - money + money%peopleToGive);
                for (int j = 0; j < peopleToGive; j++){
                    String personToGive = f.readLine();
                    people.put(personToGive, people.get(personToGive) + money/peopleToGive);
                }
            }
        }
        f.reset();
        f.readLine();
        for(int i = 0; i < n; i++){
            String person = f.readLine();
            out.println(person + " " + people.get(person));
        }

        out.close();
    }
}
