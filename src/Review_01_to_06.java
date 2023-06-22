public class Review_01_to_06 {
    public static void main(String[] args) {
        // Quiz 01
//        String busNo = "상암08";
//        int time = 3;
//        double distance = 1.2;
//
//        System.out.println(busNo + "번 버스");
//        System.out.println("약 " + time + "분 후 도착");
//        System.out.println("남은 거리 " + distance + "km");

        // Quiz 02
//        int cm = 121;
//
//        String result = (cm >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
//        System.out.println("키가 " + cm + "cm 이므로 " + result);

        // Quiz 03
//        String jumin = "901231-1234567";
//        System.out.println(jumin.substring(0, jumin.indexOf("-") + 2));

        // [Chap 04] 08 NestedLoop
//        // 별 (*) 왼쪽 삼각형 만들기
//        // *
//        // **
//        // ***
//        // ****
//        // *****
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // 별 (*) 오른쪽 삼각형 만들기
//        //     *
//        //    **
//        //   ***
//        //  ****
//        // *****
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // [추가] x 에 숫자 넣은 만큼, 별 (*) 오른쪽 삼각형 만들기
//        int x = 10;
//
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < x - 1 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // [Chap 04] 09 MultipleTable
//        // 구구단
//        // 2 * 1 = 2
//        // 2 * 2 = 4
//        // 2 * 3 = 6
//        // ...
//        // 9 * 9 = 81
//
//        for (int i = 2; i < 10; i++) {
//            System.out.println(i + "단");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//            System.out.println();
//        }

        // Quiz 04
//        String type = "일반"; // 일반, 경차, 장애인
//        int time = 5;
//
//        int fee = time * 4000;
//        if (fee > 30000) {
//            fee = 30000;
//        }
//        if (type == "경차" || type == "장애인") {
//            fee /= 2;
//        }
//        System.out.println("주차 요금은 " + fee + " 원입니다.");

        // Quiz 05

    }
}
