package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // for 반복문을 이용한 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        // 배열의 길이(배열명.length)를 이욯한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        // enhanced for (for-each) 반복문 : 배열(Array)이나 리스트(List)를 순회할 때 주로 사용
        for (String coffee : coffees) { // coffees 라는 배열에 있는 값들을 순서대로 순회하는데,
                                        // 그때그때 순회하는 값을 coffee 라는 변수에 넣어서 사용하겠다는 의미
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");

        // fori vs foreach
        // fori : 위치값(index)을 이용해서 배열의 요소 중 원하는 요소들만 순회 가능
        // foreach: 배열의 모든 요소를 처음부터 끝까지 순회함
    }
}
