package baekjun_string.test11;
/*
백준 25238
문제
메이플스토리 몬스터는 방어율 수치가 있습니다. 이 방어율 수치의 일정 %를 무시하는 것을 방무라고 합니다. 유저는 아이템을 사거나, 특정한 스킬 레벨을 올려서 방무 수치를 올릴 수 있습니다.
그렇게 해서, 유저가 체감하는 몬스터의 방어율 수치를 낮출 수 있습니다. 몬스터의 방어율이 200이고, 유저의 방무가 20이라면, 몬스터의 방어율 200의 20%를 무시하게 되므로, 40만큼 무시하게 됩니다. 즉, 160이 유저가 체감하는 방어율 수치가 됩니다.

유저가 체감하는 몬스터의 방어율 수치가 100보다 크거나 같으면 몬스터에게 대미지를 줄 수 없습니다. 몬스터의 방어율 수치를 a, 유저의 방무를 b라고 할 때, 유저가 몬스터에게 대미지를 줄 수 있는지 없는지 알려주세요.

입력
첫 번째 줄에 정수 a와 b가 공백으로 구분되어 주어집니다.

출력
몬스터에게 대미지를 줄 수 있으면 1, 그렇지 않으면 0을 출력해 주세요.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> answer = new ArrayList<>();
        while (true){
            String str = scanner.nextLine();

            if(str.equals("#")){
                break;
            }
            int count=0;
            str = str.toLowerCase();
            for(int i=0; i<str.length(); i++){
                if('a'==str.charAt(i)){
                    count++;
                }else if('e'==str.charAt(i)){
                    count++;
                }else if('i'==str.charAt(i)){
                    count++;
                }else if('o'==str.charAt(i)){
                    count++;
                }else if('u'==str.charAt(i)){
                    count++;
                }

            }
            answer.add(count);

        }
        for (Integer integer : answer) {
            System.out.println(integer);

        }

    }
}
