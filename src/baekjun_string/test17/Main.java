package baekjun_string.test17;
/*
문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오.
단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다.
단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
ex) I am happy today - > I ma yppah yadot
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Scanner는 nextInt()를 하면 띄워쓰기를 기준으로 입력값을 받아들이고,
        //
        //개행문자인 \n이 그대로 남아있어
        //
        //그 다음의 nextLine()을 쓰면 nextLine()이 씹히게 됩니다.
        int n = Integer.parseInt(scanner.nextLine());

        //결과를 담을 변수배열
        String[] str = new String[n];


        for(int i=0; i<n; i++){
            String s = scanner.nextLine();


            String[] split = s.split(" ");


            //append를 활용하기위한 builder선언
            StringBuilder result = new StringBuilder();
            for(int j=0; j<split.length; j++){
                //문자를 뒤집기위한 lt,rt 변수
                int lt =0;
                int rt=split[j].length()-1;
                char[] c = split[j].toCharArray();
                while(lt<rt){
                    char tmp = c[lt];
                    c[lt]=c[rt];
                    c[rt] = tmp;
                    lt++;
                    rt--;
                }

                result.append(String.valueOf(c));
                result.append(" ");

            }
            str[i] = result.toString();
        }

        for (String s : str) {
            System.out.println(s);

        }

    }
}
