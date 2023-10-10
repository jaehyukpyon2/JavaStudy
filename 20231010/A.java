public class A {

    private int varA;

    class B {
        private int varB;

        public void testB() {
            this.varB = A.this.varA;
        }
    }
}
