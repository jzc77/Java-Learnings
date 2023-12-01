package StaticBlocks;

public class Dog {
    static int age;

    static {
        age = 5;
        System.out.println("Static block has been called!");
    }

    public static void main(String[] args) {
        System.out.println(Dog.age);
    }
}
