package Abstract;

/**
 * @author Esmee Zhang
 * @date 7/3/20 4:59 下午
 * @projectName JAVA-master-class
 */
public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public abstract void eat();
    public abstract void breathe();

    public String getName(){
        return name;
    }
}
