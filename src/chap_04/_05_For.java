package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For

        // 나코 매장
        // System.out.println("어서오세요. 나코입니다.");
        // 또 다른 손님이 들어오면?
        // System.out.println("어서오세요. 나코입니다.");
        // System.out.println("어서오세요. 나코입니다.");
        // System.out.println("어서오세요. 나코입니다.");
        // System.out.println("어서오세요. 나코입니다.");
        // System.out.println("어서오세요. 나코입니다.");
        // System.out.println("어서오세요. 나코입니다.");
        // 만약에 인사법이 바뀌면?
        // System.out.println("환영합니다. 나코입니다.");
        // System.out.println("환영합니다. 나코입니다.");
        // System.out.println("환영합니다. 나코입니다.");
        // 매장 이름이 바뀌면? (나코 -> 코나)
        // System.out.println("환영합니다. 코나입니다.");
        // System.out.println("환영합니다. 코나입니다.");
        // System.out.println("환영합니다. 코나입니다.");

        // 반복문 사용 For (반복 횟수가 정해진 경우 주로 사용)
        // for ((값)선언 ; 조건 ; 증감) { ... 수행할 명령 ...}
        for (int i = 0 ; i < 10 ; i++) { // i 의 값을 0 이라고 선언하고, i 가 10 보다 작은 동안,
                                         // 아래 코드를 실행하고 그럴 때마다 i의 값을 증감해라
            System.out.println("어서오세요, 나코입니다." + i);
        }

        // 짝수만 출력 ([팁] fori 만 쓰고 엔터치면 for 문 틀 자동완성 됨)
        // 내 코드
        // for (int i = 0; i < 10; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i); // 02468 ([팁] 출력할 때 끝에 prinln 말고 print 쓰면 줄바꿈 없이 나옴)
        }

        System.out.println(); // 줄바꿈용 코드

        // 홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i); // 13579
        }

        System.out.println(); // 줄바꿈용 코드

        // 거꾸로 숫자 출력 (5, 4, 3, 2, 1)
        for (int i = 5; i > 0; i--) {
            System.out.print(i); // 54321
        }

        System.out.println(); // 줄바꿈용 코드

        // 1부터 10까지 수들의 합
        // 1 + 2 + ... + 10 = 55
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");

        // enhanced for (for-each) 반복문 : 배열(Array)이나 리스트(List)를 순회할 때 주로 사용
        // for (변수 : 배열) { ... 실행할 명령 ... }
    }
}
