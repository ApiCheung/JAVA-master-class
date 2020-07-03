package Abstract;

/**
 * @author Esmee Zhang
 * @date 7/3/20 5:06 下午
 * @projectName JAVA-master-class
 */
public abstract class Bird extends Animal implements CanFly{
    public Bird(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + "breath in and out");
    }
//need to be abstract

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
