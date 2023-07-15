package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf() // [팁] souf 로 자동완성 가능

        System.out.println("------- 정수 -------");
        // [코드 형식] System.out.printf("포맷", 값1, 값2, 값3, ...);

        // 정수 출력 (%d), 줄바꿈 (%n)  (* d 는 decimal integer(10진 정수 형식) 을 뜻함)
        System.out.printf("%d%n", 1); // 1
        System.out.printf("%d %d %d%n", 1, 2, 3); // 1 2 3

        // 공간확보 ( % + 빈공간 문자 + 확보공간 수 + d )
        System.out.printf("%d%n", 1234); // 1234
        System.out.printf("%6d%n", 1234); // ▯▯1234 (* %6d : 6만큼의 공간을 확보하고 나서, 정수 출력)
        System.out.printf("%06d%n", 1234); // 001234 (* %06d : 빈공간은 0으로, 6만큼의 공간을 확보하고 나서, 정수 출력)

        // 부호표시 ( % + '+' + 확보공간 수 + d )
        System.out.printf("%6d%n", -1234); // ▯-1234
        System.out.printf("%+6d%n", 1234); // ▯+1234

        // 숫자 세자리마다 콤마표시 ( % + , + 확보공간 수 + d )
        System.out.printf("%,15d%n", 1000000000); // ▯▯1,000,000,000

        // 왼쪽 정렬 ( % + '-' + 확보공간 수 + d )
        System.out.printf("%-6d%n", 1234); // 1234▯▯


        System.out.println("------- 실수 -------");

        // 실수 출력 (%f)  (* f 는 floating-point (부동 소수점 형식) 을 뜻함)
        System.out.printf("%f%n", Math.PI); // 3.141593

        // 소수점 몇번째 자리까지 출력 ( % + .숫자 + f )
        System.out.printf("%.2f%n", Math.PI); // 3.14

        // 공간확보 ( % + 공간확보 수 + .숫자 + f )
        System.out.printf("%6.2f%n", Math.PI); // ▯▯3.14

        // 왼쪽 정렬 ( % + '-' + 공간확보 수 + .숫자 + f )
        System.out.printf("%-6.2f%n", Math.PI); // 3.14▯▯

        // 빈공간 표시 ( % + 빈공간 문자 + 공간확보 수 + .숫자 + f )
        System.out.printf("%06.2f%n", Math.PI); // 003.14

        // 부호표시 ( % + '+' + 공간확보 수 + .숫자 + f )
        System.out.printf("%+6.2f%n", Math.PI); // ▯+3.14


        System.out.println("------- 문자열 -------");
        System.out.printf("%s%n", "Java"); // Java (%s : 일반 출력)
        System.out.printf("%6s%n", "Java"); // ▯▯Java (6자리 공간 확보 (우측정렬))
        System.out.printf("%-6s%n", "Java"); // Java▯▯ (6자리 공간 확보, 좌측정렬)

        // 몇번째 문자까지 출력 ( % + 공간확보 수 + .숫자 + s )
        System.out.printf("%6.2s%n", "Java"); // ▯▯▯▯Ja
        System.out.printf("%-6.2s%n", "Java"); // Ja▯▯▯▯


        System.out.println("------- 응용1 -------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0); // 강백호 90 80 85.0
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0); // 서태웅 100 100 100.0
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5); // 채치수 95 100 97.5

        System.out.println("------- 응용2 -------");
        System.out.println("이름      영어   수학   평균"); // 공백이 각각 6, 3, 3 칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 95, 100, 97.5);

        System.out.println("------- 참고 -------");
        // 같은 수의 글자를 출력해도, 한글과 영어는 각각 필요로 하는 칸의 크기가 다름
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
    }
}
