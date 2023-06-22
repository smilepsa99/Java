package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님 중에 노쇼 손님이 있다고 가정
        // For 문
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == noShow) { // 손님이 없다면? (noShow)
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 아래 코드를 실행하지 않고, 다음 반복으로 넘어감
            }
            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("--------------------------");

        // While 문
        sold = 0;
        int num = 1; // 손님 대기번호
        while (num <= 50) {
            System.out.println(num + "번 손님, 주문하신 치킨 나왔습니다.");
            if (num == noShow) {
                System.out.println(num + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                num++;
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            num++;
        }
        System.out.println("영업을 종료합니다.");

        // num++ 을 한번만 쓰려면?
        sold = 0;
        num = 0; // 손님 대기번호
        while (num < 50) { // while (ture) 무한루프를 써도 됨(아래에 반복문 탈출하는 조건이 정해져 있으니까)
            num++;
            System.out.println(num + "번 손님, 주문하신 치킨 나왔습니다.");
            if (num == noShow) {
                System.out.println(num + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

    }
}
