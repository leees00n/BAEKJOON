import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class num10926 {
    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lastString = "??!";
        String str = br.readLine();

        System.out.println(str + lastString);
    }
}
