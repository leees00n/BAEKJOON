import java.io.*;

public class num1110 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        //int num2 = (num/10) + (num%10);
        //num2 변수를 이용해서 처음 주어진 숫자인 num의 자리수를 십의 자리와 일의 자리로 쪼개서 더해줌.

        //int num3 = ((num%10)*10) + (((num/10) + (num%10))%10) ;
        //num2에서 구한 num의 일의 자리 수에 10을 곱해서 십의자리로 만들어주고,
        //num의 십의자리와 일의자리를 각각 더해준 num2의 값의 일의 자리를 구해서 더해준다.

        int N = num;
        int cycle = 0;
        //사이클 값을 구하기 위한 설정.

        do {

            num = ((num%10)*10) + (((num/10) + (num%10))%10);
            //반복 루프를 만들기 위해 새로운 값인 num3 변수가 아닌 num 변수를 이용.
            cycle++;
            //루프가 돌때마다 1씩 더해주기 위한 설정.

        } while (N != num);
        //n과 num의 수가 다를때까지 반복하면 우리가 구하려는 사이클 수를 구할 수 있다.

        System.out.println(cycle);
        }
    }

