package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스 :  다양한 타입의 객체를 지원하는 클래스/인터페이스/메소드 를 정의하는 방법
        // [코드] public static <T> void 클래스명(T t) {}

        Integer[] iArray = {1, 2, 3, 4, 5}; // Wrapper 클래스 활용 (int → Integer 로 바꿈)
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0}; // Wrapper 클래스 활용 (double → Double 로 바꿈)
        String[] sArray = {"A", "B","C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("--------------------");

        printAnyArray(iArray); // 제네릭스는 객체만 지원해서, 기본 자료형은 Wrapper 클래스를 통해서 사용해야 함
        printAnyArray(dArray); // *Wrapper 클래스 : 기본 자료형의 데이터를 객체로 포장해 주는 클래스
        printAnyArray(sArray);
    }

    // T : Type (이름은 원하는대로 정할 수 있음 → K(Key), V(Value), E(Element))
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }


    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d :
                dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s :
                sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
