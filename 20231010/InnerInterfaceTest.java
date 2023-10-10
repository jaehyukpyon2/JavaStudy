public class InnerInterfaceTest {

    private int a;

    public interface Inner {
        void print();
    }
}

class Test2 implements InnerInterfaceTest.Inner {

    @Override
    public void print() {
        System.out.println("hello?");
    }
}
