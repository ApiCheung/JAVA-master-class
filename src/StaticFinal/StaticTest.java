package StaticFinal;

/**
 * @author Esmee Zhang
 * @date 8/25/20 3:06 下午
 * @projectName JAVA-master-class
 */
public class StaticTest {
    private static int numInstances = 0;
    private String name;
    public StaticTest(String name){
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances(){
        return numInstances;

    }

    public String getName(){
        return name;
    }
}
