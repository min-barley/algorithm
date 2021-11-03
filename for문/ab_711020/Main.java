package for문.ab_711020;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(bf.readLine());

        for(int i=0; i<num; i++){
            StringTokenizer st=new StringTokenizer(bf.readLine());
            int a=Integer.valueOf(st.nextToken());
            int b=Integer.valueOf(st.nextToken());
            bw.write("Case #"+(i+1)+": "+(a+b)+"\n");
        }
        bw.flush();
        bw.close();

    }

}
