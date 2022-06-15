package baekjun_string.test03;
/*
Q. 단어의 개수
영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

조건 ) 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //조건중에 문자열은 공백으로 시작하거나 끝날 수 있다라는 단서조항이 있다
        //split을 사용할경우 빈공백을 입력하면 1이 발생되기에 StringTokenizer를 사용해야한다.
        StringTokenizer s = new StringTokenizer(str, " ");

        System.out.println(s.countTokens());
    }
}
