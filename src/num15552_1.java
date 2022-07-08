import java.io.*;
import java.util.StringTokenizer;

public class num15552_1 {

        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();

            int cnt = Integer.parseInt(br.readLine());
            int i = 1;


            while (i <= cnt){
                st = new StringTokenizer(br.readLine()," ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int sum = a + b;

                i++;

                bw.write(sum+"\n");
            }
            bw.flush();
        }
}