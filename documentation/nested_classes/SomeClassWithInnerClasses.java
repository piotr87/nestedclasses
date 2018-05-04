package documentation.nested_classes;

/**
 * Created by piotr.rozek on 2018-05-02.
 */
public class SomeClassWithInnerClasses {

    private String field1;

    public void setField1(String value) {
        this.field1 = value;
    }

    public String getField1(){
        return this.field1;
    }

    public void getFieldFormNestedClass() {
        field1 = new InnerClass().innerField;
    }

    public class InnerClass {
        private String innerField;

        public void someMethod() {
            System.out.println(field1);
            //TODO
        }

        public void someMethod(SomeClassWithInnerClasses someClass) {
            System.out.println(someClass.field1);
            //TODO
        }

        public void setOutsideField(String newValue) {
            field1 = newValue;
        }
    }
}
