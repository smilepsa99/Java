package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // 메인 메소드 : 문자열을 여러개 가진 String 배열 (String[] args)을, 전달값으로 받는 메서드
        //             ㄴ args 라는 이름을 가진 String 배열 (* args = arguments, 인수)

        // 메뉴 Run -> Edit Configurations 에서 문자열 배열 args 에 인수를 넣어줄 수 있음
        // 1. + 눌러서 Application 생성
        // 2. Main class 에서 적용할 파일 선택(우측 끝 문서아이콘 클릭)
        // 3. Program arguments 에 원하는 인수 작성 (2개 이상의 값은 띄어쓰기로 구분)
        // => 작성한 인수는 문자열 배열 args 로 들어감

        for (String s : args) {
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납

        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            System.out.println("사용법) 1~3 메뉴 중 하나를 입력하세요.");
        }
    }
}
