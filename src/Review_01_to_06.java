public class Review_01_to_06 {

    // Quiz 06 메소드
    public static String getHiddenData(String data, int index) {
        String open = data.substring(0, index);
        String hidden = "";
        for (int i = 0; i < data.length() - open.length(); i++) {
            hidden += "*";
        }
        return open + hidden;
    }
//    // [추가]
//    public static String secret(String data) {
//        String result = "";
//        switch (data.length()) {
//            case 2:
//            case 3:
//            case 4:
//                result = getHiddenData(data, 1);
//                break;
//            case 11:
//            case 12:
//            case 13:
//                result = getHiddenData(data, data.lastIndexOf("-") + 1);
//                break;
//            case 14:
//                result = getHiddenData(data, data.indexOf("-") + 2);
//        }
//        return result;
//    }
    public static void main(String[] args) {
//        [팁] 단축키 Ctrl + Alt + l : 코드 자동 정렬

        // Quiz 01
        String busNo = "상암08";
        int time = 3;
        double distance = 1.2;

        System.out.println(busNo + "번 버스");
        System.out.println("약 " + time + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");

        // Quiz 02
        int cm = 121;

        String result = (cm >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + cm + "cm 이므로 " + result);

        // Quiz 03
        String jumin = "901231-1234567";
        System.out.println(jumin.substring(0, jumin.indexOf("-") + 2));

//        // [Chap 04] 08 NestedLoop
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

//        // [Chap 04] 09 MultipleTable
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
        String type = "일반"; // 일반, 경차, 장애인
        int hour = 5;

        int fee = hour * 4000;
        if (fee > 30000) {
            fee = 30000;
        }
        if (type == "경차" || type == "장애인") {
            fee /= 2;
        }
        System.out.println("주차 요금은 " + fee + " 원입니다.");

        // Quiz 05
        int[] size = new int[10];
        for (int i = 0; i < 10; i++) {
            size[i] = 250 + (5 * i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 " + size[i] + " (재고 있음)");
        }
//        // [추가] 신발 사이즈 재고 설정 추가
//        // 답1
//        int shoes[][] = new int[2][10];
//        for (int i = 0; i < shoes[0].length; i++) {
//            shoes[0][i] = 250 + (5 * i);
//        }
//        for (int i = 0; i < shoes[1].length; i++) {
//            shoes[1][i] = 1;
//        }
//
//        // 품절 사이즈
//        int[] soldOut = {250, 270, 285};
//        for (int i = 0; i < soldOut.length; i++) {
//            for (int j = 0; j < shoes[0].length; j++) {
//                String x = String.valueOf(soldOut[i]);
//                String y = String.valueOf(shoes[0][j]);
//                if (x.equals(y)) {
//                    shoes[1][j] = 0;
//                }
//            }
//        }
//
//        String stock = "";
//        for (int i = 0; i < shoes[0].length; i++) {
//            if (shoes[1][i] == 1) {
//                stock = " (재고 O)";
//            } else if (shoes[1][i] == 0) {
//                stock = " (재고 X)";
//            }
//            System.out.println("사이즈 " + shoes[0][i] + stock);
//        }
//        // 답2
//        int minSize = 250;
//        int[] soldOut = {250, 270, 285};
//
//        int[] sizes = new int[10];
//        for (int i = 0; i < sizes.length; i++) {
//            sizes[i] = minSize + (5 * i);
//        }
//
//        boolean[] sold = new boolean[sizes.length];
//        Arrays.fill(sold, true);
//
//        for (int soldSize : soldOut) {
//            int index = (soldSize - sizes[0]) / 5;
//            sold[index] = false;
//        }
//
//        for (int i = 0; i < sizes.length; i++) {
//            if (sold[i]) {
//                System.out.println("사이즈 " + sizes[i] + " (재고 O)");
//            } else {
//                System.out.println("사이즈 " + sizes[i] + " (재고 X)");
//            }
//        }

        // Quiz 06
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));

//        // [추가] 시작 인덱스 없이, 정보를 하나의 인수로 받아서 비공개처리 하기
//        System.out.println();
//        System.out.println("이름 : " + secret(name));
//        System.out.println("주민등록번호 : " + secret(id));
//        System.out.println("전화번호 : " + secret(phone));
    }
}
