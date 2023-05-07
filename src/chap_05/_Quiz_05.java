package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        String[] shoes = new String[10]; //

        // 신발 사이즈 배열 생성 : 굳이 문자열 배열로 만들 필요 없었음(서로 다른 자료형도 함께 출력 가능하기 때문)
        for (int i = 0; i < 10; i++) {
            shoes[i] = String.valueOf(250 + (5 * i));
        }

        // 신발 사이즈 확인
        for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 " + shoes[i] + " (재고 있음)");
        }

        // 선생님 답안
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }

//        // [추가] 신발 사이즈 재고 설정 추가
//
//        // 신발 사이즈 배열 생성
//        String[] shoes = new String[10];
//
//        for (int i = 0; i < 10; i++) {
//            shoes[i] = String.valueOf(250 + (5 * i));
//        }
//
//        // 신발 사이즈 재고상태 배열 생성
//        boolean[] isOnSale = new boolean[10];
//        for (int i = 0; i < 10; i++) {
//            isOnSale[i] = true;
//        }
//
//        // 신발 사이즈 재고상태 설정
//        int soldOut[] = {250, 270, 285}; // 품절된 신발 사이즈
//        for (int i = 0; i < soldOut.length; i++) {
//            int x = (soldOut[i]-250)/5;
//            isOnSale[x] = false;
//        }
//
//        // 신발 사이즈 확인
//        String stock = "";
//        for (int i = 0; i < 10; i++) {
//            if (isOnSale[i]) {
//                stock = " (재고 O)";
//            } else {
//                stock = " (재고 X)";
//            }
//            System.out.println("사이즈 " + String.valueOf(shoes[i]) + stock);
//        }
    }
}
