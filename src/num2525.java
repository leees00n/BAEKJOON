import java.util.Scanner;
public class num2525 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        //모든 시간을 분으로 바꿔주기!
        int O = A*60 + B + C;
        A = O/60;
        B = O%60;

        //A가 24를 넘는 경우를 생각하기
        if (A>=24) {
            A -= 24;
        }
        System.out.println(A + " " +B);

        //아래는 처음 내 풀이
       /* if (C + B < 60) {
            System.out.println(A + " " + (C + B));
        } else {

            if (C + B % 60 == 0) {
                if ((A + (C + B) / 60) >= 24) {
                    System.out.println((A + (C + B) / 60) - 24);
                } else {
                    System.out.println(A + (C + B) / 60);
                }
            } else {
                if ((A + (C + B) / 60) >= 24) {
                    System.out.println(((A + (C + B) / 60) - 24) + " " + (C + B) % 60);
                } else {
                    System.out.println(A + (C + B) / 60 + " " + (C + B) % 60);
                }
            }*/

            in.close();
        }
    }

