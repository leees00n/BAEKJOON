import javafx.scene.control.SpinnerValueFactory;

import java.io.*;
import java.util.StringTokenizer;


public class num1008 {
    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        System.out.println(a/b);
    }
}
