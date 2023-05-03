interface InterfaceOne {
    public abstract void methodOne();
}
interface InterfaceTwo {
    public abstract void methodTwo();
}
class Inheritance implements InterfaceOne, InterfaceTwo {
    public void methodOne() {
        System.out.println("1");
    }
    public void methodTwo() {
        System.out.println("2");
    }
}
class test {
    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        i.methodOne();
        i.methodTwo();
    }
}