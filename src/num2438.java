import  java.util.Scanner;
class num2438 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i = 1;
        int t = 1;
        for(i =1 ; i <= N ; i++) {
            for (t = 1; t <= i; t++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
