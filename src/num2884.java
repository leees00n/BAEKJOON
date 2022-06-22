import java.util.Scanner;
public class num2884 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int H = in.nextInt(); int M = in.nextInt();


        if (M >= 45) {
            System.out.println(H + " " + (M - 45));
        } else {
            if (H < 1) {
                System.out.println(23 + " " + (M + 15));
            } else {
                System.out.println((H - 1) + " " + (M + 15));
            }

        }
    }
}

