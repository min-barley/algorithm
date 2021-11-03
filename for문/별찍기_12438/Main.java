package for문.별찍기_12438;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.valueOf(br.readLine());

        for(int i=1; i<=num; i++){
            for(int j=0; j<i; j++){
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
