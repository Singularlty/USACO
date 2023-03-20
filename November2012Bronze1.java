//import java.util.Scanner;
//
//public class November2012Bronze1 {
//        public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                String str = sc.nextLine();
//                char[] array = str.toCharArray();
//
//                char lastChar = array[0];
//                int leftPair = 0;
//                int rightPair = 0;
//
//                for (int i = 1; i < array.length; i++) {
//                       if (array[i] == lastChar){
//                               if (lastChar == '(') {
//                                       leftPair++;
//                               } else {
//                                       rightPair++;
//                               }
//                       } else {
//                               lastChar = array[i];
//                       }
//
//                }
//
//                if (leftPair > rightPair) {
//                        System.out.println(rightPair);
//                } else {
//                        System.out.println(leftPair);
//                }
//        }
//}
