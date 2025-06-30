//import java.io.*;
//public class NextRound {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str=br.readLine();
//        int n=Integer.parseInt(str.substring(0,str.indexOf(' ')));
//        int k =Integer.parseInt(str.substring(str.indexOf(' ')+1));
//        String str2=br.readLine();
//        int arr[]=new int[n];
//        int num=0;
//        for(int i=0;i<str2.length();) {
//            if (i <= str2.lastIndexOf(' ')) {
//                arr[num++] = Integer.parseInt(str2.substring(i, str2.indexOf(' ', i)));
//                i = str2.indexOf(' ', i) + 1;
//            } else {
//                arr[num++] = Integer.parseInt(str2.substring(i));
//                break;
//            }
//        }
//        num=0;
//        if(arr[k-1]==0)
//        {
//            for(int i=0;i<=k-1;i++)
//                if(arr[i]>arr[k-1])
//                    num++;
//            System.out.println(num);
//        }
//        else
//        {
//            for(int i=k;i<arr.length;i++)
//            {
//                if(arr[i]==arr[k-1])
//                 num++;
//                else
//                    break;
//            }
//            System.out.println(num+k);
//        }
//    }
//}


import java.util.*;
public class NextRound
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
            if(arr[i]>=arr[k-1]&&arr[i]!=0)
                count++;
        System.out.println(count);
    }
}