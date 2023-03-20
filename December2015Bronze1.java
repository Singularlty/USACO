import java.util.Scanner;

public class December2015Bronze1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a < c) {
            if (b < d) {
                System.out.println(d-a);
            } else {
                System.out.println(b-a);
            }
        } else {
            if (b < d) {
                System.out.println(d-c);
            } else {
                System.out.println(b-c);
            }
        }

    }

}
