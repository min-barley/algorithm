package for문.기찍N2742;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(bf.readLine());

        for(int i=num; i>0; i--){
            bw.write(String.valueOf(i));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
