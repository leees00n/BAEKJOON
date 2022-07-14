import java.io.*;
import java.util.StringTokenizer;

public class num2577 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];

        /*int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());*/

        int num = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        /* int length = (int)(Math.log10(num)+1);
        System.out.println(num);
        System.out.println(length); */

        String str = String.valueOf(num);

        for(int i = 0; i < str.length() ; i++){
            arr[(str.charAt(i)-48)]++;
        }

        for (int v : arr){
            bw.write(v);
        }
        bw.flush();


    }
}
