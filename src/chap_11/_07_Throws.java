package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    // throws
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결할게요.");
        }
//        try {
//            test();
//        } catch (ArithmeticException e) {
//            // e.printStackTrace();
//            System.out.println("모든 수는 0으로 나눌 수 없습니다.");
//        }
    }

    public static void writeFile() throws IOException {
        // try {
        //     FileWriter writer = new FileWriter("test.txt");
        //     throw new IOException("파일 쓰기에 실패했어요!!");
        // } catch (IOException e) {
        //     e.printStackTrace();
        //     System.out.println("writeFile 메소드 내에서 자체 해결했어요.");
        // }

        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패했어요!!");
    }

//    public static void test() throws ArithmeticException{
//        int i = 3 / 1;
//        throw new ArithmeticException("나누기에 실패했어요!!");
//    }
}
