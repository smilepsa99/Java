package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String jumin1 = "901231-1234567";
        String jumin2 = "030708-4567890";
        System.out.println(jumin1.substring(0,8));
        System.out.println(jumin2.substring(0,8));

        System.out.println(jumin1.substring(0,jumin1.indexOf("-")+2));
    }
}
