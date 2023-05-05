package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차요금 정산 프로그램 만들기

        // 내 답안
        String type = "일반"; // 주차 종류
        int time = 5; // 주차시간

        int cost = 4000 * time; // 주차요금
        if (cost > 30000) {cost = 30000;}
        if (type == "경차" || type == "장애인") {cost *= 0.5;}
        System.out.println("주차 요금은 " + cost + " 원입니다.");

        // 선생님 답안
        int hour = 10; // 주차 시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // 주차요금 (시간당 4000원 곱하기)

        // 30000 원 초과시 일일 최대 요금으로 수정
        if (fee > 30000) {fee = 30000;}

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {fee /= 2;}

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + " 원입니다.");
    }
}
