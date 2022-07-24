import java.util.Scanner;

public class num4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] score;
        // 테스트 케이스 입력받기

        int caseN = sc.nextInt();//테스트 케이스의 개수
        double avg = 0;
        double answer = 0;


        //(테스트 케이스 만큼) 학생수 배열 입력받기.
        // 처음 입력은 학생 수/ 두번째부턴 배열로 점수 입력받기

        for(int i = 0; i < caseN; i++) {
            double count = 0;

            int studentN = sc.nextInt(); // 학생 수 입력받기
            score = new int[studentN];//처음 i =0 에 대한 배열의 크기
            double sum = 0;

            for (int j = 0; j < studentN; j++) {
                int val = sc.nextInt();
                score[j] =val;
                sum += val;

            }
            //해당 열에 대한 학생들의 평균 구하기.
            avg =(sum/studentN);
            //System.out.println(avg);
            //평균 이상인 학생들을 출력하기.

            for(int k=0; k<studentN; k++){
                if(score[k]>avg){
                    count++;

                }
        }
            //answer = count * 100 / studentN;
            System.out.printf("%.3f%%\n",(count/studentN)*100 );
        }
        sc.close();

    }
}
