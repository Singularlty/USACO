import java.io.*;
import java.util.Scanner;

public class December2014Bronze1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("marathon.out")));
        int N = Integer.parseInt(sc.nextLine());
        int currentX = sc.nextInt();
        int currentY = sc.nextInt();
        int maximum = Integer.MIN_VALUE;
        int total = 0;

        for (int i = 1; i < N; i++){
            int nextX = sc.nextInt();
            int nextY = sc.nextInt();
            int distance = Math.abs(nextX-currentX)+Math.abs(nextY-currentY);
            maximum = Math.max(distance, maximum);
            total += distance;
            currentX = nextX;
            currentY = nextY;

        }

        System.out.println(total-maximum);
        pw.close();
    }

}
//4
//0 0
//8 3  // 8 + 3 = 11
//11 -1  // 3 + 4 = 7
//10 0  // 1 + 1 = 2


