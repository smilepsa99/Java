package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
//        String name; // name 이라는 문자열 변수 선언
//        name = "박상아";
        // 위의 두 줄을 아래처럼 한줄로 쓸 수도 있음
        String name = "박상아"; // name 이라는 문자열 변수 선언 후, 이 변수에 "박상아" 라는 문자열 값을 넣음
        int hour = 15; // int : 정수 자료형

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5; // double : 실수 자료형
        char grade  = 'A'; // char : 한가지 문자 자료형
        name = "강백호"; // 변수의 값 업데이트
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789; // double : 정밀한 실수 자료형 가능
        float f = 3.14123456789F; // float: 정밀한 실수 자료형 불가 (쓰려면 실수 끝에 F를 적어야 함)
        System.out.println(d); // 3.14123456789
        System.out.println(f); // 3.1412346 (double 에 비해 소수점 뒷자리를 다 못보여줌)

//      int i = 1000000000000; // int 는 ± 21억까지만 가능
        long l = 1000000000000L; // int 의 범위 밖의 정수는 long 을 쓰고, 숫자 뒤에 L을 적어야함
        l = 1_000_000_000_000L; // _ 를 넣어서 자릿수 나눠볼 수 있음
        System.out.println(l);

//      [총정리] 숫자 - 정수(± 21억 범위 안) : int
//                    정수(± 21억 범위 밖) : long
//                    실수(소수점 7자리 이내) : float
//                    실수(소수점 7자리 초과) : double
//              문자 - 한글자 이상 문자열 : String ("")
//                    한글자 문자       : char ('')

//              참/거짓 : boolean
    }
}
