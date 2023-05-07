package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        // 1차원 배열
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 2차원 배열로 선언하기
        // 3(세로) x 5(가로) 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // 2차원 배열에 있는 값에 접근하려면? : 배열명[세로 index][가로 index]
        // B2 에 접근하려면?
        System.out.println(seats[1][1]);

        // C5 에 접근하려면?
        System.out.println(seats[2][4]);

        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // A3에 접근하려면?
        System.out.println(seats2[0][2]);

        // A5에 접근하려면? (존재하지 않는 값에 접근하려 한다면?)
        // System.out.println(seats2[0][4]); => 오류발생

        // [참고] 3차원 배열
        // 3차원 배열 만들기 ① (배열 선언 & 값 넣기)
        // String[][][] arrayName = new String[][][] {
        //         { {}, {}, {} },
        //         { {}, {}, {} },
        //         { {}, {}, {} }
        // };

        // 3차원 배열 만들기 ② (배열 선언만 (세로 x 가로 x 높이))
        // String[][][] arrayName = new String[3][3][3]; // 우변 [] 안에 세로, 가로, 높이 넣어줘서 배열의 크기 정해줌

        // 3차원 배열에 있는 값에 접근하려면? : 배열명[세로 index][가로 index][높이 index]
        // System.out.println(arrayName[0][1][2]);
    }
}
