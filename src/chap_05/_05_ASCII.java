package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 정보 교환을 위한 미국 표준 코드
        // https://ko.wikipedia.org/wiki/ASCII#%EC%B6%9C%EB%A0%A5_%EA%B0%80%EB%8A%A5_%EC%95%84%EC%8A%A4%ED%82%A4_%EB%AC%B8%EC%9E%90%ED%91%9C
        // 알파벳 대문자(A)는 65부터, 소문자(a)는 97부터, 숫자(0)는 48부터 시작

        char c = 'A';
        System.out.println(c); // A
        System.out.println((int)c); // 65

        c = 'B';
        System.out.println(c); // B
        System.out.println((int)c); // 66

        c++;
        System.out.println(c); // C
        System.out.println((int)c); // 67

        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        // 영화관 좌석번호 확인
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
