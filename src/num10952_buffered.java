import java.io.*;
import java.util.StringTokenizer;

public class num10952_buffered {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();

        while (true) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            if (a == 0 && b == 0) {
                break;
            }
            sb.append(a + b).append("\n");
        }
        System.out.println(sb);

    }
    }


