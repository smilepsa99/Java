package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // List : ArrayList, LinkedList
        // 2) LinkedList (링크드 리스트)
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst()); // 첫번째 값
        System.out.println(list.getLast());  // 마지막 값

        System.out.println("----------------------");

        // (특정 위치에) 데이터 추가
        // 첫번째에 데이터 추가
        list.addFirst("서장훈");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        // 마지막에 데이터 추가
        list.addLast("김희철");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        // 원하는 위치(인덱스)에 데이터 추가
        System.out.println("학생 추가 전 (index 1) : " + list.get(1));
        list.add(1, "김영철");
        System.out.println("학생 추가 후 (index 1) : " + list.get(1));
        System.out.println("학생 추가 후 (index 2) : " + list.get(2));

        System.out.println("----------------------");

        // 데이터 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        System.out.println("----------------------");

        // 처음과 마지막 데이터 삭제 (처음 학생과 마지막 학생이 전학)
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("남은 학생 수 (전학 전) : " + list.size());
        list.removeFirst(); // 처음 데이터 삭제
        list.removeLast(); // 마지막 데이터 삭제
        System.out.println("남은 학생 수 (전학 후) : " + list.size());
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        // 데이터 변경 (수강권 양도)
        list.set(0, "이수근");
        System.out.println(list.get(0));

        System.out.println("----------------------");

        // 데이터 확인
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("----------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("----------------------");

        // (새로운 학기) 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list); // 정렬
        for (String s : list) {
            System.out.println(s);
        }
    }
}
