package Abstract;

/**
 * @author Esmee Zhang
 * @date 7/3/20 5:13 下午
 * @projectName JAVA-master-class
 */
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
