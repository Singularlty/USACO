import java.io.*;
import java.util.*;

public class Open2017Silver3 {
    static int n;
    static char[][] grid;
    static boolean[][] visited;
    static int count;

    static void dfs(int i, int j, char c) {
        visited[i][j] = true;
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if (Math.abs(x) == Math.abs(y)) {
                    continue;
                }
                int r = i + x;
                int d = j + y;
                if (r < 0 || r >= n || d < 0 || c >= n || visited[r][c] || grid[r][c] != c) {
                    continue;
                }
                dfs(r, c, c);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray();
        }
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) {
                    continue;
                }
                dfs(i, j, grid[i][j]);
                count++;
            }
        }
        System.out.println(count);
    }
}
