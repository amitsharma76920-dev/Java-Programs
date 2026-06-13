class A {
    private void show() {
        System.out.println("Hello amit");
    }

    void show1() {
        show();
    }
}

class B extends A {
    void show2() {
        show1();
    }
}

class Demo128 {
    public static void main(String[] args) {
        B b = new B();
        b.show2();
    }
}