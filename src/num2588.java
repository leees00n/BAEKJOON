import java.util.Scanner;

public class num2588 {
    public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);

    int a = sc.nextInt();
    String b = sc.next();

    sc.close(); //최적화의 관점으로 close()를 습관적으로 선언해서 닫아주기!

        System.out.println(a * (b.charAt(2)-'0'));
        System.out.println(a * (b.charAt(1)-'0'));
        System.out.println(a * (b.charAt(0)-'0'));
        System.out.println(a + Integer.parseInt(b));


    }
}
