import java.util.Scanner;
public class num2739_f {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int G = in.nextInt();
        in.close();


        for (int k = 1; k < 10; k++)
        {
            System.out.println(G + " * " + k + " = " + (G * k));
        }
    }
}
