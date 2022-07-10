
import sun.security.rsa.RSAUtil;

import java.util.Arrays;
import java.util.Scanner;

public class num2562_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int max = arr[0];
        int count = 0;

        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            arr[i] = num;

            if(arr[i] >= max ){
                max = arr[i];
                count=i+1;

        }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
