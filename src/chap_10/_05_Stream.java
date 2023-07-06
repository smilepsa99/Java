package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 (* stream : 흐르다)
        // 많은 데이터 (Collection Framework, 배열, 파일) 을 다룰 때, 데이터 가공을 편리하게 해주는 것
        //             ㄴ List, Set, Map
        // 원하는 조건에 따라 필터링을 돌려서 데이터를 걸러내거나, 데이터 중에서 내가 원하는 요소만 꺼내오도록 할 수 있음

        // ---------------------------------------------------------------------------------------------
        // 1. 스트림 생성
        // Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);


        // Collection.stream()
        List<String> langList = new ArrayList<>();
        // langList.add("python");
        // langList.add("java");
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        // 리스트객체 = Arrays.asList(값1, 값2, ...) : List 를 생성함과 동시에, 값을 정의할 수 있음
        // System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();


        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");
        // Stream.of(값1, 값2, ...) : 위 값들을 가지는 stream 을 바로 만들 수 있음

        // ---------------------------------------------------------------------------------------------
        // 2. 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip, ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90 점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        // Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println); // 이렇게 쓸 수도 있음
        System.out.println("----------------------------");

        // 90 점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count); // 3
        System.out.println("----------------------------");

        // 90 점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("----------------------------");

        // 90 점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("----------------------------");


        // "python", "java", "javascript", "c", "c++", "c#"
        // c 로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("----------------------------");

        // java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("----------------------------");

        // 4글자 이하의 언어를 정렬해서 출력
        // Arrays.stream(langs).filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        // System.out::println : 클래스(System.out) 에 있는 메소드(println) 를 이렇게 사용할 수 있음
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("----------------------------");

        // 4글자 이하의 언어 중에서, c 라는 글자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);
        System.out.println("----------------------------");

        // 4글자 이하의 언어 중에서, c 라는 글자를 포함하는 언어가 하나라도 있는지 여부 (anyMatch)
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch); // true
        System.out.println("----------------------------");

        // 4글자 이하의 언어들은 모두 c 라는 글자를 포함하는지 여부 (allMatch)
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch); // false
        System.out.println("----------------------------");

        // 4글자 이하의 언어 중에서, c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // map
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + " (어려워요)")
                .forEach(System.out::println);
        System.out.println("----------------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)  //(x -> x.toUpperCase())
                .forEach(System.out::println);
        System.out.println("----------------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)  //(x -> x.toUpperCase())
                .collect(Collectors.toList()); // 가공한 데이터들을 리스트로 만들어 반환

        langListStartsWithC.stream().forEach(System.out::println);


        // *주의
        // stream 은 한번 사용하고 나면 다시 사용할 수 없기 때문에, 매번 새롭게 만들어야 함
        // stream 을 사용한다고 해서, 원본 데이터가 훼손되지는 않음

        System.out.println("----------------------------");
        scoreStream.forEach(System.out::println);
        // scoreStream.forEach(System.out::println); // 오류 발생
    }
}
