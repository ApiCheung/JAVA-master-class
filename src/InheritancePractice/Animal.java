package InheritancePractice;

/**
 * @author Esmee Zhang
 * @date 6/13/20 2:05 下午
 * @projectName JAVA-master-class
 */
public class Animal {
    private int brain, body, size, weight;
    private String name;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("animal. eat called");

    }
    public void move(int speed){
        System.out.println("animal move is called anmial is moving at " + speed);

    }
}
