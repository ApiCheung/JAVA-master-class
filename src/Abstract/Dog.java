package Abstract;

/**
 * @author Esmee Zhang
 * @date 7/3/20 5:01 下午
 * @projectName JAVA-master-class
 */
public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is eating");

    }

    @Override
    public void breathe() {
        System.out.println("breath in, breathe out, repeat");
    }
}
