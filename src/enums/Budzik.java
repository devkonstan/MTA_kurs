package enums;

public class Budzik {

    public int obudzMnie(Dzien dzien) {

        if(dzien == Dzien.SOB || dzien == Dzien.NIEDZ)
            return 10;
        else
            return 7;

//        switch (dzien) {
//            case SOB:
//            case NIEDZ:
//                return 10;
//            default:
//                return 7;
//        }

    }
}
