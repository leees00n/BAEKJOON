import java.io.*;
import java.util.*;

public class num1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //시험 본 과목의 개수 입력받고, arr배열에 크기 설정해주기

        double[] arr = new double[Integer.parseInt(br.readLine())];

        // 점수 입력 받기 (StringTokenizer 를 이용해서 공백 숫자 구분해서 배열에 넣어주기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }


        //합 구하기
        double sum = 0;
        //배열 오름차순 정렬
        Arrays.sort(arr);
        //성적 고치고 바로 배열에 재 정렬
        for (int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length - 1]) * 100);
            //System.out.println(arr[i]);
        }

        System.out.println(sum / arr.length);

        //System.out.println(sum);
    }

}
