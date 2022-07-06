import javax.imageio.IIOException;
import java.util.Scanner;

public class num10951_2 {
    public static void main(String[] args)throws IIOException {

        Scanner sc = new Scanner(System.in);


        while (sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
            }
        sc.close();
        }

    }
