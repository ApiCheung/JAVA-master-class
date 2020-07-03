package Abstract;

/**
 * @author Esmee Zhang
 * @date 7/3/20 5:11 下午
 * @projectName JAVA-master-class
 */
public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("fling freom branch to branch");
    }
}
