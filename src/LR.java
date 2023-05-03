interface LR {
    public abstract void sound();
    public abstract void sleep();
}
class Human implements LR {
    public void sound() {
        System.out.println("mmm...mmm...");
    }
    public void sleep() {
        System.out.println("zzz...zzz...");
    }
}
class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.sound();
        h.sleep();
    }
}