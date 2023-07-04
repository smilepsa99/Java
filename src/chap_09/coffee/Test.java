package chap_09.coffee;

public class Test <T, V> {
    public T name;
    public V coffee;

    public Test(T name, V coffee) {
        this.name = name;
        this.coffee = coffee;
    }

    public void ready() {
        System.out.println(this.coffee + " 준비 완료 : " + this.name);
    }
}
