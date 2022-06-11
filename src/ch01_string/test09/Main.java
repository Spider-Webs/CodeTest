package ch01_string.test09;
/*
Q. 숫자만 추출
문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.

만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.

추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 */
import java.util.Scanner;

public class Main {

    public static int solution(String str){
       String answer = "";

       //문자와 숫자가 섞여있는 문자열이므로 str문자열을 문자 배열로 변경
        char[] c = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            //알파벳이아닌경우 즉, 숫자인경우 answer 변수에 대입
            if(!Character.isAlphabetic(c[i])){
                answer += c[i];
            }
        }
        //문제에서 자연수를 추출하라고했으니, Integer로 변경
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(solution(str));
    }
}
