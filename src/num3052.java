import java.util.Scanner;

public class num3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] =sc.nextInt()%42;
            //System.out.println(arr[i]);
        }
            for (int j = 0; j < arr.length; j++) {
                count = 0;
                for (int k = j+1 ; k < arr.length; k++) {
                    if (arr[j] == arr[k]) {
                        count++;
                    }
            }
        if (count == 0) {
            result++;
        }
            }
        System.out.println(result);

    }
}

