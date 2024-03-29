package others;

public class ArrayCopy {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[9];
        System.arraycopy(copyFrom, 2, copyTo, 2, 7);
        System.out.println(new String(copyTo));

        char[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo2));
    }
}

