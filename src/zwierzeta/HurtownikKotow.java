package zwierzeta;

public class HurtownikKotow {

    public Cat[][] dajKoty(int ile, DostawcaKotow[] dostawca) {
        Cat[][] koty = new Cat[dostawca.length][];

        int i = 0;
        for (DostawcaKotow dostawcaKotow : dostawca) {
            koty[i++] = dostawcaKotow.dajKoty(ile);
        }

        return koty;
    }

}
