package others;

public class ContinueExample {
    public static void main(String[] args) {
        int[] ints = { 1, 2, 3, 4, 5, 6};
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
               continue;
                //jesli imod2=0 to zostaje w petli, a jak imod2=1 to wychodzi z niej i wyswietla liczbe
            }
            System.out.println(ints[i]);

        }
        System.out.println("after");
    }
}