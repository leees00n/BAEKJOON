import java.util.Scanner;
public class num24681 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
                int numx = in.nextInt();
                int numy = in.nextInt();

                if (numx>0 && numy>0 ){
                    System.out.println("1");
                } else if (numx>0 && numy<0) {
                    System.out.println("4");
                } else if (numx<0 && numy>0) {
                    System.out.println("2");
                } else
                    System.out.println("3");

                in.close();
    }

}
