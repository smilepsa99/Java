package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : "같은" 자료형의 값 "여러 개"를 저장하는 연속된 공간
        // 변수(하나의 자료) vs 배열(여러개의 자료)

        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나"); // 아메리카노 하나
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요");

        // 배열 선언 1번째 방법
        // 자료형[] 배열이름 = new 자료형[개수];
        // String[] coffees = new String[4];
        // 크기 4개에 해당하는 String 배열을 만드는데, 이름은 coffees 로 선언해라

        // 배열 선언 2번째 방법 (좌변에서 [] 위치가 배열이름(coffees) 뒤에 있어도 됨)
        // String coffees[] = new String[4]

        // 배열에 값 넣기
        // coffees[0] = "아메리카노"; // 배열이름[index] = 데이터(값)
        // coffees[1] = "카페모카";
        // coffees[2] = "라떼";
        // coffees[3] = "카푸치노";

        // 배열 선언 3번째 방법 : 배열을 만듦과 동시에 배열의 값 초기화하기
        // String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 배열 선언 4번째 방법 : 3번째 방법에서 우변의 new String[] 생략 가능
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println("--------------------");

        // 커피 주문
        System.out.println(coffees[0] + " 하나");
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "에스프레소"; // 배열의 값 변경
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");
        System.out.println("주세요");


        // 문자열 외의 다른 자료형으로 배열 만들어보기
        int[] i =  new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};
        // 배열에 들어가는 자료형은, 배열을 선언할 때 쓴 자료형과 동일해야 함 주의!
    }
}
