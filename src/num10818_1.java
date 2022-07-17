import java.io.*;
import java.util.StringTokenizer;

public class num10818_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine(), " ");

        int arr[] = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++){

            if ( arr[i] > max){
                 max = arr[i];
            }
            if (arr[i] < min) {
                 min = arr[i];
            }

        }


        bw.write(max + "\t" + min);
        bw.flush();
    }
}