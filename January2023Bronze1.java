// unsolved 1/28

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;


public class January2023Bronze1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String str = scanner.next();
        char[] start = str.toCharArray();
        int[] end = new int[N];

        int GLeader = -1;
        boolean GLeaderExists = true;
        int HLeader = -1;
        boolean HLeaderExists = true;

        for (int i = 0; i < N; i++) { // first pass, initialize end and find leaders if any
            end[i] = scanner.nextInt()-1;
            if (start[i] == 'G') {
                if (GLeaderExists) {
                    if (GLeader == -1) {  // make the GLeader i
                        GLeader = i;
                    } else if (i > end[GLeader]) { // is this G greater than GLeader range?
                        GLeaderExists = false;
                    }
                }
            } else if (start[i] == 'H') {
                if (HLeaderExists) {
                    if (HLeader == -1) {  // make the HLeader i
                        HLeader = i;
                    } else if (i > end[HLeader]) { // is this H greater than HLeader range?
                        HLeaderExists = false;
                    }
                }
            }
        }

        int leader = 0; // find leader
        char leaderType = ' ';
        int count = 0;
        if (GLeader == -1 && HLeader == -1) { // no leaders
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                count -= start[i];
            }
        } else if (GLeader != -1 && HLeader == -1) { // GLeader exists
            leader = GLeader;
            leaderType = 'G';
        } else if (HLeader != -1 && GLeader == -1) { // HLeader exists
            leader = HLeader;
            leaderType = 'H';
        } else { // both leaders exist
            count = 1;
            if (GLeader > HLeader) { // GLeader is greater
                leader = GLeader;
                leaderType = 'G';
            } else { // HLeader is greater
                leader = HLeader;
                leaderType = 'H';
            }

        }

        for (int i = 0; i < leader; i++) { // second pass, find all pairs of one leader one follower (follower being contains leader in range)
            if (i == 0 && count == 1) {continue;} // if there's two leaders, skip the first one
            if (start[i] != leaderType) { // if the current is not the same type as leader
                if (end[i] >= leader) { // if the current's range contains the leader
                    count++;  // add a follower
                }
            }
        }

        System.out.println(count);
    }
}

// 5 8 11 12 13



//SAMPLE INPUT:
//4
//GHHG
//2 4 3 4
//SAMPLE OUTPUT:
//1
//
//SAMPLE INPUT:
//3
//GGH
//2 3 3
//SAMPLE OUTPUT:
//2
//
// SAMPLE INPUT:
// 5
// GGHGH
// 2 3 5 4 5
// SAMPLE OUTPUT:
// 1
