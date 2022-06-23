import java.util.Scanner;
public class num2739 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int G = in.nextInt();
        int i = 1;
        while (i < 10) {
            int result = G * i;
            System.out.println(G + " * " + i + " = " + result);
            i++ ;
        }

    }
}
