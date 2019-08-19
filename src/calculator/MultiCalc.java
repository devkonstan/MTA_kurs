package calculator;

public class MultiCalc extends SimpleCalc {
    public void calculate() { //przeslonieta metoda z klasy SimpleCalc
        value -= 3; //value=value-3
    }

    public void calculate(int multiplier) {
        calculate(); //metoda powyzej -3
        super.calculate(); //metoda z klasy SimpleCalc
        value *= multiplier; //value=value*multiplier 4*2
        System.out.println(value);
    }

    public static void main(String[] args) {
        MultiCalc mc = new MultiCalc();
        mc.calculate(2);
    }
}
