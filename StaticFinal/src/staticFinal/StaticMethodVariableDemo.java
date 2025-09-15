package staticFinal;
public class StaticMethodVariableDemo {
    static int staticCounter = 0;
    int instanceCounter = 0;

    public StaticMethodVariableDemo() {
        staticCounter++;
        instanceCounter++;
    }

    public static void showStaticCounter() {
        System.out.println("Static Counter: " + staticCounter);
    }

    public void showInstanceCounter() {
        System.out.println("Instance Counter: " + instanceCounter);
    }

    public static void main(String[] args) {
        StaticMethodVariableDemo obj1 = new StaticMethodVariableDemo();
        StaticMethodVariableDemo obj2 = new StaticMethodVariableDemo();
        StaticMethodVariableDemo obj3 = new StaticMethodVariableDemo();

        obj1.showInstanceCounter();
        obj2.showInstanceCounter();
        obj3.showInstanceCounter();

        StaticMethodVariableDemo.showStaticCounter();
    }
}

