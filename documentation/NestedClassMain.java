package documentation;

import documentation.nested_classes.SomeClassWithInnerClasses;
import documentation.nested_classes.SomeClassWithLocalClass;
import documentation.nested_classes.SomeClassWithStaticClasses;

/**
 * Created by piotr.rozek on 2018-05-02.
 */
public class NestedClassMain {

    public static void main(String [] args) {
        SomeClassWithStaticClasses someClassWithStaticClasses = new SomeClassWithStaticClasses();
        SomeClassWithStaticClasses.NestedStaticClass nestedClass = new SomeClassWithStaticClasses.NestedStaticClass();

        SomeClassWithInnerClasses someClassWithInnerClasses = new SomeClassWithInnerClasses();
        SomeClassWithInnerClasses.InnerClass innerClass = new SomeClassWithInnerClasses().new InnerClass();
        innerClass.setOutsideField("piotr");
        innerClass.someMethod();

        SomeClassWithInnerClasses someClassWithInnerClasses2 = new SomeClassWithInnerClasses();
        someClassWithInnerClasses2.setField1("jacek");
        System.out.println(someClassWithInnerClasses2.getField1());
        SomeClassWithInnerClasses.InnerClass innerClass2 = someClassWithInnerClasses2.new InnerClass();
        innerClass2.someMethod();
        innerClass2.setOutsideField("piotr");
        innerClass2.someMethod();
        System.out.println(someClassWithInnerClasses2.getField1());

        SomeClassWithLocalClass someClassWithLocalClass = new SomeClassWithLocalClass();
        someClassWithLocalClass.doSomething();
    }
}
