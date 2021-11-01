package for문.빠른AB15552;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(bf.readLine());


        for(int i=0; i<num; i++){
            StringTokenizer st=new StringTokenizer(bf.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(a+b));
            bw.write("\n");
        }

        bw.flush();
    }
}
