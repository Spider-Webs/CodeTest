package baekjun_string.test01;
/*
Q. 11720번 문제 숫자의 합  / String
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
ex)
54321 -> 15
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();

        scanner.close();

        int result=0;
        //charAt()은 해당문자의 아스키코드 값을 반환하므로 반드시 -48 or  -'0' 을 해주어야한다
        for(int i=0; i<n; i++){
            result += str.charAt(i) - '0';
        }

        System.out.println(result);


    }
}
