package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백은 사용불가)
        // 3. 밑줄 또는 문자로 시작 가능(숫자로는 시작불가)
        // 4. 한 단어 또는 2개 이상의 단어의 연속으로 이름을 지음
        // 5. 소문자로 시작, 각 단어의 시작글자는 대문자(시작하는 첫 문자는 제외)
        // 6. 예악어 사용 불가 (public, static, void, int, double, float, ... 등등)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "현성"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "2001-12-31"; // 생년월일
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNumber = "KE657"; // 항공 편명
        String _flightNo = "KE657"; // 항공 편명(밑줄 시작)
        String flight_no_2 = "KE657"; // 항공 편명(밑줄과 숫자 포함)
        // String -flightNO = "KE657"; (변수에 - 은 사용불가)

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        String item1 = "시계";
        String item2 = "가방";
        // String 3item = "전자제품"; (변수는 숫자로 시작불가)

        // 프로그램의 흐름을 위해 사용되는 경우의 예시 (크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = "";
        String str = "";

        // 상수 : 변수와 달리 변하지 않음(수정 불가능), 키워드 final 을 맨앞에 붙이고 상수명은 대문자로 표기
        final String CODE = "KR";
    }
}
