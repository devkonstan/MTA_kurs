package others;

import animals.Cat;

public class Zoo {


    public static void main(String[] args) {


        System.out.println("ile:" + Cat.ileKotow);

        Cat c1 = new Cat("Filemon");
//      c1.color = "aa";
        System.out.println("ile:" + Cat.ileKotow);

        Cat c2 = new Cat("Bonifacy", "Biały");
        System.out.println("ile:" + Cat.ileKotow);

        final Cat c3 = new Cat();
        c3.play();


        System.out.println("ile:" + Cat.ileKotow);

        System.out.println(Cat.ileMamyNog());




    }
}
