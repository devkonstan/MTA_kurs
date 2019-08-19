package others;

public class SynchroThreadsTest {
    public static void main(String[] args) {
        TestSynchro zadanie = new TestSynchro();
        Thread watek1 = new Thread(zadanie);
        Thread watek2 = new Thread(zadanie);
        watek1.start();
        watek2.start();
    }

    static class TestSynchro implements Runnable {
        private int stanKonta;

        public void run() { //jak dodam sycnhronized to jeden watek ruszy po drugim
            for (int i = 0; i < 50; i++) {
                inkrementuj();
                System.out.println(Thread.currentThread().getName() + " Stan konta wynosi: " + stanKonta);
            }
        }

        public void inkrementuj() {
            int i = stanKonta;
            stanKonta++;
        }
    }
}





