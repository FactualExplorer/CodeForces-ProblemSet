import java.io.*;
public class Team {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int counter=0;
        while(n-->0)
        {
            String str=br.readLine();
            if(str.chars().filter(c ->c=='1').count()>=2)
                counter++;
        }
        System.out.println(counter);
    }
}
