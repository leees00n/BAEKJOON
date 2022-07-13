import java.util.Scanner;

public class num2577_sc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int num = num1*num2*num3;
        String str = Integer.toString(num);
        sc.close();

        for(int i=0; i<10; i++){
            int count = 0;
            for(int j = 0; j<str.length();j++){
                if ((str.charAt(j)- '0') == i){
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
}
