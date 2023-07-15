package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in);

        // System.out.println("이름을 입력하세요");
        // String name = sc.next();

        // System.out.println("혈액형을 입력하세요");
        // String bloodType = sc.next();

        // System.out.println("키를 입력하세요");
        // // int height = Integer.parseInt(sc.next()); // sc.next() 는 String 만 반환함
        // int height = sc.nextInt(); // int(정수형) 을 입력받음

        // System.out.println("몸무게를 입력하세요");
        // // double weight = Double.parseDouble(sc.next());
        // double weight = sc.nextDouble();

        // System.out.println("입력하신 정보는 다음과 같습니다.");
        // System.out.println("이름 : " + name);
        // System.out.println("혈액형 : " + bloodType);
        // System.out.println("키 : " + height);
        // System.out.println("몸무게 : " + weight);

        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.next(); // 한 단어 (ex. 자바, 파이썬)
        // ㄴ sc.next() 는 입력받은 한 줄을 띄어쓰기로 나눠서, (여러개의) 입력값으로 받음
        // String lang = sc.nextLine(); // 입력받은 한 줄을 하나의 입력값으로 받음
        System.out.println("언어 : " + lang);

        sc.nextLine(); // (입력한 줄의 첫번째 단어 외에) 불필요한 단어 삭제용 코드

        System.out.println("배우고 나니 기분이 어땠나요?");
        String feeling = sc.next(); // 한 문장 (ex. 재밌었어요)
        // String feeling = sc.nextLine();
        System.out.println("기분 : " + feeling);
    }
}
