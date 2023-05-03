package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // if Else 문을 이용 (여러 조건이나 범위에 해당하는 조건일 경우 사용)
        int ranking = 4; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용 (명확한 케이스가 있는 경우 사용)
        // switch ( expression(값을 기술한 것) ) {
        //    case A: ... 수행할 명령 ...
        //      break;
        //    case B: ... 수행할 명령 ...
        //      break;
        //    case C: ... 수행할 명령 ...
        //      break;
        //        ...
        //    default: ... 수행할 명령 ...
        // }

        ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break; // switch 문을 빠져나와라
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // case 2 와 3 을 통합
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2: // break 가 없으므로 아래 코드 실행
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가겨윽 책정 (1급 : 최상, 4급 : 최하)
        int grade = 1; // 등급
        int price = 7000; // 기본 가격
        switch (grade) {
            case 1:
                price += 1000; // price = price + 1000
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 제품의 가격 : 10000원
        // 2등급 제품의 가격 : 9000원
        // 3등급 제품의 가격 : 8000원

        // 조건문 사용 팁
        // if Else 문     : 여러 조건이나 범위에 해당하는 조건일 경우 사용 (ex. 시험 점수에 따른 등급 출력)
        // Switch Case 문 : 명확한 케이스가 있는 경우 사용(ex. 에러코드 번호에 따른 메세지 출력)

        // if Else 문 예시코드
        // int score = 95;
        // if (score >= 90) {
        //     System.out.println("A");
        // } else if (score >= 80) {
        //     System.out.println("B");
        // }

        // Switch Case 문 예시코드
        int errNo = 1;
        switch (errNo) {
            case 1:
                System.out.println("상품의 재고가 부족합니다");
                break;
            case 2:
                System.out.println("현재 영업 시간이 아닙니다");
                break;
        }
    }
}
