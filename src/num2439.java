import java.io.*;

public class num2439 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i; j++) {
            bw.write(' ');
            }
                for (int t = 1; t <= i; t++) {
            bw.write('*');
                }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        }
    }
