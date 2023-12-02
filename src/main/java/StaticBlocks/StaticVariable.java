package StaticBlocks;

public class StaticVariable {

    static int myStaticVar;

    static {
        myStaticVar = initializeStaticVar();
    }

    private static int initializeStaticVar() {
        // Complex initialization logic here
        return 42;
    }

    public static void main(String[] args) {
        System.out.println(myStaticVar);
    }
}
