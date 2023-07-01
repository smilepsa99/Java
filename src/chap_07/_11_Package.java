package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int 의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위): " + random.nextInt(10)); // 0 이상 10 '미만' 의 정수형 값 반환
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수 값 반환
        // System.out.println("랜덤 실수 (범위) : " + random.nextDouble(10.0)); 실수형은 범위는 따로 지정해줘야 함

        // 만약 5.0 이상 10.0 미만의 실수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble()));
        // min + (max - min) * random.nextDouble() = 5.0 + (10.0 - 5.0) * 랜덤숫자(0.0 이상 1.0 미만의 실수)

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        // 로또 번호(1 ~ 45 이하의 정수) 를 랜덤으로 뽑으려면?
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1));
        // nextInt(45) : 0 이상 45 미만의 수
        // nextInt(45) + 1 : 1 이상 46 미만의 수 = 1 이상 45 이하의 수

        // 자바 클래스 예시
        // Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        // BigInteger, BigDecimal
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, ... 등등
    }
}
