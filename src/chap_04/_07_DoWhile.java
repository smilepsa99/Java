package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m

        while (move + height< distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복문 #1 ---");

        // 키가 엄청나게 큰 사람이 수영을 하는 경우
        move = 0;
        height = 25; // 키 25m
        while (move + height< distance) { // 처음 반복부터 조건이 거짓이기 때문에, 반복문 내의 명령 실행 X
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복문 #2 ---");

        // Do While 반복문 (do {} 을 먼저 실행한 후, while () 의 조건이 참이면 do {} 또 실행)
        // do {
        //     ... 실행할 명령 ...
        // } while ( 조건 );
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");
    }
}
