package ch01_string.test10;
/*
Q. 가장 짧은 문자거리
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진
최소거리를 출력하는 프로그램을 작성하세요.
 */
import java.util.Scanner;

public class Main {

    public static int[] solution(String str,char c){
        int[] answer = new int[str.length()];

        //거리를 구하기위한 변수 t 선언 1000으로 잡은이유는 처음 동일문자가 나오기전까지 그냥 증가시키기위해 임의변수
        int t =1000;


        char[] chars = str.toCharArray();

        for(int i=0 ; i<str.length(); i++){
            //같지않으면 +1 t변수를 answer배열에 추가
            if(chars[i]!=c){
                t++;
                answer[i] = t;
            }else{
                //같으면 0으로 초기화
                t=0;
                answer[i]=t;
            }
        }
        //이번에는 최소거리니 오른쪽에갔을때 반대로 왼쪽에 갔을때 를 구해준다
        t = 1000;

        for (int i=str.length()-1; i>=0; i--){
            if(chars[i]!=c){
                t++;
                answer[i] = Math.min(t, answer[i]);
            }else{
                t=0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        for (int i : solution(str,c)) {

            System.out.print(i + " ");

        }
    }
}
