package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        // converter.convert(1);
        // convertUSD(converter, 1);

        // convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + " 원"), 1);

        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 2);

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        // 전달값이 2개인 경우?
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + " 원");
        c2.convert(10, 1400);

        // 반환값이 있는 경우?
        ConvertibleWithReturn c3 = (d, w) ->  d * w; // {return d * w;}; ({} 와 return 생략 가능)
        int result = c3.convert(20, 1400);
        System.out.println("20 달러 = " + result + " 원");
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}

// Convertible 은 함수형 인터페이스
// 함수형 인터페이스의 조건 : 추상 메소드가 딱 1개만 존재해야 함 (그래야 람다식과 1대1 로 대응함)
// +) 메소드(클래스 '안'에 정의된 기능) vs 함수(클래스 '밖'에 정의된 기능)