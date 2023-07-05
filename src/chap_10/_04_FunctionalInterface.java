package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.KRWConverter;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        // converter.convert(1);
        // convertUSD(converter, 1);

        // convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + " 원"), 1);

        Convertible convertible = (USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 1);
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}

// Convertible 은 함수형 인터페이스
// 함수형 인터페이스의 조건 : 추상 메소드가 딱 1개만 존재해야 함 (그래야 람다식과 1대1 로 대응함)
// +) 메소드(클래스 '안'에 정의된 기능) vs 함수(클래스 '밖'에 정의된 기능)