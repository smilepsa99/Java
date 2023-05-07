package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        // 2차원 배열 순회 : for 문을 통한 이중반복문

        // 각 요소의 가로길이가 "같은" 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) { // 세로
            for (int j = 0; j < 5; j++) { // 가로
                System.out.print(seats[i][j] + " "); // A1 A2 A3 ...
            }
            System.out.println(); // 줄바꿈용 코드
        }

        // 각 요소의 가로길이가 "다른" 2차원 배열
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats.length; i++) { // seats.length -> 배열 seat2의 길이(=요소(세로줄)개수) = 3
            for (int j = 0; j < seats2[i].length; j++) { // seats2[i].length -> i 인덱스에 해당하는 요소의 길이
                System.out.print(seats2[i][j] + " "); // A1 A2 A3 ...
            }
            System.out.println(); // 줄바꿈용 코드
        }

        System.out.println("--------------------");

        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j + 1);
            }
        }

        // 표 구매
        seats3[7][8] = "__"; // H9
        seats3[7][9] = "___"; // H10

        // 영화관 좌석번호 확인
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
