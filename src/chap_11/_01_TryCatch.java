package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 (에러 error, 예외 exception)
        // try {
        //     실행하려는 소스코드
        // } catch (Exception e) {
        //     위 코드 실행 중, 문제발생 시 처리할 내용
        // }

        // ㄴ 컴파일 오류(코드 문제로 프로그램 실행조차 안 되는 경우)
        // ㄴ int i = "문자열";

        // ㄴ 런타임 오류(컴파일은 되는데, 실행하는 과정에서 문제가 생기는 경우)
        // ㄴ int[] arr = new int[3];
        //    arr[5] = 100;

        try {
            // System.out.println(3 / 0);

            // int[] arr = new int[3];
            // arr[5] = 100;

            Object obj = "test";
            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace(); // 자세한 오류내용 보기
        }

        System.out.println("프로그램 정상 종료");
    }
}
