//My Code

//import java.util.Scanner;
//public class Watermelon {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int w=sc.nextInt();
//        if(w<=100&&w>3&&w%2==0)
//            System.out.println("YES");
//        else
//            System.out.println("NO");
//        sc.close();
//    }
//}


//More Optimal Code

//import java.io.*;
//
//public class Watermelon {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int w = Integer.parseInt(br.readLine());
//        System.out.println((w % 2 == 0 && w > 2) ? "YES" : "NO");
//    }
//}

import java.io.*;
public class Watermelon
{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int w=Integer.parseInt(br.readLine());
        if(w>3&&w%2==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}


