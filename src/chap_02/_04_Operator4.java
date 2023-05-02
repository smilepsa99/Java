package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true 이면 true (|| : or)
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 true (&& : or)

        // And 연산
        System.out.println((5 > 3) && (3 > 1)); // true (5 는 3 보다 크고(참), 3 은 1 보다 크다(참))
        System.out.println((5 > 3) && (3 < 1)); // false (5 는 3 보다 크고(참), 3 은 1 보다 작다(거짓))

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // true (5 는 3 보다 크거나(참), 3 은 1 보다 크다(참))
        System.out.println((5 > 3) || (3 < 1)); // true (5 는 3 보다 크거나(참), 3 은 1 보다 작다(거짓))
        System.out.println((5 < 3) || (3 < 1)); // false (5 는 3 보다 작거나(거짓), 3 은 1 보다 작다(거짓))

        // System.out.println(1 < 3  <5); → 이렇게 연속으로 쓸 수 없음(불가능한 코드)
        System.out.println(1 < 3 && 3 < 5); // 이렇게 && 넣어서 써야 함

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println((!false)); // true
        System.out.println(!(5 == 5)); // false (5 는 5 와 같다 의 반대값)
        System.out.println(!(5 == 3)); // true (5 는 3 과 같다 의 반대값)
    }
}
