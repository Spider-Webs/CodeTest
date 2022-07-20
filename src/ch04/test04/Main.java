package ch04.test04;
/*
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다

입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.

S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

예시 입력 1

bacaAacba
abc

예시 출력 1
3
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static int solution(String str, String t){
        int answer =0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<t.length(); i++){
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0) + 1);
        }

        for(int i=0; i<t.length()-1; i++){
            map2.put(str.charAt(i), map2.getOrDefault(str.charAt(i), 0) + 1);
        }
        int lt=0;
        for(int rt=t.length()-1; rt<str.length(); rt++){
            map2.put(str.charAt(rt), map2.getOrDefault(str.charAt(rt), 0) + 1);
            if (map1.equals(map2)) {
                answer++;
            }
            map2.put(str.charAt(lt), map2.get(str.charAt(lt))-1);
            if(map2.get(str.charAt(lt))==0){
                map2.remove(str.charAt(lt));
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String t = scanner.next();
        System.out.println(solution(str,t));

    }
}
