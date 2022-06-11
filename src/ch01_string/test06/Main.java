package ch01_string.test06;
/*
Q.  중복문자제거
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 */
import java.util.Scanner;

public class Main {

    public static String solution(String str){
        String answer = "";

        //answer은 빈문자열이므로 매개변수로 입력받은 str은 char 배열로변환 후 answer에 char배열의 인덱스를 추가하되,
        //String 클래스의 contains메서드를 사용하여 동일문자가 포함되어있지않는경우에만 answer에 추가
        for(char c : str.toCharArray()){
            if(!answer.contains(String.valueOf(c))){
                answer += c;
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
