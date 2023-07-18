package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        // try(BufferedWriter bw = new BufferedWriter(new FileWriter("saying.txt"))) {
        //     bw.write("세 살 __ 여든까지 간다");
        //     bw.newLine();
        //     bw.write("버릇");
        //     bw.newLine();
        //     bw.write("소 잃고 ___ 고친다");
        //     bw.newLine();
        //     bw.write("외양간");
        //     bw.newLine();
        //     bw.write("천 리 길도 한 __부터");
        //     bw.newLine();
        //     bw.write("걸음");
        // } catch (IOException e) {
        //     throw new RuntimeException(e);
        // }

        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시요. (주관식)");
        System.out.println("-----------------------------------------------");
        try(BufferedReader br = new BufferedReader(new FileReader("src/chap_13/saying.txt"))) {
            String line;
            Scanner sc = new Scanner(System.in);
            while ((line = br.readLine()) != null) {
                System.out.println("(문제) " + line);
                System.out.print(" 정답 입력 => ");
                String input = sc.next();
                if ((line = br.readLine()).equals(input)) {
                    System.out.println("정답입니다!!!");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + line + "입니다.");
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("모든 퀴즈가 완료되었습니다.\n수고하셨습니다. ^^");
    }
}
