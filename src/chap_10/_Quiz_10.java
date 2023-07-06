package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _Quiz_10 {
    public static void main(String[] args) {
        List<Customer> customerList = Arrays.asList(
                new Customer("챈들러", 50),
                new Customer("레이첼", 42),
                new Customer("모니카", 21),
                new Customer("벤자민", 18),
                new Customer("제임스", 5)
        );

        // ArrayList<Customer> customerList2 = new ArrayList<>();
        // customerList2.add(new Customer("챈들러", 50));
        // customerList2.add(new Customer("레이첼", 42));
        // customerList2.add(new Customer("모니카", 21));
        // customerList2.add(new Customer("벤자민", 18));
        // customerList2.add(new Customer("제임스", 5));

        // // System.out.println(customerList.getClass().getName());
        // // System.out.println(customerList2.getClass().getName());

        System.out.println("미술과 입장료");
        System.out.println("----------------");
        customerList.stream()
                .filter(x -> x.age >= 20)
                .map(x -> x.name + " 5000원")
                .forEach(System.out::println);
        customerList.stream()
                .filter(x -> x.age < 20)
                .map(x -> x.name + " 무료")
                .forEach(System.out::println);


        // 삼항 연산자를 활용한 경우 (수업 힌트)
        System.out.println("----------------");
        customerList.stream()
                .map(x -> (x.age < 20) ? x.name + " 무료" : x.name + " 5000원")
                .forEach(System.out::println);
    }
}

class Customer {
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
