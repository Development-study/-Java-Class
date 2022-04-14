package kr.hs.dgsw.java.dept23.d0407;

import java.util.Objects;
import java.util.Scanner;

public class FriendsFind {

    private String[] friends = {"정은서","강성훈","고용빈","기준","김민성","류지훈","박병관","박성한","박지건","박현우","손원","안찬","우상범","윤병훈","윤서준", "이승민", "이지호","최민재","한상빈"};

    public void inNumber(int num, FriendsFind f) {
        if (num > f.friends.length) {
            System.out.println("없는 번호입니다");
        }
        else {
            System.out.println(f.friends[num - 1]);
        }
    }

    public void inName(String name, FriendsFind f) {
        for (int i = 0; i < f.friends.length; i++) {
            if (name.equals(f.friends[i])) {
                System.out.println(f.friends[i]);
                return;
            }
        }
        System.out.println("없는 이름입니다");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FriendsFind f = new FriendsFind();

        System.out.println("이름을 입력하세요");
//        int num = scanner.nextInt();
        String name = scanner.next();

//        f.inNumber(num, f);
        f.inName(name, f);
    }

}
