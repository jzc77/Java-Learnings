package JUnit.jc;

// ClassA has a method that passes in ClassB and an int
public class ClassA {
    public int performOperation(ClassB classB, int data) {
        int processedData = classB.processData(data);
        return processedData + 5;
    }
}
