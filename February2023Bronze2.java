import java.util.*;

public class February2023Bronze2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        cases:
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            char[][] canvas = new char[N][N];
            for (int i = 0; i < N; i++) {
                canvas[i] = scanner.next().toCharArray();
            }
            int K = scanner.nextInt();
            char[][] stamp = new char[K][K];
            for (int i = 0; i < K; i++) {
                stamp[i] = scanner.next().toCharArray();
            }
            boolean possible = false;
            for (int i = 0; i <= N - K && !possible; i++) {
                for (int j = 0; j <= N - K && !possible; j++) {
                    for (int r = 0; r < 4 && !possible; r++) {
                        if (canStamp(canvas, i, j, stamp)) {
                            System.out.println("YES");
                            continue cases;
                        }
                        stamp = rotate(stamp);
                    }
                }
            }
            System.out.println("NO");
        }
        scanner.close();
    }

    static boolean canStamp(char[][] canvas, int i, int j, char[][] stamp) {
        for (int si = 0; si < stamp.length; si++) {
            for (int sj = 0; sj < stamp.length; sj++) {
                if (stamp[si][sj] == '*' && canvas[i + si][j + sj] != '*') {
                    return false;
                }
            }
        }
        for (int si = 0; si < stamp.length; si++) {
            for (int sj = 0; sj < stamp.length; sj++) {
                if (stamp[si][sj] == '*') {
                    canvas[i + si][j + sj] = '*';
                }
            }
        }
        return true;
    }

    static char[][] rotate(char[][] stamp) {
        int n = stamp.length;
        char[][] rotated = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = stamp[i][j];
            }
        }
        return rotated;
    }
}