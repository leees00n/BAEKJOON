import java.io.*;
import java.util.StringTokenizer;

public class num10871 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(str.nextToken());
        int X = Integer.parseInt(str.nextToken());

        StringBuilder sb = new StringBuilder();

        str = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i< N ; i++){
            int a = Integer.parseInt(str.nextToken());
            if (a<X){
                sb.append(a).append(' ');
            }
        }
        System.out.println(sb);

    }
}
