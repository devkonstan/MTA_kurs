package others;

public class Counter {
    public static void main(String[] args) {
        int yearIn = 2016;
        int monthIn = 6;

        if (args.length > 0)
            monthIn = Integer.parseInt(args[0]);
        if (args.length > 1)
            yearIn = Integer.parseInt(args[1]);
        System.out.println(monthIn + "/" + yearIn);
    }

}
