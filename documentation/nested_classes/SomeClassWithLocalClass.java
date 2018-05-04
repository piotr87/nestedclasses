package documentation.nested_classes;

/**
 * Created by piotr.rozek on 2018-05-02.
 */
public class SomeClassWithLocalClass {

    String field = "outerClass";

    static {
        class Do {

        }
    }

    public void doSomething() {
        class LocalClass {
            public String field;
            public static final String d = "";

            public void method() {
                System.out.println("method in local class" + field + SomeClassWithLocalClass.this.field);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.field = "localClass";
        localClass.method();
    }
}
