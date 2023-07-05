package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터 : List, Set, Map 과 같은 데이터를, 순회 및 관리하는 도구
        // ( *iterate : (컴퓨터 작업을) 반복하다 )

        // List 로 이터레이터 사용해보기
        List<String> list = new ArrayList<>();
        // List 로 ArrayList 선언 : ArrayList 는 List 라는 인터페이스를 구현(implements)하기 때문에, 다형성 활용가능
        // List<String> list2 = new LinkedList<>(); // 같은 이유로, List 로 LinkedList 도 선언 가능

        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        Iterator<String> it = list.iterator();
        // [팁] 반환형을 가지는 메소드일 경우, ctrl + alt + v 로 나머지 코드를 자동 작성할 수 있음

        // 이터레이터는 포인터를 맨앞으로 가져온 후, 차례대로 옮겨가며 작업을 처리함
        System.out.println(it.next()); // 유재석
        System.out.println(it.next()); // (알 수 없음)
        System.out.println(it.next()); // 김종국
        System.out.println(it.next()); // (알 수 없음)

        System.out.println("----------------------");

        // 순회
        it = list.iterator(); // 포인터(커서)를 처음 위치로 이동
        while (it.hasNext()) { // hasNext() : 포인터를 다음으로 옮겼을 때, 반환할 값이 있는지 확인
            System.out.println(it.next());
        }

        System.out.println("----------------------");

        // 삭제 (불필요한 데이터만)
        it = list.iterator(); // 포인터를 처음 위치로 이동
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove(); // 삭제
            }
        }
        // 삭제 후 순회
        it = list.iterator(); // 포인터를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------------------");
        // Set 도 이터레이터 사용 가능
        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();

        // Set 순회
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        System.out.println("----------------------");
        // Map 도 이터레이터 사용 가능하나, 별도의 코드 작업을 해줘야 함

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator() // 제공되지 않음

        // Map 의 Key 순회
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }

        System.out.println("----------------------");

        // Map 의 Value 순회
        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println("----------------------");

        // Map 의 Key,Value 순회
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
