package others;

public class Generics<T> {
    private T t;

    public void set(T t) {

        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Generics<Integer> integerGenerics = new Generics<Integer>();
        integerGenerics.set(new Integer(10));
        integerGenerics.inspect(34); // error: this is still String!
    }
}