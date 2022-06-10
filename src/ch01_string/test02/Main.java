package ch01_string.test02;

/*
Q. 대소문자 변환
대문자와 소문자가 같이 존재하는 문자열을 입력받아
대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 */

import java.util.Scanner;

public class Main {

    public static String solution(String str){
        String answer = "";

        //매개변수 str(scnnaer로 입력받은 str) 문자배열 c 대입
        char[] c = str.toCharArray();

        //반복문 동안 c[i]의 요소가 대문자이면 소문자로 변환, 
        //반대로 소문자이면 대문자로 변환
        for(int i =0; i<str.length(); i++){
            if(Character.isLowerCase(c[i])){
                answer+=Character.toUpperCase(c[i]);
            }else {
                answer += Character.toLowerCase(c[i]);
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
