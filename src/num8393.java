import java.util.Scanner;
public class num8393 {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int a = 1 ; a < n+1 ; a++ ){
            sum += a;
        }
        System.out.println(sum);
    }
}
