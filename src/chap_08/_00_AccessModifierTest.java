package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
        // b1.resolution = "FHD"; // default (다른 패키지라서 접근 불가능)
        // b1.price = 200000; // private (해당 클래스 밖이라서  접근 불가능)
        // b1.color = "블랙"; // protected (다른 패키지이고, 자식 클래스가 아니라서 접근 불가능)
    }
}
