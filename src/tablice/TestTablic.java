package tablice;

public class TestTablic {

    public static void main(String[] args) {
        int[] tab1 = Producent.stworz(10);

        System.out.println("WSZYSTKIE Z PIERWSZEJ");
        for (int x : tab1) {
            System.out.println(x);
        }

//        int[] filtrowane = Wyszukiwacz.wyszukajWiekszeNiz(tab, 70);
//
//        System.out.println("WYFILTROWANE");
//        for (int x : filtrowane) {
//            System.out.println(x);
//        }

        System.out.println("*************");

        int[] tab2 = Producent.stworz(10);

        System.out.println("WSZYSTKIE Z DRUGIEJ");
        for (int x : tab2) {
            System.out.println(x);
        }

        System.out.println("*************");

        int[] wspolne = Wyszukiwacz.wyszukajWspolne(tab1, tab2);

    }
}
