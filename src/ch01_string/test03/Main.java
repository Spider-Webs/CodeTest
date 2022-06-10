package ch01_string.test03;

/*
Q. 문장 속 단어
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

문장속의 각 단어는 공백으로 구분됩니다.
 */

import java.util.Scanner;

public class Main {

    public static String solution(String str){
        
        String answer = "";
        //String split메서드를 사용하여, 공백단위로 구분
        String[] s = str.split(" ");
        //배열 s 의 문자열의 길이를 비교하기위하여 max 변수 선언
        int max = Integer.MIN_VALUE;

        for(int i=0; i<s.length; i++){
            //max 변수와 s[i]이배열의 길이 비교하여, answer 값 대입
            if(max<s[i].length()){
                max = s[i].length();
                answer = s[i];
            }
        }


        return answer;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(solution(str));
    }
}
