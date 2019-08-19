package primitiveTypes;

public class Typy {
    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = -128;



        short s = 0b010101;


        int i = 0x1A; //1=16 A=10 suma=26


        System.out.println(i);
        System.out.println(String.format("%x",i));

        int i2 = 021;

        System.out.println(i2);
        System.out.println(String.format("%x",i2));

        long l = 3434_343_434_34L;

        b1++;

        long x = b1;

        System.out.println(x);

        byte b3 = (byte)x;

        System.out.println(b3);

    }
}
