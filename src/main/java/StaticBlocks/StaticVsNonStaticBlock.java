package StaticBlocks;

public class StaticVsNonStaticBlock {
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
    }

    public static void main(String[] args) {
        StaticVsNonStaticBlock test1 = new StaticVsNonStaticBlock();
        StaticVsNonStaticBlock test2 = new StaticVsNonStaticBlock();
    }
}
