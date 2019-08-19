package others;

public class LoopsExample {
    public static void main(String[] args) {
        A[] as = {new A(1), new A(2), new A(3)};
        for (A a : as) {
            a.value = a.value + 1;
        }

        for (A a : as) {
            System.out.println(a.value);
        }

        for (A a : as) {
            a = new A(10);
            System.out.println(a.value);
        }

    }
}

class A {
    int value;

    A(int foo) {

        this.value = foo;
    }
}
