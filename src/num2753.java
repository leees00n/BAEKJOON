import java.util.Scanner;
public class num2753 {
    public static void main(String[] args){

        Scanner ly = new Scanner(System.in);

        int lunar = ly.nextInt();

        if(lunar % 4 == 0){
            if(lunar % 100 > 0 ) {
                System.out.println("1");
            } else if (lunar % 400 == 0) {
                    System.out.println("1");
            } else {
                System.out.println("0");
            }
        }else{
            System.out.println("0");
        }
    }
}
