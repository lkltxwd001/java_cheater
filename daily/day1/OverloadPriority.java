package day1;

public class OverloadPriority {
    public void show(int a) {
        System.out.println("int: " + a);
    }

    void show(long a) {
        System.out.println("long: " + a);
    }

    void show(Integer a) {
        System.out.println("Integer: " + a);
    }

    void show(int... a) {
        System.out.println("varargs: " + a.length);
    }

    void show(Number a) {
        System.out.println("Number");
    }
}
