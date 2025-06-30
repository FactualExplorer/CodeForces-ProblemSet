import java.io.*;
public class BitPlusPlus {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=0;
        int n=Integer.parseInt(br.readLine());
        while(n-->0)
        {
            String str=br.readLine();
            if(str.equals("x++")||str.equals("++x"))
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}
