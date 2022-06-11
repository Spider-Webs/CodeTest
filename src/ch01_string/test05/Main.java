package ch01_string.test05;
/*
Q. 특정 문자 뒤집기
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 */
import java.util.Scanner;

public class Main {

    public static String solution(String str){
        String answer = "";

        char[] c = str.toCharArray();
        int lt =0, rt=str.length()-1;

        while (lt<rt){
            //알파벳이 아닐경우에 단어를 뒤집을 필요가없으므로 건너뛴다
            if(!Character.isAlphabetic(c[lt])){
                lt++;
            }else if(!Character.isAlphabetic(c[rt])){
                rt--;
            }else{
                //알파벳일경우에는 앞뒤의 위치를 바꿔준다
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(solution(str));
    }
}
