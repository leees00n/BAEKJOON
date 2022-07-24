import java.io.*;

public class num15596 {
    public static long sum(int[] a) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];

        int sum =0;
        for(int i= 0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}
