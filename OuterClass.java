public class OuterClass {

    private int outerVariable;

    public OuterClass(int value) {
        this.outerVariable = value;
    }

    public void outerMethod() {
        System.out.println("Outer method called.");
    }

    // Inner Class
    public class InnerClass {
        public void innerMethod() {
            System.out.println("Inner method called. Accessing outer variable: " + outerVariable);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.innerMethod();
    }
}
