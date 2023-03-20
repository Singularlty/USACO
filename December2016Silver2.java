// unsolved 1/17

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;


public class December2016Silver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("citystate.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("citystate.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());


        HashMap<Integer, String> map = new HashMap<Integer, String>();
        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            map.put(i, st.nextToken().substring(0, 2).toUpperCase() + st.nextToken());
        }


        AtomicInteger count = new AtomicInteger();
        map.forEach((key, value) -> {
            String match = map.get(key).substring(2,4) + map.get(key).substring(0,2);
            if(map.containsValue(match)) {
                count.incrementAndGet();
            }
        });

        pw.println(count.get()/2);
        pw.close();
    }

}