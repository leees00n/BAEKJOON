import java.util.Scanner;

public class num11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        String num = sc.next();
        sc.close();

        int sum = 0;

        for(int i=0; i<cnt ; i++){
           sum += num.charAt(i)-'0';
        }

        System.out.println(sum);

    }
}
