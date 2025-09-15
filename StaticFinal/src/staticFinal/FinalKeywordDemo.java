package staticFinal;
public class FinalKeywordDemo {
    final int instanceFinalVariable;
    static final double PI = 3.14159;

    public FinalKeywordDemo(int value) {
        instanceFinalVariable = value;
    }

    public void showFinalVariable() {
        System.out.println("Instance Final Variable: " + instanceFinalVariable);
    }

    public static void showStaticFinal() {
        System.out.println("Static Final PI: " + PI);
    }

    public static void main(String[] args) {
        FinalKeywordDemo obj1 = new FinalKeywordDemo(10);
        FinalKeywordDemo obj2 = new FinalKeywordDemo(20);

        obj1.showFinalVariable();
        obj2.showFinalVariable();

        FinalKeywordDemo.showStaticFinal();
    }
}
