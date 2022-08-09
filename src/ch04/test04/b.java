package ch04.test04;
import java.util.*;

public class b {

    public static int solution(String s1, String s2){
        int answer =0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        int line = s2.length() - 1;
        for(int i=0; i<s2.length(); i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
        for(int i=0; i<line; i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);
        }

        int lt =0;
        for(int i= line; i<s1.length(); i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
            if(map1.equals(map2)){
                answer++;
            }


            map1.put(s1.charAt(lt), map1.get(s1.charAt(lt)) - 1);
            if(map1.get(s1.charAt(lt))==0){
                map1.remove(s1.charAt(lt));
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 = scan.next();

        System.out.println(solution(s1,s2));
    }
}
