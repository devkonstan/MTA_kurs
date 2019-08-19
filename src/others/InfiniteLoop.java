package others;

public class InfiniteLoop {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};

        for (int i = 0; ; i++) //petla nieskonczona
            System.out.println(ints[i]);
    }

}
