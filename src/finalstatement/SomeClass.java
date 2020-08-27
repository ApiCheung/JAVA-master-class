package finalstatement;

/**
 * @author Esmee Zhang
 * @date 8/27/20 1:39 下午
 * @projectName JAVA-master-class
 */
public class SomeClass {
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name){
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + "createdm instance is" + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
