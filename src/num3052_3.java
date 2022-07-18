import java.io.*;
import java.util.*;

public class num3052_3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i= 0; i < 10; i++) {
            hs.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(hs.size());
      //  bw.write(String.valueOf(hs.size()));
        //bw.flush();

        }
    }

