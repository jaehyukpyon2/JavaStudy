public class Test {

    public static void main(String[] args) {
        Parent p = new Child1();
        Child2 c2 = (Child2) p;
    }
}

class Parent {

}

class Child1 extends Parent {

}

class Child2 extends Parent {

}
