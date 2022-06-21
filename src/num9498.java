import java.util.Scanner;
public class num9498 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // System.out.print("시험 점수를 입력하세요 : ");
        int score = sc.nextInt();
        sc.close();

            if (score / 10 <= 10 && score / 10 >= 9) {
                System.out.println('A');
            } else if (score / 10 >= 8) {
                System.out.println('B');
            } else if (score / 10 >= 7) {
                System.out.println('C');
            } else if (score / 10 >= 6) {
                System.out.println('D');
            } else {
                System.out.println('F');

        }
    }
}
