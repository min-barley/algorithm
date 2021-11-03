package for문.N찍기2741;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(bf.readLine());

        for(int i=0; i<num; i++){
            bw.write(String.valueOf(i+1));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
