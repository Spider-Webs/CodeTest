package ch01_string.test01;
/*
Q. 문자 찾기
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지
알아내는 프로그램을 작성하세요.


 */
import java.util.Scanner;

public class Main {

    public static int solution(char c ,String str){

        int answer = 0;

        //자바는 대문자 소문자를 다르게 인식하기에, 특정문자와 문자열의 각문자를 소문자로 통일
        str = str.toLowerCase();
        c=Character.toLowerCase(c);

        for (int i =0 ; i<str.length(); i++){
            //str 문자열의 i번째와 매개변수(scanner로 입력받은 문자)c와 동일하면 answer +1;
            if(str.charAt(i)==c){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        System.out.println(solution(c,str));
    }
}
