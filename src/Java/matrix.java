//import java.util.*;
//public class matrix {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[][] arr=new int[5][5];
//        int sum=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr.length;j++) {
//                arr[i][j] = sc.nextInt();
//                if (arr[i][j] == 1) {
//                    sum=Math.abs(2-i)+Math.abs(2-j);
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//}
//
//

import java.io.*;
public class matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int row = Integer.MIN_VALUE;
//        int col = Integer.MAX_VALUE;
          int row,col;
          row=col=Integer.MIN_VALUE;
        for (int i = 0; i <= 4; i++) {
            String[] str = br.readLine().trim().split("\\s+");
            for (int j = 0; j <= 4; j++) {
                if (Integer.parseInt(str[j]) == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        int sum = Math.abs(2 - row) + Math.abs(2 - col);
        System.out.println(sum);
    }
}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//public class matrix {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        int rowWithOne = -1, colWithOne = -1;
//
//        for (int i = 1; i <= 5; i++) {
//            String[] parts = reader.readLine().trim().split("\\s+");
//            for (int j = 1; j <= 5; j++) {
//                if (Integer.parseInt(parts[j - 1]) == 1) {
//                    rowWithOne = i;
//                    colWithOne = j;
//                }
//            }
//        }
//
//        int moves = Math.abs(rowWithOne - 3) + Math.abs(colWithOne - 3);
//        System.out.println(moves);
//    }
//}
