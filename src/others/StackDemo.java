package others;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")"); // wpycha na stos zdana liczbe
        System.out.println("stack: " + st); // pokazuje zawartosc stosu
    }
    static void showpop(Stack st) {
        Integer a = (Integer) st.pop();
        System.out.println("pop -> "+ a); // zdejmuje ze stosu ostatnia liczbe
        System.out.println("stack: " + st); // pokazuje zawartosc stosu
    }

    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>(); // stos bedacy pod spodem tablica
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}