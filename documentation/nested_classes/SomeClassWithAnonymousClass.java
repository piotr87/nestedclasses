package documentation.nested_classes;

/**
 * Created by piotr.rozek on 2018-05-02.
 */
public class SomeClassWithAnonymousClass {

    interface Greeting {
        void hello();
    }

    public void sayHello() {
        Greeting greeting = new Greeting() {
            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };
    }

    public void sayCzesc() {
        Greeting greeting = new Greeting() {
            @Override
            public void hello() {
                System.out.println("czesc");
            }
        };
    }
}
