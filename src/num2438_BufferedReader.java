import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2438_BufferedReader {
    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        br.close();

        for(int i = 1 ; i <= N ; i++){
            for(int t = 1; t<= i; t++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
