package others;

public class scopeTest {
    int test = 10;

    void printTest() {
        int test = 20;
        System.out.println(this.test); // odnosi sie do pola klasy
    }

    public static void main(String[] args) {
        scopeTest st = new scopeTest();
        st.printTest();
    }
}
