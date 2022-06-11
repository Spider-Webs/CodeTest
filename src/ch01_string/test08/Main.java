package ch01_string.test08;
/*
Q. 유효한 팰린드롬
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

알파벳 이외의 문자들의 무시합니다.
 */
import java.util.Scanner;

public class Main {

    public static String solution(String str){
        String answer = "NO";

        //대소문자 구분하지 않으므로 대문자 혹은 소문자로 통일
        str= str.toLowerCase();
        //알파벳만 가지고 회문을 검사하기에, 매개변수 str을 char 배열로 변경
        char[] c = str.toCharArray();
        //알파벳만 담기위한 변수 change 선언
        String change = "";

        for(int i=0; i<str.length(); i++){
            //알파벳일경우에만 change 변수에 대입
            if(Character.isAlphabetic(c[i])){
                change += c[i];

            }
        }

        //change 변수를 뒤집은 tmp 와 비교 했을때 동일여부 확인
        String tmp = new StringBuffer(change).reverse().toString();

        if(change.equals(tmp)){
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}
