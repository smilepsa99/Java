package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------");

        // 별 (*) 왼쪽 삼각형 만들기
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (i + 1); j++) {
            // for (int j = 0; j <= i; j++) {  로 쓸 수도 있음
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------");

        // 별 (*) 오른쪽 삼각형 만들기
        //     *
        //    **
        //   ***
        //  ****
        // *****

        // 내 답안
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 선생님 답안 : 내 코드보다 이해하기 더 쉽고 직관적임!
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (4-i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // [추가] x 에 숫자 넣은 만큼, 별 (*) 오른쪽 삼각형 만들기
        // int x = 5;
        // for (int i = 0; i < x; i++) {
        //     for (int j = (x-1); j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // [추가] 어쩌다가 만든 내 답
        // 참고한 코드 출처 : https://www.delftstack.com/ko/howto/java/multiply-strings-java/
        // for(int i = 1; i < 6; i++) {
        //     String str = new String(new char[i]).replace("\0", "*");
        //     System.out.println(String.format("%5s", str));
        //     }
    }
}
