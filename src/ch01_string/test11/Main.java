package ch01_string.test11;
/*
Q. 문자열 압축
알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는

문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.

단 반복횟수가 1인 경우 생략합니다.
ex)
KKHSSSSSSSE - > K2HS7E

 */
import java.util.Scanner;

public class Main {

    public static String solution(String str){
        String answer = "";
        //문제에서 같은문자가 연속으로 반복되는 경우이므로 이전문자와 다음문자가 같은경우를 비교해줘야한다
        //그러므로 매개변수 str에 빈문자열을 추가해준다
        str = str + " ";
        //같은문자 갯수를 세기위한 변수 count, 1인이유는 어떠한문자가 처음등장하는것 자체가 1로 세기위함이다
        int count=1;
        
        char[] c = str.toCharArray();
        //str.length()-1을 한 이유는 마지막은 빈문자열이므로 기존 str매개변수의 길이만큼 반복되야한다
        for(int i=0; i<str.length()-1; i++){
            if(c[i]==c[i+1]){
                count++;
            }else{
                //같지않은경우 answer 변수에 c[i]를 대입하고
                answer += c[i];
                //문제에서 count==1인경우에는 생략하므로 2이상부터 숫자를 문자열에 추가해야한다
                if(count>1){
                    answer+=count;
                }
                count=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(solution(str));
    }
}
