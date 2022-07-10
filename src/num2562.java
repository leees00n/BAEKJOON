import java.io.*;

public class num2562 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];


        for (int i = 0; i < 9 ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
            int index = 0;
            int count = 0;
            int max = 0;
            for(int value : arr){
                count++;
                if(value>=max){
                    max = value;
                    index = count;

            }
        }
            bw.write(max + "\n" + index);
            bw.flush();
        }



}