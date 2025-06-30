////My Code
//import java.io.*;
//public class WayTooLongWords {
//    public static void main(String[] args)throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int n=Integer.parseInt(br.readLine());
//         String[]str =new String[n];
//         for(int i=0;i<n;i++)
//         {
//             str[i]=br.readLine();
//         }
//         for(int i=0;i<n;i++)
//         {
//             if(str[i].length()>10)
//             {
//                 System.out.println(""+str[i].charAt(0)+String.valueOf(str[i].length()-2)+String.valueOf(str[i].charAt(str[i].length()-1)));
//             }
//             else
//                 System.out.println(str[i]);
//         }
//    }
//}
//
//
//More Optimal Code

//import java.io.*;
//
//public class WayTooLongWords {
//    public static void main(String[] args) throws IOException {
//        long start=System.currentTimeMillis();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        while (n-- > 0) {
//            String word = br.readLine();
//            if (word.length() > 10) {
//                sb.append(word.charAt(0)).append(word.length() - 2).append(word.charAt(word.length() - 1)).append("\n");
//            } else {
//                sb.append(word).append("\n");
//            }
//        }
//        System.out.print(sb);
//    }
//}

import java.io.*;
public class WayTooLongWords
{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuffer sb=new StringBuffer();
        while(n-->0)
        {
         String word=br.readLine();
         if(word.length()>10)
             sb.append(""+word.charAt(0)+(word.length()-2)+word.charAt(word.length()-1)).append("\n");
         else
             sb.append(word+"\n");
        }
        System.out.println(sb);
        }
    }