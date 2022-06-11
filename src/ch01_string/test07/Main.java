package ch01_string.test07;
/*
Q. 회문 문자열
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 */
import java.util.Scanner;

public class Main {

    public static String solution(String str){
        String answer = "";

        //대소문자를 구분하지 아니하기에, 대문자 혹은 소문자로 통일
        str = str.toLowerCase();

        //그냥 읽을때나 뒤집어서 읽을때가 같은 문자열이 회문 문자열이다
        //그러므로 StringBuffer reverse()한 문자열과 입력받은 매개변수의 문자열과 같은경우 "YES"를 출력하면된다
        //주의할 점은 equals를 사용해야한다. ==비교는 주소값을 비교하기에 다르다.
        String tmp = new StringBuffer(str).reverse().toString();

        if(str.equals(tmp)){
            answer = "YES";
        }else {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(solution(str));
    }
}
